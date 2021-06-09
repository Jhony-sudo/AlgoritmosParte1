import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String Palabra1;
        String Palabra2;
        String Palabra;
        System.out.println("Ingrese la primera palabra ");
        Palabra1 = a.nextLine();
        System.out.println("Ingrese la segunda palabra ");
        Palabra2 = a.nextLine();
        Palabra = Palabra1;
        Palabra1 = Palabra2;
        Palabra2 = Palabra;
        System.out.println("Primer palabra " + Palabra1 + " segunda palabra " + Palabra2);
    }
}
