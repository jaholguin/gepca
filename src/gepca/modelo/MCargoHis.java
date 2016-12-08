/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gepca.modelo;

import gepca.controlador.CCargoHis;
import gepca.controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author j-and
 */
public class MCargoHis {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public boolean insertarCargoHis(CCargoHis cargoHis){
        sSQL = "INSERT INTO cargo_his (cargo_cod_cargo, personal_num_cedula, fec_cargo)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, cargoHis.getIdCargo());
            pst.setString(2, cargoHis.getCedula());
            pst.setString(3, cargoHis.getFechaInicio().toString());
            
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
