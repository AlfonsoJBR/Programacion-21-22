import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        float euros;
             
        System.out.println("Introduce los euros a cambiar");
        euros=s.nextFloat();
        s.nextLine();
        
        System.out.println("el cambio de "+euros+" euros son "+(euros*166.386)+" pesetas")
        ;
        
    }
}
