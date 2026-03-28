## ¿Qué es la Recursividad?


La recursividad es un concepto fundamental en matemáticas y en computación.

Es una alternativa diferente para implementar estructuras de repetición (Ciclos). Los módulos se hacen llamadas recursivas.

También llamada como recursión o recurrencia, es una técnica de programación elemental que permite que una función pueda definirse y llamarse en términos de si misma, pudiendo llegar a ser una solución diferente al proceso iterativo.

---

<p align="center">
  <img src="img/image.png" alt="alt text" />
</p>

---

# ¿Qué es Recursividad desde el punto de vista de la computación?


- La recursividad (recursión) es aquella propiedad que posee un método por la
cual puede llamarse a sí mismo. Aunque se puede utilizar la recursividad
como una alternativa a la iteración.

- Es menos eficiente en términos de tiempo de computadora que una solución
iterativa, debido a las operaciones auxiliares que llevan consigo las
invocaciones suplementarias a los métodos.

- Diversas técnicas algorítmicas utilizan la recursión, como los algoritmos
divide y vence y los algoritmos de vuelta atrás.

--- 

# Ventajas y Desventajas de la recursividad

| Ventajas | Desventajas | 
| :---:    | :---:       |
|Simplifica problemas complejos al dividirlos en subproblemas más pequeños y similares | Puede ser difícil de entender si no se comprende bien el caso base y la recursión |
| Reduce la cantidad de líneas de código en comparación con las soluciones iterativas | Consumo alto de recursos como tiempo y memoria |
| No cuenta con una secuencia de pasos exacta para la solución del problema | Puede ser difícil de depurar debido a la complejidad de las llamadas anidadas 1

---

# Tipos de Recursividad 

| Tipo | Descripción |
| :---:| :---: |
| Recursividad Directa | Una función se llama a sí misma directamente |
| Recursividad Indirecta | Una función llama a otra función, y esta segunda función termina llamando a la primera |
| Recursividad Lineal | Cada llamada recursiva tiene solo una llamada adicional | 
| Recursividad Múltiple | Cada llamada recursiva genera múltiples llamadas adicionales |
| Recursividad de Cola | La llamada recursiva es la última operación realizada por la función, lo que permite optimización |
| Recursividad No de Cola | La llamada recursiva no es la última operación; los resultados  intermedios se procesan después |

---

# Ejemplo de la Matrushka 

```
public static void imprimirMatrushka(int n){

        if(n == 0){
           System.out.println("No hay Matrushkas para abrir"); 
        }else{
            System.out.println("Abriendo Matrushka " + n);
            imprimirMatrushka(n-1);
        }

    }
```

