import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        int numero1,numero2;
             
        System.out.println("Introduce el primer número");
        numero1=Integer.parseInt(System.console().readLine());
        
        System.out.println("Introduce el segundo número");
        numero2=Integer.parseInt(System.console().readLine());
        
        System.out.println("la suma de "+numero1+" y "+numero2+" es igual a "+(numero1+numero2));
		System.out.println("la resta de "+numero1+" y "+numero2+" es igual a "+(numero1-numero2));
        System.out.println("la multiplicación de "+numero1+" por "+numero2+" es igual a "+(numero1*numero2));
        System.out.println("la división de "+numero1+" y "+numero2+" es igual a "+((float)numero1/numero2));
    }
}
