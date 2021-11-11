public class Ejercicio14{
	public static void main (String[] args) {
	
		int base,exponente,base1=1 ;
		 
		System.out.print("Introduzca base :");
		base=Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca exponente :");
		exponente=Integer.parseInt(System.console().readLine());
		
		for	 (int i=0;i<exponente;i++) {
			
			
			base1=base1*base;
				
				
		} 
		System.out.println("Total :"+base1);	
	}
}
