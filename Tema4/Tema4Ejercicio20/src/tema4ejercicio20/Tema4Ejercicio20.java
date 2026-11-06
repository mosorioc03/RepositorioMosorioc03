/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4ejercicio20;
import java.util.Scanner;
/**
 *
 * @author Marcos
 */
public class Tema4Ejercicio20 {

    
    final static String CAPITAL_ESPANA = "Madrid";  //Guardamos la respuesta de la primera pregunta 
    final static String DESCUBRIDOR_AMERICA = "Colon";  //Guardamos la respuesta de la segunda pregunta 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aciertos = 0;

        System.out.println("EXAMEN DE CULTURA GENERAL");
        if (hacerPregunta1(entrada)) {          //En caso de que acierte el contador sube 
            aciertos++;
        }
        
        if (hacerPregunta2(entrada)) {          //En caso de que acierte el contador sube 
            aciertos++;
        }
        
        int notaFinal = aciertos * 5;
        System.out.println("NOTA DEL EXAMEN: " + notaFinal);    //Nota final del examen
    }
    public static boolean hacerPregunta1(Scanner entrada) {
        System.out.print("1ª PREGUNTA: ¿Cuál es la capital de España?: ");  //El programa hace la primera pregunta
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(CAPITAL_ESPANA)) {
            System.out.println("Muy bien, respuesta correcta.");    //Si es correcta nos da la enhorabuena
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + CAPITAL_ESPANA);    //Si no es correcta nos lo dice y nos da la respuesta correcta
            return false;
        }
    }
    
    public static boolean hacerPregunta2(Scanner entrada) {
        System.out.print("2ª PREGUNTA: ¿Quién descubrió América?: ");   //El programa hace la primera pregunta
        String respuesta = entrada.nextLine();

        if (respuesta.equalsIgnoreCase(DESCUBRIDOR_AMERICA)) {
            System.out.println("Muy bien, respuesta correcta.");    //Si es correcta nos da la enhorabuena
            return true;
        } else {
            System.out.println("No es correcto. La respuesta correcta sería " + DESCUBRIDOR_AMERICA);   //Si no es correcta nos lo dice y nos da la respuesta correcta
            return false;
        }
    }
}