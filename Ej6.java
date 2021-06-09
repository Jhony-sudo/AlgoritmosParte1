import java.util.Scanner;
import java.util.Random;

public class Ej6 {
    public static void main(String[] args) {
        Random ran = new Random();
        int num = ran.nextInt(200);
        System.out.println(num);
        double aumento = 30 * (double) num / 100;
        System.out.println(aumento);
        double numnuevo = aumento + num;
        System.out.println("El numero aumentado en un 30% es " + numnuevo);

    }

}
