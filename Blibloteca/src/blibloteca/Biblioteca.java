
package blibloteca;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    
    private List<Publicacion> publicaciones;

    public Biblioteca() {
       publicaciones =new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion nuevaPubli ) {
         // Verificar si ya existe la publicación
        if (publicaciones.contains(nuevaPubli)) {
            throw new PubicacionYaExisteException();
        }
        // Si no existe, agregar la nueva publicación
        publicaciones.add(nuevaPubli);
    }
    
    
    public void mostrarPublicaciones() {
        for (Publicacion publi: publicaciones){
                System.out.println(publi);
            }
        }

    public void leerPublicaciones() {
    for (Publicacion publicacion : publicaciones) {
        if (publicacion instanceof Libro || publicacion instanceof Revista) {
            // Si es un Libro o Revista, se puede leer
            publicacion.leer();
        } else {
            // Informar que no se puede leer
            System.out.println("La publicación " + publicacion.getTitulo() + " no es leíble.");
        }
    }
}

}
