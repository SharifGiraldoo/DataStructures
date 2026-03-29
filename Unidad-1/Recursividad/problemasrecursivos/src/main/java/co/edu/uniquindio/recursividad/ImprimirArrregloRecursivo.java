package co.edu.uniquindio.recursividad;

public class ImprimirArrregloRecursivo {

    public static void main(String[] args) {
        String[] arreglo = {"Hola", "Mundo", "Recursividad"};
        imprimirArreglo(arreglo, 0);
    }


    @SuppressWarnings("UnnecessaryReturnStatement")
    public static void imprimirArreglo( String[] arreglo, int indice){

        if(indice == arreglo.length){
            return; 
        }else{
            System.out.println("Imprimiendo arreglo" + arreglo[indice]);
            imprimirArreglo(arreglo, indice + 1);
        }
    }

}
