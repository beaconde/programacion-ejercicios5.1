/* Escribe un programa que pida el importe final de un artículo y calcule e imprima por pantalla el IVA que se ha
pagado y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del 10%) */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ej5_2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el importe final del artículo: ");
        float importeFinal;
        while(true) {
            try {
                importeFinal = entrada.nextFloat();
                entrada.nextLine();
                break;
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debes introducir un número.");
            }
        }

        float importe = importeFinal / 1.10f;

        System.out.println("El IVA que se ha pagado es de " + (importeFinal - importe) + " euros, y el importe sin IVA es de " + importe + " euros.");
    }
}
