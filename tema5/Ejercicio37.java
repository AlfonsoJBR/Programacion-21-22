public class Ejercicio37 {
	public static void main (String [] args) {
		
		int numero,potencia=1, cifra=0;
		
		
		System.out.print("Introduzc un número entero positivo : ");
		numero=Integer.parseInt(System.console().readLine());
		
		for (int i=1;i<=numero;i=i*10) {
			potencia=i; 
			
		}
		System.out.print("el número "+numero+" entero es el ");
		for (int i=potencia; i>0; i=i/10) {
			
			cifra=numero/i;
			for(int j=1;j<=cifra; j++) {
				System.out.print("|");
			}	
			if (numero>10) {
				System.out.print("-");
			}	
			numero=numero%i;
		} 
		System.out.print(" en el sistema de palotes");	
	}
	
}	
