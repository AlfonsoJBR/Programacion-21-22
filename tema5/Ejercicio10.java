public class Ejercicio10{
	public static void main (String[] args) {
	
		int numero=0,i=0;
		double total=0;
		
		System.out.println("Calculemos la media de los números que introduzca :");
		
		do {
			
			System.out.println("Introduzca número :");
			numero=Integer.parseInt(System.console().readLine());
			if (numero>=0) {
			 total=total+numero;
			 i++;	
			}
		} while (numero>=0);
		System.out.printf("La media es : %.2f ",(total/i));
			
	}
}
