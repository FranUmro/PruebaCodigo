
package pruebacodigo;
// Prueba de Git
public class ConjuntoDePalabras {
    
    private String[] lista;
    private int tamano;

    public ConjuntoDePalabras() {
        this.tamano = 0;
    }
    
    public ConjuntoDePalabras obtenPalabrasRepetidas(ConjuntoDePalabras conjunto1, ConjuntoDePalabras conjunto2){
        String resultado = "";
        ConjuntoDePalabras conjuntoresultante = new ConjuntoDePalabras();
        conjuntoresultante.obtenerConjunto(resultado);
        for (int i = 0; i < conjunto1.tamano; i++){
            for (int j = 0; j < conjunto2.tamano; j++){
                if (conjunto1.lista[i].equals(conjunto2.lista[j])){
                    if (!(conjuntoresultante.existePalabra(conjunto2.lista[j])))
                    resultado = resultado + " " + conjunto1.lista[i];
                    conjuntoresultante.obtenerConjunto(resultado);
                }
            }
        }
        return conjuntoresultante;
    }
    
    public boolean existePalabra(String palabra){
        for (int i = 0; i < this.tamano; i++){
            if (this.lista[i].equals(palabra)) return true;
        }
        return false;
    }
    public void obtenerConjunto(String texto){
        this.lista = texto.split("[ .,:;?!]+");
        this.tamano = this.lista.length;
    }
    public void imprimirPantalla(){
        for (int i = 0; i < this.tamano; i++){
            System.out.println(this.lista[i]);
        }
        
    }
}
