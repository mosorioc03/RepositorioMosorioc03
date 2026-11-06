/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3ejercicio29;
import java.util.Scanner;
/**
 *
 * @author infto
 */
public class Tema3Ejercicio29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Creamos un numero entre 1 y 100
        int secreto = (int) (Math.random() * 100) + 1;
        int intento;
        int contador = 0;

        // Bucle que se repite hasta acertar
        do {
            System.out.print("Introduce un numero (entre 1 y 100): ");
            intento = entrada.nextInt();
            contador++; // Si falla, sube el contador

            // Comprobamos si el número es mayor o menor
            if (intento < secreto) {
                System.out.println("El numero que tienes que adivinar es mayor.");
            } else if (intento > secreto) {
                System.out.println("El numero que tienes que adivinar es menor.");
            }
        } while (intento != secreto);

        // Mensaje final diciendo que ha acertado y los aciertos
        System.out.println("Has acertado, bieeeeeennnn!");
        System.out.println("Solo has tardado " + contador + " intentos, no esta mal");
    }
}

//Como dato curioso, probando si el codigo funcionaba bien acerte el numero a la primera JAJJAJAJAJAJA