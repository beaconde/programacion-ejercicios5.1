// Mostrar los 50 primeros números pares a partir del 0, separados por comas y en orden creciente.

public class ej5_5 {
    public static void main(String[] args) {
        System.out.println("Los 50 primeros números pares son:");
        for (int i=1; i<=100; ++i) {
            if(i%2==0 && i!=100) {
                System.out.print(i+", ");
            } else if(i==100) {
                System.out.print(i);
            }
        }
    }
}
