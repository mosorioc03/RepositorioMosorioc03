/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2ejercicio32;
import java.util.Scanner;
/**
 *
 * @author mosorioc03
 */
public class Tema2Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaramos todas las variables
        int importe;
        int resto;
        int billetes50, billetes20, billetes10, billetes5;
        int monedas2, monedas1;
        
        System.out.print("Por favor, indique una cantidad de dinero: ");    //Pedimos una cantidad de dinero
        importe = entrada.nextInt();

        billetes50 = importe / 50;
        resto = importe % 50;

        billetes20 = resto / 20;
        resto = resto % 20;

        billetes10 = resto / 10;
        resto = resto % 10;

        billetes5 = resto / 5;
        resto = resto % 5;

        monedas2 = resto / 2;
        resto = resto % 2;

        monedas1 = resto;

        System.out.println(importe + " Euros se descomponen en " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 euros y " + monedas1 + " monedas de 1 euro.");   //Damos un resultado
    }
    
}
