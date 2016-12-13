/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CCargo;
import gepca.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j-and
 */
public class MCargo {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel consultarCargos(){
        DefaultTableModel modelo;
        String[] titulos = { "Cod. Cargo", "Nombre", "Grado", "Sector" };
        String[] registro = new String[4];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT cod_cargo, cargo, grado, sector from cargo ORDER BY cod_cargo ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("cod_cargo");
                registro[1] = rs.getString("cargo");
                registro[2] = rs.getString("grado");
                registro[3] = rs.getString("sector");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarCargos(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        sSQL = "SELECT cod_cargo from cargo ORDER BY cod_cargo ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                modelo.addElement(rs.getObject("cod_cargo"));
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel consultarCargosHis(){
        DefaultTableModel modelo;
        String[] titulos = { "Cédula", "Nombre", "Apellido", "Cod. Cargo", "Cargo", "Fecha Cargo" };
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT CH.personal_num_cedula, P.nombre, P.apellido, CH.cargo_cod_cargo, CA.cargo, CH.fec_cargo from cargo_his CH "
                + "INNER JOIN personal P ON P.num_cedula=CH.personal_num_cedula "
                + "INNER JOIN cargo CA ON CA.cod_cargo=CH.cargo_cod_cargo "
                + "ORDER BY CH.personal_num_cedula;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("cargo_cod_cargo");
                registro[4] = rs.getString("cargo");
                registro[5] = rs.getString("fec_cargo");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarCargo(String idCargo){
        DefaultTableModel modelo;
        String[] titulos = { "Cod. Cargo", "Nombre", "Grado", "Sector" };
        String[] registro = new String[4];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT cod_cargo, cargo, grado, sector from cargo where cod_cargo='" + idCargo + "';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("cod_cargo");
                registro[1] = rs.getString("cargo");
                registro[2] = rs.getString("grado");
                registro[3] = rs.getString("sector");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarUsuarioCargoHis(String idUsuario){
        DefaultTableModel modelo;
        String[] titulos = { "Cédula", "Nombre", "Apellido", "Cod. Cargo", "Cargo", "Fecha Cargo" };
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT CH.personal_num_cedula, P.nombre, P.apellido, CH.cargo_cod_cargo, CA.cargo, CH.fec_cargo from cargo_his CH "
                + "INNER JOIN personal P ON P.num_cedula=CH.personal_num_cedula "
                + "INNER JOIN cargo CA ON CA.cod_cargo=CH.cargo_cod_cargo "
                + "WHERE CH.personal_num_cedula='" + idUsuario + "' ORDER BY CH.personal_num_cedula;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("cargo_cod_cargo");
                registro[4] = rs.getString("cargo");
                registro[5] = rs.getString("fec_cargo");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarCargo(CCargo cargo){
        sSQL = "INSERT INTO cargo (cod_cargo, cargo, grado, sector)"
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, cargo.getCodCargo());
            pst.setString(2, cargo.getNombre());
            pst.setString(3, cargo.getGrado());
            pst.setString(4, cargo.getSector());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El id ingresado: " + cargo.getCodCargo() + " ya se encuentra registrado.\n" + ex,"Registro de cargo",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public boolean editarCargo(CCargo cargo){
        sSQL = "UPDATE cargo SET cargo=?, grado=?, sector=? WHERE cod_cargo=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, cargo.getNombre());
            pst.setString(2, cargo.getGrado());
            pst.setString(3, cargo.getSector());
            pst.setString(4, cargo.getCodCargo());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
    public boolean eliminarCargo(String idCargo){
        
        sSQL = "DELETE FROM cargo WHERE cod_cargo='" + idCargo + "'";

        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return false;
        }
    }
    
}
