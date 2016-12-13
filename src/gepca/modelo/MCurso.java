/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CCurso;
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
public class MCurso {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel consultarCursos(){
        DefaultTableModel modelo;
        String[] titulos = { "Cod. Curso", "Nombre", "Titulo" };
        String[] registro = new String[3];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT id_curso, nombreCurso, titulo from curso ORDER BY id_curso ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("id_curso");
                registro[1] = rs.getString("nombreCurso");
                registro[2] = rs.getString("titulo");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarCursos(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        sSQL = "SELECT id_curso from curso ORDER BY id_curso ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                modelo.addElement(rs.getObject("id_curso"));
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarCurso(String idCurso){
        DefaultTableModel modelo;
        String[] titulos = { "Cod. Curso", "Nombre", "Titulo" };
        String[] registro = new String[3];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT id_curso, nombreCurso, titulo from curso where id_curso='" + idCurso + "';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("id_curso");
                registro[1] = rs.getString("nombreCurso");
                registro[2] = rs.getString("titulo");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarCurso(CCurso curso){
        sSQL = "INSERT INTO curso (id_curso, nombreCurso, titulo)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, curso.getCodCurso());
            pst.setString(2, curso.getNombre());
            pst.setString(3, curso.getTitulo());
            
            int n = pst.executeUpdate();

            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "El id ingresado: " + curso.getCodCurso() + " ya se encuentra registrado.\n" + ex,"Registro de curso",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
    }
    
    public boolean editarCurso(CCurso curso){
        sSQL = "UPDATE curso SET nombreCurso=?, titulo=? WHERE id_curso=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, curso.getNombre());
            pst.setString(2, curso.getTitulo());
            pst.setString(3, curso.getCodCurso());
            
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
    
    public boolean eliminarCurso(String idCurso){
        
        sSQL = "DELETE FROM curso WHERE id_curso='" + idCurso + "'";

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
