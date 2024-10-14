import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String [] args) {

        // Creo el Scanner para leer lo que el usuario escribe
        Scanner sc = new Scanner(System.in);

        // Pido al usuario que introduzca la nota
        System.out.println("Introduce tu nota :");

        // Guardo la nota que mete el usuario
        int nota = sc.nextInt();

        // Comparo la nota para ver qué resultado le toca
        if (0 <= nota && nota <= 4) {  // Si está entre 0 y 4, es "Insuficiente"
            System.out.println("Insuficiente");
        }
        else if (nota == 5) {  // Si es 5, entonces "Suficiente"
            System.out.println("Suficiente");
        }
        else if (nota == 6) {  // Si es 6, sería "Bien"
            System.out.println("Bien");
        }
        else if (nota <= 7 || nota <= 8) {  // Si es 7 u 8, le toca "Notable"
            System.out.println("Notable");
        }
        else if (nota == 9 || nota == 10) {  // Si es 9 o 10, es "Sobresaliente"
            System.out.println("Sobresaliente");
        }

        // Cierro el Scanner para evitar fugas de memoria
        sc.close();
    }
}

