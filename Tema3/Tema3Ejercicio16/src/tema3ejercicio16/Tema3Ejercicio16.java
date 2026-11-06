/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio16;
/**
 *
 * @author infto
 */

public class Tema3Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador = 0;   // Variable con la que contamos cuantos numeros impares hay

        System.out.print("Los numeros impares entre el 20 y el 160 son: ");   // Mensaje inicial

        for (int i = 21; i < 160; i++) {    // Vemos todos los numeros entre el 21 y el 160
            if (i % 2 != 0) {   // Se comprueba cuales son impares
                System.out.print(i + " - ");
                contador++; // Cada vez que aparece un impar sube el contador
            }
        }

        // Mensaje con todos los numeros impares
        System.out.println();
        System.out.println("Habia " + contador + " numeros impares");
    }
}