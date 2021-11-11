public class Ejercicio42{
	public static void main (String [] args) {
		
		int numero,noprimo;
		
		
		
		System.out.print("Introduzca un número entero positivo: ");
		numero=Integer.parseInt(System.console().readLine());
		
		if  (numero<0) {
			System.out.print("Este valor no se pude computar. Adiós!");
		}
		for (int i=0;i<=4;i++) {
		
			noprimo=0;
			for (int j=1;j<=numero+i; j++) {
			
				if ((numero+i)%j==0) {
					noprimo=noprimo+1;
									
				}
					
			}
			if (noprimo>2) {
				System.out.println("El número "+(numero+i)+" no es primo ");;
			}else{
				System.out.println("El número "+(numero+i)+" es primo ");;
			}						
			
		}
	}
	
}	
