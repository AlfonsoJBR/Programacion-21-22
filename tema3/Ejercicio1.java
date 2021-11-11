import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        float numero1, numero2;
             
        System.out.println("Introduce el primer número:");
        numero1=s.nextFloat();
        s.nextLine();
        System.out.println("Introduce el segundo número:");
        numero2=s.nextFloat();
        s.nextLine();
        System.out.println("El resultado de la multiplicación es: "+(numero1*numero2))
        ;
        
    }
}
