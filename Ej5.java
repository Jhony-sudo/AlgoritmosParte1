import java.util.Scanner;
public class Ej5 {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero");
        numero = a.nextInt();
        int numsig = numero + 1;
        System.out.println("El numero siguiente es " + numsig);
    }    
}
