import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1;
        int num2;
        int division;
        System.out.println("Ingrese el primer numero");
        num1 = a.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = a.nextInt();
        division = num1 % num2;
        if (division == 0) {
            System.out.println("Es divisible");
        } else {
            System.out.println("No es divisible");
        }
    }

}
