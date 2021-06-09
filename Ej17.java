import java.util.Scanner;

public class Ej17 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Lad1;
        int Lad2;
        int Lad3;
        System.out.println("Ingrese los lados de un triangulo");
        Lad1 = a.nextInt();
        Lad2 = a.nextInt();
        Lad3 = a.nextInt();

        if (Lad1 == Lad2 & Lad2 == Lad3) {
            System.out.println("El triangulo es equilatero");
        } else if (Lad1 == Lad2 ^ Lad1 == Lad3) {
            System.out.println("El triangulo es isoceles ");

        } else {
            System.out.println("El triangulo es escaleno ");
        }
    }

}
