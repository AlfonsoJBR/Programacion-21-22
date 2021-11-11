import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        int base,altura;
             
        System.out.print("Introduce la base del rectangulo: ");
        base=Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduce la altura del rectangulo: ");
        altura=Integer.parseInt(System.console().readLine());
        
        
        System.out.println("El area del rectangualo es igual a "+(base*altura));
	}
}
