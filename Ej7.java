import java.util.Scanner;
import java.util.Random;

public class Ej7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Random Hp = new Random();
        int num = Hp.nextInt(40) + 10;
        System.out.println(num);
        double disminucion = 15 * (double) num / 100;
        double numnuevo = num - disminucion;
        System.out.println(num + " disminuido en un 15% es: " + numnuevo);
    }
}
