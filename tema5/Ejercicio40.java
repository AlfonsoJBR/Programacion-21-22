public class Ejercicio40{
	public static void main (String [] args) {
		
		int numero,resultado=1 ;
		
		
		System.out.print("Introduzca altura rombo hueco: ");
		numero=Integer.parseInt(System.console().readLine());
		
		if (numero%2==0 || numero<3) {
			System.out.print("Este valor no se pude computar. Adiós!");
			numero=1;
		}
		
		//* parte de arriba del rombo *//	
		for (int a=0;a<=numero/2-1;a++) {
			for (int b=1;b<=numero;b++){
				if (b==((numero/2)+1)-a || b==((numero/2+1)+a)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}			
			}
			System.out.println();
		}
		
		
		//* parte de abajo del rombo *//
		for (int i=1;i<=numero/2+1;i++) {
			
			for (int j=numero;j>=1;j--) {
				if (j==i || j==numero-i+1) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}		 
			}
			System.out.println();	
		}
		
		
		
	}
	
}	
