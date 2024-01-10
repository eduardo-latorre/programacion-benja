package Tareas;

import java.util.Scanner;
/*
 Pedir el nombre, edad dirección e imprimirlos con una bienvenida
*/
public class Tarea01 {
    
    public static void main(String[] args){
        String nombre, direccion;
        int edad;
        Scanner scanner = new Scanner(System.in); // Instanciar un objeto

        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese su dirección: ");
        direccion = scanner.nextLine();

        System.out.print("Bienvenido: " + nombre);
        System.out.print(", su edad es: " + edad);
        System.out.print(", usted vive en: " + direccion);

        scanner.close();
    }

}
