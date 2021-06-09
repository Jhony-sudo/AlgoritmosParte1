import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        String Pais;
        String Capital;
        System.out.println("Ingrese el nombre del pais ");
        Pais = leer.nextLine();
        System.out.println("Ingrese el nombre de la capital del pais");
        Capital = leer.nextLine();
        System.out.println(Capital + " es la capital de " + Pais);
        
        

    }
    
}
