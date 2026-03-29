package co.edu.uniquindio.recursividad;

public class imprimirMatriz {

    public static void main(String[] args) {
        
        int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
        imprimirContenidoMatriz(matriz, 0);
    }

    
    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void imprimirContenidoMatriz(int [][] matriz, int fila){
        if(fila >= matriz.length){
            return;
        }else{

            imprimirFila(matriz[fila], 0);
            System.out.println();
            imprimirContenidoMatriz(matriz, fila + 1);
        }    
    }

    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void imprimirFila(int [] fila, int columna){
            if(columna >= fila.length){
                return;
            }else{
                System.out.print(fila[columna] + " ");
                imprimirFila(fila, columna + 1);
            }
        }

}
