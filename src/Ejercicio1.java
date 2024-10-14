import java.util.Scanner;

public class Ejercicio1 {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        // Pedimos la edad
        int edad;
        System.out.println("Introduce su edad :");
        edad = sc.nextInt();

        // Pedimos el crédito disponible
        System.out.println("Introduce su crédito disponible :");
        double credito = sc.nextDouble();

        // Verificamos si tiene 21 años o más y al menos 10,000 de crédito
        if (edad >= 21 && credito >= 10000) {
            // Si cumple ambas, es apto
            System.out.println("Apto");
        } else {
            // Si no cumple alguna, no es apto
            System.out.println("No apto");
        }

        sc.close(); // Cerramos el scanner
    }
}

