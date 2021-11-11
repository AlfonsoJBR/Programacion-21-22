public class Ejercicio36v2 {
	public static void main (String [] args) {
		
		long numero,potencia=1, numeroDecapado, capicua=0, cifra;
		System.out.print("Introduzc un número entero positivo : ");
		numero=Long.parseLong(System.console().readLine());
		
		for (long i=1;i<=numero;i=i*10) {
			potencia=i; 
			
		}	
		numeroDecapado=numero;
		cifra=1;
		
		for (long j=potencia; j>0  ; j=j/10 ){
			capicua=capicua+((numeroDecapado%10)*j);
			numeroDecapado=numeroDecapado/10;
			
			
		}
		System.out.println(capicua);
		if (capicua==numero) {
			System.out.println("el número "+numero+" es capicua.");
		} else {
			System.out.println("el número "+numero+" no es capicua.");
		}	
	}
}	
