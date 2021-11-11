public class Ejercicio41{
	public static void main (String [] args) {
		
		long numero,resultado=1,pares=0,impares=0 , potencia=0, numeroDecapado=0;
		
		
		System.out.print("Introduzca un número entero positivo: ");
		numero=Integer.parseInt(System.console().readLine());
		
		if  (numero<0) {
			System.out.print("Este valor no se pude computar. Adiós!");
		}
		for (int i=1;i<=numero;i=i*10) {
			potencia=i;
		}
		numeroDecapado=numero;	
		
		for (long i=potencia;i>0;i=i/10) {
			
			resultado=numeroDecapado/i;
			numeroDecapado=numeroDecapado%i;
			
			if (resultado%2==0) {
				pares=pares+1;
			}else{	
				impares=impares+1;
			}	
		}				
		System.out.println("El número "+numero+" contiene "+pares+" digitos pares y "+impares+" digitos impares");
		
	}
	
}	
