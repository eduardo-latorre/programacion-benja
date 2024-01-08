import java.util.Scanner;

public class Variables {

    // Diferentes tipo de variables de acuerdo al tipo de datos
    // Caracteres
    // Cadena de caracteres
    // Número
    // Verdadero y falso
    public static void main(String[] args){
        // Variables primitivas
        // Tipo - nombre = valor
        char caracter = 'b';
        int entero = 500;
        boolean verdadero = true;

        int edad; // Reservo un espacio de memoria

        System.out.println("Caracter: " + caracter);
        System.out.println("Entero: " + entero);
        System.out.println("Verdadero?: " + verdadero);

        edad = 17;
        System.out.println("Cuál es la edad: " + edad);

        // Clases
        String nombre;
        nombre = "Benjamín Pizarro Gálvez";
        System.out.println("Mi nombre es: " + nombre);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nuevo nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Qué guarda nombre al final: " + nombre);
    }

}
