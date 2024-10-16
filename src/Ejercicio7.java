import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 12 para repsentar un mes: ");
        int mes = sc.nextInt();

        String nombreMes = switch (mes) {

       case 1 ->"Enero - 31 dias ";
       case 2 ->"Febrero - 28 o 29 depende del año";
      case 3 ->"Marzo - 31 dias ";
       case 4 ->"Abril - 30 dias ";
       case 5 ->"Mayo - 31 dias ";
       case 6 ->"Junio - 30 dias";
       case 7 ->"Julio - 31 dias ";
       case 8 ->"August - 31 dias ";
       case 9 ->"September - 30 dias ";
       case 10 ->"October - 31 dias ";
       case 11 ->"November - 30 dias ";
       case 12 ->"December - 31 dias ";

       default -> "Error: Mes invalido";
};
System.out.println(nombreMes);
sc.close();

}
}