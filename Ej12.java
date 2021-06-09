import java.util.Scanner;

public class Ej12 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float Temperatura1;
        float Conversion;
        System.out.println("Ingrese una temperatura en grados Celcius");
        Temperatura1 = a.nextFloat();
        Conversion = (Temperatura1 * 9 / 5) + 32;
        System.out.println(Temperatura1 + " es igual a " + Conversion + " Fahrenheit");

    }
}
