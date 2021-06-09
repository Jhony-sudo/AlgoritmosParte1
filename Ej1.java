
import java.util.Scanner;
public class Ej1 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es de " + suma);
    }
}

