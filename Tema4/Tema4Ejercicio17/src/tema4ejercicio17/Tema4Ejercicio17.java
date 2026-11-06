/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio17;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Tema4Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        char letrarandom = (char) (Math.random() * (122 - 97 + 1)+ 97); //El programa genera una letra aleatoria
        int contador = 0;
        char intento;
        
         do {
            System.out.print("Introduce una letra (que no sea la ñ): "); //Solicitamos una letra que no sea la ñ
            intento=entrada.nextLine().charAt(0);
            contador++;

            
            if (intento < letrarandom) {
                System.out.println("La letra que tienes que adivinar es mayor.");   //Si la letra es mayor saldra este aviso
            } else if (intento > letrarandom) {
                System.out.println("La letra que tienes que adivinar es menor.");   //Si la letra es menor saldra este aviso
            }
        } while (letrarandom != intento);
         
        // Mensaje final diciendo que ha acertado y los aciertos
        System.out.println("Has acertado, bieeeeeennnn!");  //Cuando se acierte nos dará la enhorabuena
        System.out.println("Solo has tardado " + contador + " intentos, no esta mal");  //Y tambien nos dara el numero de intentos
    }
}
