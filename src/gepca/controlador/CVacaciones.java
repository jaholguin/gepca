package gepca.controlador;

import java.util.Date;

/**
 *
 * @author JorgeAndres
 */
public class CVacaciones {
    
    Date fechaInicio;
    String duracion;
    Date fechaFin;
    String cedula;

   public CVacaciones() {
   }

   public CVacaciones(Date fechaInicio, String duracion, Date fechaFin, String cedula) {
       this.fechaInicio = fechaInicio;
       this.duracion = duracion;
       this.fechaFin = fechaFin;
       this.cedula = cedula;
   }
   
   public Date getFechaInicio() {
       return fechaInicio;
   }

   public void setFechaInicio(Date fechaInicio) {
       this.fechaInicio = fechaInicio;
   }

   public String getDuracion() {
       return duracion;
   }

   public void setDuracion(String duracion) {
       this.duracion = duracion;
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
    
}
