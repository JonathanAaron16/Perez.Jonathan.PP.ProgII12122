
package blibloteca;

// Excepción personalizada para cuando la publicación ya existe
public class PubicacionYaExisteException extends RuntimeException{
      private final static String MESSANGE ="ya exite la publicacion";
    
    public PubicacionYaExisteException() {
        super(MESSANGE);
    }
    
}
