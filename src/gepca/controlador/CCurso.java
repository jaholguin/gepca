package gepca.controlador;

/**
 *
 * @author JorgeAndres
 */
public class CCurso {
    
    String codCurso;
    String nombre;
    String titulo;

   public CCurso() {
   }

   public CCurso(String codCurso, String nombre, String titulo) {
       this.codCurso = codCurso;
       this.nombre = nombre;
       this.titulo = titulo;
   }
   
   public String getCodCurso() {
       return codCurso;
   }

   public void setCodCurso(String codCurso) {
       this.codCurso = codCurso;
   }

   public String getNombre() {
       return nombre;
   }

   public void setNombre(String nombre) {
       this.nombre = nombre;
   }
   
   public String getTitulo() {
       return titulo;
   }

   public void setTitulo(String titulo) {
       this.titulo = titulo;
   }
    
}
