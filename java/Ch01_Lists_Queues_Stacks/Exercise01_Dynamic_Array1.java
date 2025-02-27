/* 
* ITESS-TICS 2025 
* ICPC-CP JAKARTA SPRING 
* By Francisco Javier Montecillo Puente 
* 23-Febrero-2025
* Programmer: Jesús López Silva
* jesuslopezsilva206@gmail.com
* 
* Description: Dynamic proframming array
*
*/
// javac Exercise01_Dynamic_Array.java
// java Exercise01_Dynamic_Array

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase genérica DynamicArray
class Exercise01_Dynamic_Array<T> {
    private List<T> data;

    // Constructor
    public Exercise01_Dynamic_Array(int size) {
        data = new ArrayList<>(size);
        // Inicializamos la lista con null para evitar errores de índice
        for (int i = 0; i < size; i++) {
            data.add(null);
        }
    }

    // Constructor de copia (deep copy)
    public Exercise01_Dynamic_Array(Exercise01_Dynamic_Array<T> other) {
        this.data = new ArrayList<>(other.data);
    }

    // Obtener y asignar elementos
    public T get(int index) {
        return data.get(index);
    }

    public void set(int index, T value) {
        data.set(index, value);
    }

    public T at(int index) {
        if (index >= data.size()) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return data.get(index);
    }

    // Obtener el tamaño del arreglo
    public int size() {
        return data.size();
    }

    // Método para combinar dos DynamicArray
    public Exercise01_Dynamic_Array<T> merge(Exercise01_Dynamic_Array<T> other) {
        Exercise01_Dynamic_Array<T> result = new Exercise01_Dynamic_Array<>(this.size() + other.size());
        result.data.addAll(this.data);
        result.data.addAll(other.data);
        return result;
    }

    // Convertir a String
    public String toString(String separator) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) != null) {
                sb.append(data.get(i).toString());
                if (i < data.size() - 1) {
                    sb.append(separator);
                }
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return toString(", ");
    }
}

// Clase Student para pruebas
class Student {
    String name;
    int standard;

    public Student(String name, int standard) {
        this.name = name;
        this.standard = standard;
    }

    @Override
    public String toString() {
        return "[Name: " + name + ", Standard: " + standard + "]";
    }
}

// Main
public class Exercise01_Dynamic_Array1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar número de estudiantes
        System.out.print("Enter number of students in class 1: ");
        int nStudents = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear Exercise01_Dynamic_Array de estudiantes
        Exercise01_Dynamic_Array<Student> class1 = new Exercise01_Dynamic_Array<>(nStudents);

        // Leer los datos de los estudiantes
        for (int i = 0; i < nStudents; i++) {
            System.out.print("Enter name and class of student " + (i + 1) + ": ");
            String name = scanner.next();
            int standard = scanner.nextInt();
            class1.set(i, new Student(name, standard));
        }

        // Crear una copia de class1
        Exercise01_Dynamic_Array<Student> class2 = new Exercise01_Dynamic_Array<>(class1);
        System.out.println("Second class after initialized using first array: " + class2);

        // Combinar class1 y class2 en class3
        Exercise01_Dynamic_Array<Student> class3 = class1.merge(class2);
        System.out.println("Combined class: " + class3);

        // Intentar acceso fuera de rango
        System.out.println("try before");
        try {
            class1.set(nStudents, new Student("John", 8)); // Esto generará un error en Java
            System.out.println("class1 student set out of range without exception");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Exception caught");
        }
        System.out.println("try after");

        scanner.close();
    }
}





