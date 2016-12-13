/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CPrograma;
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
public class MPrograma {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel consultarProgramas(){
        DefaultTableModel modelo;
        String[] titulos = { "Cod. Programa", "Nombre", "Duración" };
        String[] registro = new String[3];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT cod_programa, programa, duracion from programa ORDER BY cod_programa ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("cod_programa");
                registro[1] = rs.getString("programa");
                registro[2] = rs.getString("duracion");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarProgramas(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        sSQL = "SELECT cod_programa from programa ORDER BY cod_programa ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                modelo.addElement(rs.getObject("cod_programa"));
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarPrograma(String idPrograma){
        DefaultTableModel modelo;
        String[] duracions = { "Cod. Programa", "Nombre", "Duración" };
        String[] registro = new String[3];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, duracions);
        sSQL = "SELECT cod_programa, programa, duracion from programa where cod_programa='" + idPrograma + "';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("cod_programa");
                registro[1] = rs.getString("programa");
                registro[2] = rs.getString("duracion");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarPrograma(CPrograma programa){
        sSQL = "INSERT INTO programa (cod_programa, programa, duracion)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, programa.getCodPrograma());
            pst.setString(2, programa.getNombre());
            pst.setString(3, programa.getDuracion());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El id ingresado: " + programa.getCodPrograma() + " ya se encuentra registrado.\n" + ex,"Registro de programa",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public boolean editarPrograma(CPrograma programa){
        sSQL = "UPDATE programa SET programa=?, duracion=? WHERE cod_programa=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, programa.getNombre());
            pst.setString(2, programa.getDuracion());
            pst.setString(3, programa.getCodPrograma());
            
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
    
    public boolean eliminarPrograma(String idPrograma){
        
        sSQL = "DELETE FROM programa WHERE cod_programa='" + idPrograma + "'";

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
