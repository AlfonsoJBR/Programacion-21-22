import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        
        int numerohoras=0;
        
        System.out.print("Introduzca numero de horas trabajadas semanalmente :");
        numerohoras=s.nextInt();
        System.out.println("a 12 euros la hora su sueldo semanal es de : "+numerohoras*12);
        
	}
}
