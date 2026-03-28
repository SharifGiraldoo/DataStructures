package co.edu.uniquindio.recursividad;

public class ProblemaMatrushka {


    public static void main(String[] args){

        int n = 5;
        imprimirMatrushka(n);

    }

    public static void imprimirMatrushka(int n){

        if(n == 0){
           System.out.println("No hay Matrushkas para abrir"); 
        }else{
            System.out.println("Abriendo Matrushka " + n);
            imprimirMatrushka(n-1);
        }

    }

}
