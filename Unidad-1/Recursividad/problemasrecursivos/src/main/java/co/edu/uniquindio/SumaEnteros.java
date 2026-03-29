package co.edu.uniquindio;

public class SumaEnteros {

    public static void main(String[] args) {
        int n = 5;
        int resultado = sumaEnteros(n);
        System.out.println("La suma de los primeros " + n + " enteros es: " + resultado);
    }

    public static int sumaEnteros(int n){
        if(n == 0){
            return 0;
        }else{
            return n + sumaEnteros(n - 1);
        }
    }

}
