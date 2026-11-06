/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio9;
import java.util.Scanner;
/**
 *
 * @author infto
 */
public class Tema3Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Se declaran los numeros y la variable cambio
        int num1, num2, num3, num4;
        int cambio;

        // El usuario mete los datos
        System.out.print("Introduce el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Introduce un segundo numero: ");
        num2 = entrada.nextInt();

        System.out.print("Introduce el tercer numero: ");
        num3 = entrada.nextInt();

        System.out.print("Introduce un cuarto numero: ");
        num4 = entrada.nextInt();

        // Se comparan los datos por primera vez
        if (num1 > num2) {
            cambio = num1;
            num1 = num2;
            num2 = cambio;
        }
        if (num2 > num3) {
            cambio = num2;
            num2 = num3;
            num3 = cambio;
        }
        if (num3 > num4) {
            cambio = num3;
            num3 = num4;
            num4 = cambio;
        }

        // Se comparan los datos por segunda vez
        if (num1 > num2) {
            cambio = num1;
            num1 = num2;
            num2 = cambio;
        }
        if (num2 > num3) {
            cambio = num2;
            num2 = num3;
            num3 = cambio;
        }
        if (num3 > num4) {
            cambio = num3;
            num3 = num4;
            num4 = cambio;
        }

        // Se comparan los datos por tercera vez
        if (num1 > num2) {
            cambio = num1;
            num1 = num2;
            num2 = cambio;
        }
        if (num2 > num3) {
            cambio = num2;
            num2 = num3;
            num3 = cambio;
        }
        if (num3 > num4) {
            cambio = num3;
            num3 = num4;
            num4 = cambio;
        }

        // Se da el resultado ordenado
        System.out.println("El orden de los numeros introducidos es el " 
                + num1 + " - " + num2 + " - " + num3 + " - " + num4);
    }
}
