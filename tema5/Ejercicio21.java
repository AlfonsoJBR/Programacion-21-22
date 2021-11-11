public class Ejercicio21{
	public static void main (String[] args) {
	
		int numero,par=0,contador=0;
		float impar=0;
		
		
		do {
				
			System.out.print("Introduzca números hasta que introduzca uno negativo :");
			numero=Integer.parseInt(System.console().readLine());
			
			if (numero%2==0) {
			    if (numero>par) {
					par=numero;
				}		
			}else{
				if (numero>0) {
					impar=impar+numero;
					contador=contador+1;
				}	
			}	
						
			
		} while (numero>=0);	
		
					
		System.out.printf("La media de impares es: %.2f \n",(impar/contador));
		System.out.println("El mayor de los pares es: "+par);	
				
			
					
	}
}
