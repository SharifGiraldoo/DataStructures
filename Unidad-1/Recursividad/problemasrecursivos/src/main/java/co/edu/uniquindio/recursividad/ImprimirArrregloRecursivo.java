package co.edu.uniquindio.recursividad;

public class ImprimirArrregloRecursivo {


    public void imprimirArreglo( String[] arreglo, int indice){

        if(indice == arreglo.length){
            return; 
        }else{
            System.out.println("Imprimiendo arreglo" + arreglo[indice]);
            imprimirArreglo(arreglo, indice + 1);
        }
    }

}
