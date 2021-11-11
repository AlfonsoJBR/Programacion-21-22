import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        
        float baseimponible,iva;
             
        System.out.print("Introduce la base imponible: ");
        baseimponible=Float.parseFloat(System.console().readLine());
        
        System.out.print("Introduce el tipo de IVA: ");
        iva=Float.parseFloat(System.console().readLine());
        
        
        System.out.printf("El importe total a facturar es: %.2f \n",(baseimponible+((baseimponible*iva)/100)));
	}
}
