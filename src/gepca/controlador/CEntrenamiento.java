package gepca.controlador;

import java.util.Date;

/**
 *
 * @author JorgeAndres
 */
public class CEntrenamiento {
    
    Date fechaInicio;
    Date fechaFin;
    String cedula;
    String matricula;
    String programa;
    String estado;

   public CEntrenamiento() {
   }

   public CEntrenamiento(Date fechaInicio, Date fechaFin, String cedula, String matricula, String programa, String estado) {
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
       this.cedula = cedula;
       this.matricula = matricula;
       this.programa = programa;
       this.estado = estado;
   }
   
   public Date getFechaInicio() {
       return fechaInicio;
   }

   public void setFechaInicio(Date fechaInicio) {
       this.fechaInicio = fechaInicio;
   }
   
   public Date getFechaFin() {
       return fechaFin;
   }

   public void setFechaFin(Date fechaFin) {
       this.fechaFin = fechaFin;
   }
   
   public String getCedula() {
       return cedula;
   }

   public void setCedula(String cedula) {
       this.cedula = cedula;
   }
   
   public String getMatricula() {
       return matricula;
   }

   public void setMatricula(String matricula) {
       this.matricula = matricula;
   }
   
   public String getPrograma() {
       return programa;
   }

   public void setPrograma(String programa) {
       this.programa = programa;
   }
   
   public String getEstado() {
       return estado;
   }

   public void setEstado(String estado) {
       this.estado = estado;
   }
    
}
