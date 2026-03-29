package co.edu.uniquindio.busquedabinaria;

public class BusquedaBinaria {

    public static int busquedaBinaria(int[] arreglo, int inicio, int fin, int objetivo) {

        // Caso base: no hay más elementos que buscar
        if (inicio > fin) {
            return -1;
        }

        // Calcular la posición media
        int medio = inicio + (fin - inicio) / 2;

        // Si el objetivo está en la posición media, devolvemos la posición
        if (arreglo[medio] == objetivo) {
            return medio;
        }

        // Si el objetivo es menor, buscar en la mitad izquierda
        if (objetivo < arreglo[medio]) {
            return busquedaBinaria(arreglo, inicio, medio - 1, objetivo);
        }

        // Si el objetivo es mayor, buscar en la mitad derecha
        return busquedaBinaria(arreglo, medio + 1, fin, objetivo);
    }

}
