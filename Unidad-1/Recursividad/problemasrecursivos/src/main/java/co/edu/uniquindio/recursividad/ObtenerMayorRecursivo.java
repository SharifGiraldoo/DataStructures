package co.edu.uniquindio.recursividad;

public class ObtenerMayorRecursivo {

    public static void main(String[] args) {
        
        int [] arreglo = {1, 5, 3, 9, 2};
        int mayor = obtenerMayorRecursivo(arreglo, 0, arreglo[0]);
        System.out.println("El mayor elemento del arreglo es: " + mayor);
    }

    public static int obtenerMayorRecursivo(int[] arreglo, int i, int mayor){

        if(i == arreglo.length){
            return mayor;
        }else{
            if(arreglo[i] > mayor){
                mayor = arreglo[i];
            }
            return obtenerMayorRecursivo(arreglo, i + 1, mayor);
        }
    }
}
