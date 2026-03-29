package co.edu.uniquindio.recursividad;

public class SumarArreglo {

    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5};
        int resultado = sumArray(arreglo, 0);
        System.out.println("La suma del arreglo es: " + resultado);
    }

    public static int sumArray( int[] a, int i){
        if(i == a.length){
            return 0;
        }else{
            return a[i] + sumArray(a, i + 1);
        }
    }

}
