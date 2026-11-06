/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio26;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Tema4Ejercicio26 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un numero entero: ");   //Pedimos un numero entero
        
        int numero = entrada.nextInt();
        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo.");   //Respuesta cuando el numero es primo
        } else {
            System.out.println("El numero " + numero + " no es primo.");    //Respuesta cuando el numero es no primo
        }
    }


    public static boolean esPrimo(int n) {

        if (n <= 1) {
            return false;       //Si es menor o igual a uno automaticamente sabemos que no es primo
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {           //Si el resto de la división es 0 sabemos que tampoco no es primo
                return false;
            }
        }
        
        return true;    // Si termina el bucle sin encontrar ningún divisor es primo
    }
}