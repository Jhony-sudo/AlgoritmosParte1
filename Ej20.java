import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int Dig1;
        int Dig2;
        int Dig3;
        int Dig4;
        String num;
        System.out.println("Ingrese un numero de 5 digitos");
        num = a.nextLine();
        int longitud = num.length();
        if (longitud == 5) {
            Dig1 = Character.getNumericValue(num.charAt(0));
            Dig2 = Character.getNumericValue(num.charAt(1));
            Dig3 = Character.getNumericValue(num.charAt(3));
            Dig4 = Character.getNumericValue(num.charAt(4));
            if (Dig1 == Dig4 & Dig2 == Dig3) {
                System.out.println(num + " Es capicua");

            } else {
                System.out.println(num + " No es capicua");
            }

        } else {
            System.out.println("ERROR el numero debe de ser de 5 digitos");
        }

    }
}
