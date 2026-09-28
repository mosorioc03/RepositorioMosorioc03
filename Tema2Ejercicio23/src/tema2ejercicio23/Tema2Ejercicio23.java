/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio23;

import java.util.Scanner;


/**
 *
 * @author infto
 */
public class Tema2Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Por favor, introduzca el precio del ordenador que desea comprar: ");  //Preguntamos precio del ordenador que necesita
        double precio = scanner.nextDouble();
        System.out.print("Cuantas unidades quiere llevarse?: ");  //Preguntamos cuantos ordenadores
        int unidades = scanner.nextInt();
        double total = precio*unidades;     //Calculamos precio total  
        
        System.out.println("El precio total de su compra es de: " + total + "euros");
        
        
    }
    
}