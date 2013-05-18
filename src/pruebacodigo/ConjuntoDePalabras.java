
package pruebacodigo;
// Prueba de Git
public class ConjuntoDePalabras {
    
    private String[] lista;
    private int tamano;

    public ConjuntoDePalabras() {
        this.tamano = 0;
    }
    
    public boolean comparaConjuntos(ConjuntoDePalabras conjunto1, ConjuntoDePalabras conjunto2){
        return conjunto1.lista.equals(conjunto2.lista);
    }
    
    public void obtenerConjunto(String texto){
        this.lista = texto.split("[ .,:;?!]+");
        this.tamano = this.lista.length;
    }
}
