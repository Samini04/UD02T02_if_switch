import java.util.Scanner;

public class Ejerecicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Solicitar los números al usuario
        System.out.println("Ingrese el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Ingrese el segundo numero: ");
        double num2 = sc.nextDouble();

        // Solicitar la operación
        System.out.println("Ingrese la operación (+, -, *, /):");
        char operacion = sc.next().charAt(0); // Se captura la operación

        // Switch para seleccionar la operación
        switch (operacion) {
            case '+':
                System.out.println("Resultado es: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Resultado es: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Resultado es: " + (num1 * num2));
                break;

            case '/':
                    System.out.println("Resultado es: " + (num1 / num2));

                break;

            default:
                System.out.println("Error.");
        }

        sc.close(); // Cerrar el escáner al final
    }
}
