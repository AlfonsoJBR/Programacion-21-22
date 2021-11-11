import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        int radio;
        
        System.out.print("Introduzca el de MB :");
        radio=s.nextInt();
        s.nextLine();
       
        System.out.println("Esto son "+(float)radio/1000+" KB");
		System.out.println("Esto son "+(float)radio/1024+" KiB");
	}
}
