import java.util.Scanner;

public class Ej15 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese un numero");
        num1 = a.nextInt();

        if (num1 >= 0) {
            if (num1 == 0) {
                System.out.println("El numero es nulo");

            } else {
                System.out.println("El numero es positivo");

            }
        } else {
            System.out.println("El numero es negativo");
        }
    }

}
