package pruebacodigo;


public class PruebaCodigo {

    public static void main(String[] args) {
        ConjuntoDePalabras conjunto1 = new ConjuntoDePalabras();
        ConjuntoDePalabras conjunto2 = new ConjuntoDePalabras();
        String texto1 = "en un lugar de la Mancha, de cuyo nombre no quiero "
                + "acordarme, no ha mucho tiempo que vivía un hidalgo";
        String texto2 = "ponte en mi lugar, no tengo mucho tiempo para "
                + "acordarme de tu nombre";
        conjunto1.obtenerConjunto(texto1);
        conjunto2.obtenerConjunto(texto2);
        
        
    }
}
