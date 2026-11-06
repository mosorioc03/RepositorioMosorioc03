/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4ejercicio14;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class pedir {
    public static void numero (int numero) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero mayor que 1: ");
            numero = entrada.nextInt();
    }
}
