/*
* ITESS-TICS 2025 
* ICPC-CP JAKARTA SPRING 
* By Francisco Javier Montecillo Puente 
* 21-Febrero-2025
* Programmer: Jesús López Silva
* jesuslopezsilva206@gmail.com
* 
* Description: Array example
*
* Compilar:
* javac E01_Array.java
* cmd: java E01_Array 
*/

public class E01_Array {
    public static void main(String[] args) {
        /*
         * Declarar un arreglo de n elementos e asignar un valor en una posición
         * especifica del arreglo para despues imprimirla en consola.
         */
        int[] arr = new int[10]; // Declaración arreglo "array", tipo de dato, tamaño<10> y nombre.

        arr[0] = 1; // Asignación del valor "1" en la posicion [0] del arreglo.
        System.out.println("First element array: " + arr[0]); // Imprimir en consola "First element" acompañado de el
                                                              // valor asignado en la posición del arreglo arr[0]

        /*
         * Declarar un arreglo de n elementos y recorrer el arreglo con un ciclo for e
         * imprimir sus valores.
         */
        int[] arr2 = { 1, 2, 3, 4 }; // Declaración arreglo "array"
        System.out.println("Elements in second array: "); // Imprimir mensaje en consola.
        for (int i = 0; i < arr2.length; i++) { // Recorrer el arreglo con un ciclo for.
            System.out.println(arr2[i] + " "); // Imprimir en consola el valor de la posicion actual del arreglo
                                               // acompañado de un espacio.
        }
        System.out.println();

        /*
         * EXCEPCIÓN:
         * Declarar un excepcion, capturarla y decir que hacer con ella.
         */
        try {
            int a = arr2[5]; // Capturas la excepción
        } catch (Exception ex) { // indicas el tipo de excepcion y su nombre.
            System.out.println("EXCEPTION: " + ex.getMessage()); // Indicas que hacer con la excepcion capturada.
        }

    }
}