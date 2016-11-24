package gepca.controlador;

/**
 *
 * @author JorgeAndres
 */
public class CUsuario {
    
    String perfil;
    String nombre;
    String usuario;
    String password;
    String estado;

   public CUsuario() {
   }

   public CUsuario(String perfil,String nombre, String usuario, String password, String estado) {
       this.perfil = perfil;
       this.nombre = nombre;
       this.usuario = usuario;
       this.password = password;
       this.estado = estado;
   }
   
   public String getPerfil() {
       return perfil;
   }

   public void setPerfil(String perfil) {
       this.perfil = perfil;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public String getUsuario() {
       return usuario;
   }

   public void setUsuario(String usuario) {
       this.usuario = usuario;
   }

   public String getPassword() {
       return password;
   }

   public void setPassword(String password) {
       this.password = password;
   }

   public String getEstado() {
       return estado;
   }

   public void setEstado(String estado) {
       this.estado = estado;
   }
    
}
