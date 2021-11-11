public class Ejercicio13{
	public static void main (String[] args) {
	
		int numero,posi=0;
		 
		
		
		
		for	 (int i=1;i<11;i++) {
			System.out.print("Introduzca un numero :");
			numero=Integer.parseInt(System.console().readLine());
			
			if (numero>=0) {
				posi=posi+1;
			}	
				
		} 
		System.out.println("Ha introducido "+posi+" numeros positivos y "+(10-posi)+" numeros negativos");	
	}
}
