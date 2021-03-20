/* Escribe un programa para pedirle al usuario las horas de trabajo y el precio por hora y
calcule el importe total del servicio. */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ej5_1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce las horas trabajadas: ");
        while(!entrada.hasNextInt()) {
            entrada.nextLine();
            System.out.println("Debes introducir un número.");
        }
        int horas = entrada.nextInt();
        System.out.print("Introduce el coste por hora: ");
        float coste;
        while(true) {
            try {
                coste = entrada.nextFloat();
                entrada.nextLine();
                break;
            }
            catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debes introducir un número.");
            }
        }

        System.out.print("El coste total es de " + coste * horas + " euros.");
    }
}
