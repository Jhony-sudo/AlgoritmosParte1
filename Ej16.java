import java.util.Scanner;
public class Ej16 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        System.out.println("Ingrese tres numeros");
        num1 = a.nextInt();
        num2 = a.nextInt();
        num3 = a.nextInt();

        if (num1>num2 & num1>num3) {
            System.out.println("El numero mayor es " + num1);
        } 
        else if (num2>num1 & num2 > num3 ){
            System.out.println("El numero mayor es " + num2);
            
        }
        else{
            System.out.println("El numero mayor es " + num3);
        }
    }
    
}
