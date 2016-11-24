package gepca.modelo;

import gepca.controlador.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JorgeAndres
 */
public class MPersonal {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel consultarUsuarios(){
        DefaultTableModel modelo;
        String[] titulos = {"Cédula", "Nombre", "Apellido", "Telefono", "Correo", "Fecha Ingreso"};
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT num_cedula,nombre,apellido,num_telefono,correo,fecha_ingreso from personal ORDER BY num_cedula ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("num_telefono");
                registro[4] = rs.getString("correo");
                registro[5] = rs.getString("fecha_ingreso");
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
