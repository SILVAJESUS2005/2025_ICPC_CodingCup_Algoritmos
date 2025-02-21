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
* c++ e01_array.cpp -o e01_array.exe
* cmd: e01_array.exe
* powershell: .\e01_array.exe 
*/

// librerias c++
#include <iostream>
#include <array>

int main ()
{
    /*  Declarar un arreglo de n elementos e asignar un valor en una posición
    *   especifica del arreglo para despues imprimirla en consola.
    */
    std::array<int, 10> arr; // Declaración arreglo "array", tipo de dato<int>, tamaño<10> y nombre<arr>.
    
    arr[0] = 1; // Asignación del valor "1" en la posicion [0] del arreglo.
    std::cout << "First element " << arr[0] << std::endl; // Imprimir en consola "First element" acompañado de el valor asignado en la posición del arreglo arr[0]

    /*  Declarar un arreglo de n elementos y recorrer el arreglo con un ciclo for e imprimir sus valores.
    */
    std::array<int, 4> arr2 = {1, 2, 3, 4}; // Declaración arreglo "array", tipo de dato<int>, tamaño<4>, nombre<arr> y valores{1, 2, 3, 4}.
    std::cout<< "Elements in second array: "; //Imprimir mensaje en consola.
        for(int i = 0; i < arr2.size(); i++) //Recorrer el arreglo con un ciclo for.
        {
            std::cout<<arr2[i] << " "; //Imprimir en consola el valor de la posicion actual del arreglo acompañado de un espacio.
        }

        std::cout << arr2.at(3); //Imprimir en consola el valor que contiene un espacio del arreglo.
        
    /* 
    *   EXCEPCIÓN:
    *   Declarar un excepcion, capturarla y decir que hacer con ella.
    */        
        try
        {
            std::cout << arr2.at(5); //Capturas la excepción
        }
        catch(const std::out_of_range& exception1) //indicas el tipo de excepcion y su nombre.
        {
            std::cerr << "El valor en esa posición del arreglo no existe" << exception1.what() << '\n'; // Indicas que hacer con la excepcion capturada.
        }
        

}