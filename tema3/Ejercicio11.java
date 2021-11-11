import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        float radio;
        
        System.out.print("Introduzca el numero de KB :");
        radio=s.nextFloat();
        s.nextLine();
       
        System.out.printf("Esto son %.0f  KB",radio*1000);
        System.out.println();
		System.out.print("Esto son "+radio*1024+" KiB");
	}
}
