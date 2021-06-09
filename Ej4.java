import java.util.Scanner;
public class Ej4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int numero;
        int cuadrado;
        int cubo;
        System.out.println("Ingrese un numero");
        numero = leer.nextInt();
        cuadrado  =numero * numero;
        cubo = cuadrado * numero;
        
        System.out.println("El cuadrado del numero es " + cuadrado + " y el cubo es " + cubo);

    }    
}
