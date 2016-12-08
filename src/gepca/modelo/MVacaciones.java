/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CVacaciones;
import gepca.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author j-and
 */
public class MVacaciones {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public boolean insertarVacaciones(CVacaciones vacaciones){
        sSQL = "INSERT INTO vacaciones (fec_inicio, duracion, fec_fin, personal_num_cedula)"
                + "VALUES (?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, vacaciones.getFechaInicio().toString());
            pst.setString(2, vacaciones.getDuracion());
            pst.setString(3, vacaciones.getFechaFin().toString());
            pst.setString(4, vacaciones.getCedula());
            
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
