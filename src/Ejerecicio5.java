import java.util.Scanner;

public class Ejerecicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el sabor de la helado que te gusta (0 = vainilla, 1 = chocolate, 2 = fresa ): ");

        final int Vanilla = 0;
        final int Chocolate = 1;
        final int Fresa = 2;

        int sabor = sc.nextInt();

        switch (sabor) {

            case Vanilla:
                System.out.println("El sabor de la helado es " + Vanilla);
                break;

            case Chocolate:
                System.out.println("El sabor de la helado es " + Chocolate);
                break;

            case Fresa:
                System.out.println("El sabor de la helado es " + Fresa);
                break;
            default:
                System.out.println("Error");
        }
        sc.close();

    }
}
