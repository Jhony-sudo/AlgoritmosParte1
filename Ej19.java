import java.util.Random;

public class Ej19 {
    public static void main(String[] args) {
        Random rn = new Random();
        int num = rn.nextInt(999) + 1;
        System.out.println(num);
        int div = num % 5;
        if (div == 0) {
            if (num <= 125) {
                System.out.println("Es correcto");
            } else {
                System.out.println("Incorrecto");
            }

        } else {
            System.out.println("Incorrecto");
        }

    }
}
