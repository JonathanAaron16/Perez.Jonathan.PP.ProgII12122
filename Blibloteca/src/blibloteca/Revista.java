
package blibloteca;


public class Revista extends Publicacion{
    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, int anio) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    @Override
    public String toString() {
        return "Revista{" + "numeroEdicion=" + numeroEdicion + '}';
    }
    
    
    @Override
    public void leer() {
        System.out.println("leyendo revista");
    }
    
    
    
}
