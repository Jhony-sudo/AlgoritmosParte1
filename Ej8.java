import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        double promedio;
        System.out.println("Ingrese 3 numeros");
        num1 = in.nextDouble();
        num2 = in.nextDouble();
        num3 = in.nextDouble();
        promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los numeros es de: " + promedio);

    }

}
