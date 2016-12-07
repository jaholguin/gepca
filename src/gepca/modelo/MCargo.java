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
import java.sql.Statement;
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
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
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
