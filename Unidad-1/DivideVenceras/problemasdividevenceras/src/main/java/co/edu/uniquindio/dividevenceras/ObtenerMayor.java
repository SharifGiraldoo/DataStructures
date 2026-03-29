package co.edu.uniquindio.dividevenceras;

public class ObtenerMayor {

    public int obtenerMayor(int[] arreglo, int inicio, int fin) {
        if (inicio == fin) {
            return arreglo[fin];
        } else {

            int mitad = (inicio + fin) / 2;
            int mayorIzq = obtenerMayor(arreglo, inicio, mitad);
            int mayorDer = obtenerMayor(arreglo, inicio, mitad + 1);

            if (mayorIzq > mayorDer) {
                return mayorIzq;
            } else {
                return mayorDer;

            }
        }

    }
}
