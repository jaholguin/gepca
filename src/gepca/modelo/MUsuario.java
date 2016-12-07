package gepca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gepca.controlador.CUsuario;
import gepca.controlador.Conexion;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author JorgeAndres
 */
public class MUsuario {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel login(String perfil, String usr,String password) {
    	DefaultTableModel modelo;
        String[] titulos = {"Cedula", "Perfil", "Nombre", "Usuario", "Clave", "Estado"};
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT num_cedula, perfil, nombre, usuario, clave, estado from personal WHERE perfil='" + perfil + "' and usuario='"
                + usr + "' and clave='" + password + "' and estado='Activo'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("num_cedula");
                registro[1] = rs.getString("perfil");
                registro[2] = rs.getString("nombre");
                registro[3] = rs.getString("usuario");
                registro[4] = rs.getString("clave");
                registro[5] = rs.getString("estado");
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel consultarUsuarios(){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Telefono", "Correo", "Fecha Ingreso", "Perfil", "Usuario", "Clave", "Estado"};
        String[] registro = new String[10];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT num_cedula, nombre, apellido, num_telefono, correo, fec_ingreso, perfil, usuario, clave, estado from personal ORDER BY perfil ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("num_telefono");
                registro[4] = rs.getString("correo");
                registro[5] = rs.getString("fec_ingreso");
                registro[6] = rs.getString("perfil");
                registro[7] = rs.getString("usuario");
                registro[8] = rs.getString("clave");
                registro[9] = rs.getString("estado");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultComboBoxModel cargarUsuarios(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        sSQL = "SELECT num_cedula from personal ORDER BY num_cedula ASC;";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                modelo.addElement(rs.getObject("num_cedula"));
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel buscarUsuario(String idUsuario){
        DefaultTableModel modelo;
        String[] titulos = { "Cedula", "Nombre", "Apellido", "Telefono", "Correo", "Fecha Ingreso", "Perfil", "Usuario", "Clave", "Estado"};
        String[] registro = new String[10];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT num_cedula, nombre, apellido, num_telefono, correo, fec_ingreso, perfil, usuario, clave, estado from personal where num_cedula='" + idUsuario + "';";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("num_cedula");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("num_telefono");
                registro[4] = rs.getString("correo");
                registro[5] = rs.getString("fec_ingreso");
                registro[6] = rs.getString("perfil");
                registro[7] = rs.getString("usuario");
                registro[8] = rs.getString("clave");
                registro[9] = rs.getString("estado");
                totalregistros += 1;
                modelo.addRow(registro);
            }
            return modelo;
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    
    public boolean insertarUsuario(CUsuario usuario){
        sSQL = "INSERT INTO personal (num_cedula, nombre, apellido, num_telefono, correo, fec_ingreso, perfil, usuario, clave, estado)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, usuario.getCedula());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getApellido());
            pst.setString(4, usuario.getTelefono());
            pst.setString(5, usuario.getCorreo());
            pst.setString(6, usuario.getFechaIngreso().toString());
            pst.setString(7, usuario.getPerfil());
            pst.setString(8, usuario.getUsuario());
            pst.setString(9, usuario.getPassword());
            pst.setString(10, usuario.getEstado());
            
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
    
    public boolean editarUsuario(CUsuario usuario){
        sSQL = "UPDATE personal SET nombre=?, apellido=?, num_telefono=?, correo=?, fec_ingreso=?, perfil=?, usuario=?, clave=?, estado=? WHERE num_cedula=?";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);
            
            pst.setString(1, usuario.getNombre());
            pst.setString(2, usuario.getApellido());
            pst.setString(3, usuario.getTelefono());
            pst.setString(4, usuario.getCorreo());
            pst.setString(5, usuario.getFechaIngreso().toString());
            pst.setString(6, usuario.getPerfil());
            pst.setString(7, usuario.getUsuario());
            pst.setString(8, usuario.getPassword());
            pst.setString(9, usuario.getEstado());
            pst.setString(10, usuario.getCedula());
            
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
    
    public boolean eliminarUsuario(String idUsr){
        
        sSQL = "DELETE FROM personal WHERE num_cedula='" + idUsr + "'";

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
