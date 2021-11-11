public class Ejercicio35 {
	public static void main (String [] args) {
		
		int altura,x;
		
		System.out.print("Introduzca altura de la x : ");
		altura=Integer.parseInt(System.console().readLine());
		
		if ((altura<3)||(altura%2==0)) {
			System.out.println("El número itroducido no vale. Adiós");
			
		}	
		
	
		for (int a=1; a<=altura; a++){ 
			x=1; 
			
			
			
			for (int j=1;j<=altura; j++) {
				
				
				if ((x==a)||(x==altura+1-a)) {
					System.out.print("x");
				}else{	
					System.out.print(" ");
				}	
				
				x=x+1;
					
			}
			System.out.println();	
			
		}			
					
	}
}	
