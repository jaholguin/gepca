/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CEntrenamiento;
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
public class MEntrenamiento {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public boolean insertarEntrenamiento(CEntrenamiento entrenamiento){
        sSQL = "INSERT INTO programa_ento (fechaInicio, fechaFinal, personal_num_cedula, capacitacion_id_matricula, programa_cod_programa, programa_entocol)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, entrenamiento.getFechaInicio().toString());
            pst.setString(2, entrenamiento.getFechaFin().toString());
            pst.setString(3, entrenamiento.getCedula());
            pst.setString(4, entrenamiento.getMatricula());
            pst.setString(5, entrenamiento.getPrograma());
            pst.setString(6, entrenamiento.getEstado());
            
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
    
    public DefaultTableModel consultarEntrenamientos(){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Id Programa", "Nombre Programa", "Id Curso", "Nombre Curso", "Fecha Inicio", "Fecha Fin", "Estado" };
        String[] registro = new String[10];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT PE.personal_num_cedula, P.nombre, P.apellido, PE.programa_cod_programa, PR.programa, CA.curso_id_curso, CU.nombreCurso, PE.fechaInicio, PE.fechaFinal, PE.programa_entocol from programa_ento PE "
                + "INNER JOIN personal P ON P.num_cedula=PE.personal_num_cedula "
                + "INNER JOIN programa PR ON PR.cod_programa=PE.programa_cod_programa "
                + "INNER JOIN capacitacion CA ON CA.id_matricula=PE.capacitacion_id_matricula "
                + "INNER JOIN curso CU ON CU.id_curso=CA.curso_id_curso "
                + "ORDER BY CA.personal_num_cedula1;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("programa_cod_programa");
                registro[4] = rs.getString("programa");
                registro[5] = rs.getString("curso_id_curso");
                registro[6] = rs.getString("nombreCurso");
                registro[7] = rs.getString("fechaInicio");
                registro[8] = rs.getString("fechaFinal");
                registro[9] = rs.getString("programa_entocol");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarUsuario(String idUsuario){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Id Programa", "Nombre Programa", "Id Curso", "Nombre Curso", "Fecha Inicio", "Fecha Fin" };
        String[] registro = new String[9];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT PE.personal_num_cedula, P.nombre, P.apellido, PE.programa_cod_programa, PR.programa, CA.curso_id_curso, CU.nombreCurso, PE.fechaInicio, PE.fechaFinal from programa_ento PE "
                + "INNER JOIN personal P ON P.num_cedula=PE.personal_num_cedula "
                + "INNER JOIN programa PR ON PR.cod_programa=PE.programa_cod_programa "
                + "INNER JOIN capacitacion CA ON CA.id_matricula=PE.capacitacion_id_matricula "
                + "INNER JOIN curso CU ON CU.id_curso=CA.curso_id_curso "
                + "WHERE PE.personal_num_cedula='" + idUsuario + "' ORDER BY PE.fechaInicio;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("personal_num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("programa_cod_programa");
                registro[4] = rs.getString("programa");
                registro[5] = rs.getString("curso_id_curso");
                registro[6] = rs.getString("nombreCurso");
                registro[7] = rs.getString("fechaInicio");
                registro[8] = rs.getString("fechaFinal");
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
