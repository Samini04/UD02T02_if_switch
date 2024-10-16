import java.util.Scanner;

public class Ejercicio5_Java12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sabor de la helado que te gusta (0 = vainilla, 1 = chocolate, 2 = fresa ): ");

        final int Vanilla = 0;
        final int Chocolate = 1;
        final int Fresa = 2;

        int sabor = sc.nextInt();

        String respuesta = switch (sabor) {

            case Vanilla -> "Vamilla";
            case Chocolate -> "Chocolate";
            case Fresa -> "Fresa";
            default -> "Error";
        };
        System.out.println(respuesta);
        sc.close();
    }
}
