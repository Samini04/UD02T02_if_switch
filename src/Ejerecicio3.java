import java.util.Scanner;

public class Ejerecicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, año;
        System.out.println("Introduzca el dia: ");
        dia  = sc.nextInt();

        System.out.println("Introduzca el mes: ");
        mes  = sc.nextInt();

        System.out.println("Introduzca el año: ");
        año = sc.nextInt();

        boolean esValido = false;

        if (mes>= 1 && mes<=12) {
            if (mes == 2)  {//febrero
                if (dia>=1 && dia<=28) {
                    esValido = true;
                }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia>=1 && dia<=30) {
                esValido = true;
            }
        } else if (dia>=1 && dia<=31) {
            esValido = true;}
        }
        if (esValido) {
            System.out.println("La fecha " + dia +  + mes +  + año + " es válida.");
        } else {
            System.out.println("La fecha " + dia + + mes +  + año + " no es válida.");
        }
        sc.close();
    }
}
