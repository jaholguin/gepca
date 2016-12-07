package gepca.controlador;

/**
 *
 * @author JorgeAndres
 */
public class CPrograma {
    
    String codPrograma;
    String nombre;
    String duracion;

   public CPrograma() {
   }

   public CPrograma(String codPrograma, String nombre, String duracion) {
       this.codPrograma = codPrograma;
       this.nombre = nombre;
       this.duracion = duracion;
   }
   
   public String getCodPrograma() {
       return codPrograma;
   }

   public void setCodPrograma(String codPrograma) {
       this.codPrograma = codPrograma;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public String getDuracion() {
       return duracion;
   }

   public void setDuracion(String duracion) {
       this.duracion = duracion;
   }
    
}
