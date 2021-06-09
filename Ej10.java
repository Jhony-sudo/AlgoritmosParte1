import java.util.Scanner;

public class Ej10 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Base;
        int Altura;
        System.out.println("Ingrese la altura del rectangulo ");
        Altura = a.nextInt();
        System.out.println("Ingrese la base del rectangulo");
        Base = a.nextInt();
        int P = 2 * Altura + 2 * Base;
        int Area = Altura * Base;
        System.out.println("El perimetro del rectangulo es " + P + " y el area del rectangulo es " + Area);
    }
}
