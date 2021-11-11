public class Ejercicio15{
	public static void main (String[] args) {
	
		int base,exponente,resultado=1 ;
		 
		System.out.print("Introduzca base :");
		base=Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca exponente :");
		exponente=Integer.parseInt(System.console().readLine());
		
		
		
		for	 (int i=0;i<exponente;i++) {
			for (int j=0;j<=i;j++) {
			
				resultado=resultado*base;
			}
			base=base+1	
			System.out.println("Total :"+resultado);
			resultado=1;
			
		} 
			
	}
}
