package gepca.controlador;

import java.util.Date;

/**
 *
 * @author JorgeAndres
 */
public class CCargoHis {
    
    String idCargoHis;
    String idCargo;
    String cedula;
    Date fechaInicio;

   public CCargoHis() {
   }

   public CCargoHis(String idCargo, String cedula, Date fechaInicio) {
       this.idCargo = idCargo;
       this.cedula = cedula;
       this.fechaInicio = fechaInicio;
   }
   
   public String getIdCargoHis() {
       return idCargoHis;
   }

   public void setIdCargoHis(String idCargoHis) {
       this.idCargoHis = idCargoHis;
   }

   public String getIdCargo() {
       return idCargo;
   }

   public void setIdCargo(String idCargo) {
       this.idCargo = idCargo;
   }
   
   public String getCedula() {
       return cedula;
   }

   public void setCedula(String cedula) {
       this.cedula = cedula;
   }
   
   public Date getFechaInicio() {
       return fechaInicio;
   }

   public void setFechaInicio(Date fechaInicio) {
       this.fechaInicio = fechaInicio;
   }
    
}
