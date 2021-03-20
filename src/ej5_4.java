/* Escribe un programa que solicite dos números al usuario y le permita decidir si sumarlos, restarlos,
 multiplicarlos o dividirlos. El programa debe controlar todos los errores posibles. */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ej5_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        float num1;
        while(true) {
            try {
                num1 = entrada.nextFloat();
                entrada.nextLine();
                break;
            } catch(InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debes introducir un número.");
            }
        }
        System.out.print("Introduce otro número: ");
        float num2;
        while(true) {
            try {
                num2 = entrada.nextFloat();
                entrada.nextLine();
                break;
            } catch(InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debes introducir un número.");
            }
        }
        System.out.println("¿Qué operación quieres realizar con los números?");
        String operacion;
        operacion = entrada.nextLine();
        operacion = operacion.toLowerCase();

        switch (operacion) {
            case "sumar":
                System.out.println("La suma de tus números es " + (num1 + num2));
            case "restar":
                System.out.println("La resta de tus números es " + (num1 - num2));
            case "multiplicar":
                System.out.println("El producto de tus números es " + (num1 * num2));
            case "dividir":
                System.out.println("El cociente de tus números es " + (num1 / num2));
            default:
                System.out.println("Error, debes introducir una operación válida (sumar, restar, multiplicar, dividir).");
        }

    }
}
