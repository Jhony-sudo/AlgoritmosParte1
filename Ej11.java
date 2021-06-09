import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Double Num;
        Double Pies;
        Double Yd;
        Double Metr;
        Double Plg;
        System.out.println("Ingrese una medida en cm ");
        Num = a.nextDouble();
        Pies = Num / 30.48;
        Yd = Num / 91.44;
        Metr = Num / 100;
        Plg = Num / 2.54;
        System.out.println(Num + "cm, es igual a : ");
        System.out.println(Pies + " pies");
        System.out.println(Yd + " yardas");
        System.out.println(Metr + " metros");
        System.out.println(Plg + "  Pulgadas ");

    }
}
