import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        int radio, altura;
        
        System.out.print("Introduzca el radio del cono :");
        radio=s.nextInt();
        s.nextLine();
        System.out.print("Introduzca la altura del cono :");
        altura=s.nextInt();
        System.out.println("el volumen del cono es: "+((3.1416*radio*radio*altura)/3));
        
	}
}
