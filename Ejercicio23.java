/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicios;

import java.util.Scanner;


/**
 *
 * @author infto
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("\t Por favor, introduzca el precio del ordenador que desea comprar: ");
        double precio = scanner.nextDouble();
        System.out.print("Cuantas unidades quiere llevarse?: ");
        int unidades = scanner.nextInt();
        double total = precio*unidades;
        
        System.out.println("El precio total de su compra es de: " + total + "euros");
        
        
    }
    
}