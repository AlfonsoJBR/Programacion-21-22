import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        int base,altura;
             
        System.out.print("Introduce la base del triangulo: ");
        base=Integer.parseInt(System.console().readLine());
        
        System.out.print("Introduce la altura del triangulo: ");
        altura=Integer.parseInt(System.console().readLine());
        
        
        System.out.println("El area del triangulo es igual a "+(base*altura)/2);
	}
}
