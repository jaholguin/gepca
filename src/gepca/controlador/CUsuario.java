package gepca.controlador;

import java.util.Date;

/**
 *
 * @author JorgeAndres
 */
public class CUsuario {
    
    String cedula;
    String nombre;
    String apellido;
    String telefono;
    String correo;
    Date fechaIngreso;
    String perfil;
    String usuario;
    String password;
    String estado;

   public CUsuario() {
   }

   public CUsuario(String cedula, String nombre, String apellido, String telefono, String correo, Date fechaIngreso, String perfil, String usuario, String password, String estado) {
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.telefono = telefono;
       this.correo = correo;
       this.fechaIngreso = fechaIngreso;
       this.perfil = perfil;
       this.usuario = usuario;
       this.password = password;
       this.estado = estado;
   }
   
   public String getCedula() {
       return cedula;
   }

   public void setCedula(String cedula) {
       this.cedula = cedula;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public String getApellido() {
       return apellido;
   }

   public void setApellido(String apellido) {
       this.apellido = apellido;
   }
   
   public String getTelefono() {
       return telefono;
   }

   public void setTelefono(String telefono) {
       this.telefono = telefono;
   }
   
   public String getCorreo() {
       return correo;
   }

   public void setCorreo(String correo) {
       this.correo = correo;
   }
   
   public Date getFechaIngreso() {
       return fechaIngreso;
   }

   public void setFechaIngreso(Date fechaIngreso) {
       this.fechaIngreso = fechaIngreso;
   }
   
   public String getPerfil() {
       return perfil;
   }

   public void setPerfil(String perfil) {
       this.perfil = perfil;
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
