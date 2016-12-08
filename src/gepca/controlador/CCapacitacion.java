package gepca.controlador;

/**
 *
 * @author JorgeAndres
 */
public class CCapacitacion {
    
    String idMatricula;
    String idCurso;
    String puntaje;
    String cedula;

   public CCapacitacion() {
   }

   public CCapacitacion(String idCurso, String puntaje, String cedula) {
       this.idCurso = idCurso;
       this.puntaje = puntaje;
       this.cedula = cedula;
   }
   
   public String getIdMatricula() {
       return idMatricula;
   }

   public void setIdMatricula(String idMatricula) {
       this.idMatricula = idMatricula;
   }

   public String getIdCurso() {
       return idCurso;
   }

   public void setIdCurso(String idCurso) {
       this.idCurso = idCurso;
   }
   
   public String getPuntaje() {
       return puntaje;
   }

   public void setPuntaje(String puntaje) {
       this.puntaje = puntaje;
   }
   
   public String getCedula() {
       return cedula;
   }

   public void setCedula(String cedula) {
       this.cedula = cedula;
   }
    
}
