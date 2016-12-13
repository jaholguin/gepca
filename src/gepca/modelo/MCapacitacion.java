/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CCapacitacion;
import gepca.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author j-and
 */
public class MCapacitacion {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public boolean insertarCapacitacion(CCapacitacion capacitacion){
        sSQL = "INSERT INTO capacitacion (curso_id_curso, puntaje, personal_num_cedula1)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, capacitacion.getIdCurso());
            pst.setString(2, capacitacion.getPuntaje());
            pst.setString(3, capacitacion.getCedula());
            
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
    
    public DefaultTableModel consultarCapacitaciones(){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Id Curso", "Nombre Curso", "Puntaje" };
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT CA.personal_num_cedula1, P.nombre, P.apellido, CA.curso_id_curso, CU.nombreCurso, CA.puntaje from capacitacion CA "
                + "INNER JOIN personal P ON P.num_cedula=CA.personal_num_cedula1 "
                + "INNER JOIN curso CU ON CU.id_curso=CA.curso_id_curso "
                + "ORDER BY CA.personal_num_cedula1;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula1");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("curso_id_curso");
                registro[4] = rs.getString("nombreCurso");
                registro[5] = rs.getString("puntaje");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarMatriculas(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        sSQL = "SELECT id_matricula from capacitacion ORDER BY id_matricula ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                modelo.addElement(rs.getObject("id_matricula"));
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarUsuario(String idUsuario){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Id Curso", "Nombre Curso", "Puntaje" };
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT CA.personal_num_cedula1, P.nombre, P.apellido, CA.curso_id_curso, CU.nombreCurso, CA.puntaje from capacitacion CA "
                + "INNER JOIN personal P ON P.num_cedula=CA.personal_num_cedula1 "
                + "INNER JOIN curso CU ON CU.id_curso=CA.curso_id_curso "
                + "WHERE CA.personal_num_cedula1='" + idUsuario + "' ORDER BY CA.curso_id_curso;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula1");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("curso_id_curso");
                registro[4] = rs.getString("nombreCurso");
                registro[5] = rs.getString("puntaje");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
}
