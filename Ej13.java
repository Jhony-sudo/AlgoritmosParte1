import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        float Radio;
        float Altura;
        double Pi = 3.14;
        System.out.println("Ingrese el radio del cilindro ");
        Radio = a.nextFloat();
        if (Radio > 0) {
            System.out.println("Ingrese la altura del cilindro");
            Altura = a.nextFloat();
            if (Altura > 0) {
                float Area = Radio * Radio * (float) Pi;
                float Volumen = Area * (float) Altura;
                System.out.println("El volumen del cilindro es de " + Volumen);
            } else {
                System.out.println("Ingrese valores positivos");
            }

        } else {
            System.out.println("Ingrese valores positios");
        }
    }

}
