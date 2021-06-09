import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int numero;
        int doble;
        int triple;
        System.out.println("Ingrese el numero");
        numero = a.nextInt();
        doble = numero * 2;
        triple = numero * 3;
        System.out.println("El doble de " + numero + " es " + doble + " y el triples es " + triple);
    }

}
