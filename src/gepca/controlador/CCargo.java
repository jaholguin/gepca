package gepca.controlador;

/**
 *
 * @author JorgeAndres
 */
public class CCargo {
    
    String codCargo;
    String nombre;
    String grado;
    String sector;

   public CCargo() {
   }

   public CCargo(String codCargo, String nombre, String grado, String sector) {
       this.codCargo = codCargo;
       this.nombre = nombre;
       this.grado = grado;
       this.sector = sector;
   }
   
   public String getCodCargo() {
       return codCargo;
   }

   public void setCodCargo(String codCargo) {
       this.codCargo = codCargo;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public String getGrado() {
       return grado;
   }

   public void setGrado(String grado) {
       this.grado = grado;
   }
   
   public String getSector() {
       return sector;
   }

   public void setSector(String sector) {
       this.sector = sector;
   }
    
}
