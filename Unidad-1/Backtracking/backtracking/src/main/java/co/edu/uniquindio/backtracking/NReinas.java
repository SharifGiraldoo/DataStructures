package co.edu.uniquindio.backtracking;

public class NReinas {

    static int N = 4; // Cambia N para diferentes tamaños de tablero

    public static void main(String[] args) {
        int[][] tablero = new int[N][N];

        if (resolverNReinas(tablero, 0)) {
            imprimirTablero(tablero);
        } else {
            System.out.println("No hay solución.");
        }
    }

    // Función principal para resolver el problema
    static boolean resolverNReinas(int[][] tablero, int fila) {

        // Caso base: si colocamos todas las reinas, hay solución
        if (fila == N) {
            return true;
        }

        // Intentar colocar una reina en cada columna de la fila actual
        for (int columna = 0; columna < N; columna++) {

            if (esSeguro(tablero, fila, columna)) {

                tablero[fila][columna] = 1; // Colocar reina

                // Llamada recursiva para la siguiente fila
                if (resolverNReinas(tablero, fila + 1)) {
                    return true;
                }

                // Backtracking: quitar la reina si no funciona
                tablero[fila][columna] = 0;
            }
        }

        // Si no se pudo colocar en ninguna columna
        return false;
    }

    // Verifica si una reina puede colocarse en tablero[fila][columna]
    static boolean esSeguro(int[][] tablero, int fila, int columna) {

        // Revisar la misma columna
        for (int i = 0; i < fila; i++) {
            if (tablero[i][columna] == 1) {
                return false;
            }
        }

        // Revisar diagonal izquierda
        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        // Revisar diagonal derecha
        for (int i = fila, j = columna; i >= 0 && j < N; i--, j++) {
            if (tablero[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Función para imprimir el tablero
    static void imprimirTablero(int[][] tablero) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
