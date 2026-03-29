package co.edu.uniquindio.dividevenceras;

public class ObtenerMayorArreglo {

    public static void main(String[] args) {
        int[] arreglo = {2,5,8,10,35,90,14,23};
        ObtenerMayorArreglo obj = new ObtenerMayorArreglo();
        obj.hallarMayor(arreglo, arreglo.length);
    }
    
    public int hallarMayor(int[] arreglo, int n){
        if(n == 1){
            return arreglo[0];
        }

        int maximoValor = hallarMayor(arreglo, n-1);
        return Math.max(maximoValor, arreglo[n-1]);
    }

}
