package gepca.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import gepca.controlador.CUsuario;
import gepca.controlador.Conexion;

/**
 *
 * @author JorgeAndres
 */
public class MUsuario {
    
    private Conexion mysql = new Conexion();
    private Connection cn = mysql.conectar();
    private String sSQL = "";
    public Integer totalregistros;
    
    public DefaultTableModel login(String usr,String password) {
    	DefaultTableModel modelo;
        String[] titulos = {"ID", "Perfil", "Nombre", "Usuario", "Clave", "Estado"};
        String[] registro = new String[6];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT idusuario, perfil, nombre, usuario, clave, estado from usuarios WHERE usuario='"
                + usr + "' and clave='" + password + "' and estado='Activo'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("idusuario");
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
        String[] titulos = {"Perfil", "Nombre", "Usuario", "Clave", "Estado"};
        String[] registro = new String[5];
        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);
        sSQL = "SELECT perfil,nombre,usuario,clave,estado from usuarios ORDER BY perfil ASC";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sSQL);
            while (rs.next()) {
                registro[0] = rs.getString("perfil");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("usuario");
                registro[3] = rs.getString("clave");
                registro[4] = rs.getString("estado");
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
        sSQL = "INSERT INTO usuarios (perfil,nombre,usuario,clave,estado)"
                + "VALUES (?,?,?,?,?)";
        try {
            PreparedStatement pst = cn.prepareStatement(sSQL);

            pst.setString(1, usuario.getPerfil());
            pst.setString(2, usuario.getNombre());
            pst.setString(3, usuario.getUsuario());
            pst.setString(4, usuario.getPassword());
            pst.setString(5, usuario.getEstado());
            
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
    
    public boolean eliminarUsuario(String usr){
        
        sSQL = "DELETE FROM usuarios WHERE usuario='" + usr + "'";

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
