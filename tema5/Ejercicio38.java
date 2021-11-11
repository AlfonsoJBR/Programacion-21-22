public class Ejercicio38 {
	public static void main (String [] args) {
		
		int numero,x,z ;
		
		
		System.out.print("Introduzca la altura del reloj de arena, que ha de ser un número impar y > que 3: ");
		numero=Integer.parseInt(System.console().readLine());
		
		if ((numero<3)||(numero%2==0)) {
			System.out.println("Con este número no puedo trabajar. Adios!!");
			numero=-1;
		}	
		/* parte de arriba del reloj */
		for (int i=1;i<=numero/2+1;i++) {
			
			for (int j=1; j<=numero; j++) {
				if ((j>=i)&& (j<=numero-i+1)) {
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
				
			
			}
			System.out.println();
		}
		String asterisco="***";
		/* parte de abajo del reloj*/
		for (int a=numero/2;a>=1;a--) {
			
			for (int b=a-1; b>=1; b--) {
			
				
					System.out.print(" ");
			}
			System.out.println(asterisco);
			asterisco=asterisco+"**";
		}		 
		
	}
	
}	
