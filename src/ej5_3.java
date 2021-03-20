/* Escribe un programa que solicite una puntuación entre 0.0 y 1.0. Si la puntuación está fuera de ese rango,
muestra un mensaje de error. Si la puntuación está entre 0.0 y 1.0, muestra la calificación usando la tabla
siguiente (el programa debe mostrar la tabla usando tabuladores): */

import java.util.Scanner;
import java.util.InputMismatchException;

public class ej5_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("""
                         Puntuación   Calificación
                         >=0.9        Sobresaliente
                         >=0.8        Notable
                         >=0.7        Bien
                         >=0.6        Suficiente
                         <0.6         Insuficiente""");

        System.out.print("Introduce tu puntuación: ");
        float puntuacion;
        while(true) {
            try {
                puntuacion = entrada.nextFloat();
                entrada.nextLine();
                if(puntuacion<0 || puntuacion>1) {
                    System.out.println("Debes introducir una puntuación entre 0 y 1.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                entrada.nextLine();
                System.out.println("Debes introducir un número.");
            }
        }

        if(puntuacion>=0.9) {
            System.out.println("Sobresaliente");
        } else if(puntuacion>=0.8) {
            System.out.println("Notable");
        } else if(puntuacion>=0.7) {
            System.out.println("Bien");
        } else if(puntuacion>=0.6) {
            System.out.println("Suficiente");
        } else {
            System.out.println("Insuficiente");
        }
    }
}
