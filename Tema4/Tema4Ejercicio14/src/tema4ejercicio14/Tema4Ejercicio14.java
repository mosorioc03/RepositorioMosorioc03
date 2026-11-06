/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio14;

import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public class Tema4Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = pedirNumero();
        calcularYMostrarMultiplos(numero);
    }

    public static int pedirNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un numero entero mayor que 0: "); //Pedimos un numero 
            while (!scanner.hasNextInt()) {
                System.out.println("Tienes que introducir un numero entero valido."); //En caso de que no sea un numero entero salta este error
                System.out.println("Introduce un numero entero mayor que 0: "); //En caso de que no sea un numero negativo salta este error
                scanner.next();
            }
            numero = scanner.nextInt();
        } while (!esMayorQueCero(numero));

        return numero;
    }

    public static boolean esMayorQueCero(int numero) {
        if (numero <= 0) {
            System.out.println("El numero debe ser mayor que 0.Vuelve a introducirlo.");    //En caso de que no sea un numero negativo salta este error
            return false;
        }
        return true;
    }

    public static void calcularYMostrarMultiplos(int limite) {
        int contador = 0;
        System.out.println("Multiplos de 3 entre 1 y " + limite + ":");

        for (int i = 3; i <= limite; i += 3) {
            System.out.print(i + " ");          //Aqui calculamos todos los multiplos de 3 entre 1 
            contador++;
        }

        System.out.println("\nLos multiplos de 3 mostrados son: " + contador);  //Y aqui se los mostramos al usuario
    }
}
    
