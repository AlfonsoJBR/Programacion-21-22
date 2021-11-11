import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        float euros;
             
        System.out.println("Introduce los pesetas a cambiar");
        euros=s.nextFloat();
        s.nextLine();
        
        System.out.println("el cambio de "+euros+" pesetas son "+(euros/166.386)+" euros")
        ;
        
    }
}
