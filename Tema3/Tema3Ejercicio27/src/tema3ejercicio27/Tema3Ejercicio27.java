/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio27;
import java.util.Scanner;
/**
 *
 * @author infto
 */
public class Tema3Ejercicio27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1, num2;
        int opcion;

        // Le pedimos dos numeros al usuario
        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Introduce el segundo numero: ");
        num2 = entrada.nextInt();

        // Hacemos un bucle que dure hasta que la opcion sea 5
        do {
            System.out.println("1.- Sumar los numeros.");
            System.out.println("2.- Restar los numeros.");
            System.out.println("3.- Multiplicar los numeros.");
            System.out.println("4.- Dividir los numeros.");
            System.out.println("5.- Salir del programa.");
            System.out.print("Elija una opcion: ");
            opcion = entrada.nextInt();

            // Estructura switch para procesar la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("La multiplicacion es: " + (num1 * num2));
                    break;

                case 4:
                    // Ponemos el catch por si el usuario intenta dividir entre 0
                    try {
                        int division = num1 / num2;
                        System.out.println("La division es: " + division);
                    } catch (ArithmeticException e) {
                        System.out.println("Error: No se puede dividir entre cero");
                    }
                    break;

                case 5:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Vuelve a intentarlo");
                    break;
            }

        } while (opcion != 5);
    }
}