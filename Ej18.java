import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        char D1;
        char D2;
        char D3;
        char D4;
        String numero;
        int longitud;
        System.out.println("Ingrese un numero de 4 digitos");
        numero = a.nextLine();
        longitud = numero.length();
        if (longitud <= 4) {

            switch (longitud) {
                case 1:
                    D1 = numero.charAt(0);
                    D = Character.getNumericValue(D1);
                    break;
                case 2:
                    D1 = numero.charAt(0);
                    D2 = numero.charAt(1);
                    D = Character.getNumericValue(D2);
                    C = Character.getNumericValue(D1);
                    break;
                case 3:
                    D1 = numero.charAt(0);
                    D2 = numero.charAt(1);
                    D3 = numero.charAt(2);
                    D = Character.getNumericValue(D3);
                    C = Character.getNumericValue(D2);
                    B = Character.getNumericValue(D1);
                    break;
                case 4:
                    D1 = numero.charAt(0);
                    D2 = numero.charAt(1);
                    D3 = numero.charAt(2);
                    D4 = numero.charAt(3);
                    D = Character.getNumericValue(D4);
                    C = Character.getNumericValue(D3);
                    B = Character.getNumericValue(D2);
                    A = Character.getNumericValue(D1);
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("El numero no debe de ser mayor a cuatro digitos");
        }
        int suma = A + B + C + D;
        System.out.println("D1=" + A + " D2=" + B + " D3=" + C + " D4=" + D);
        System.out.println("La suma de los digitos es de: " + suma);
    }

}
