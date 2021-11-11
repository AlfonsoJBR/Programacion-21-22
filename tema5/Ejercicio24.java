public class Ejercicio24{
	public static void main (String[] args) {
	
		int altura,contador;
		String caracter;
		
			System.out.print("Introduzca la altura de la pirámide :");
			altura=Integer.parseInt(System.console().readLine());
			
			
			
			for (int i=1;i<=altura;i++) {
				
				contador=0;
				
				for (int espacio=1;espacio<=altura-i;espacio++) {
					System.out.print(" ");
				}	
			
				for (int letra=1;letra<=(i*2)-1;letra++) {
					
					
					if (letra<=i) {
											
						
						contador=contador+1;
					} else {
					
						contador=contador-1;
					}	
				
				System.out.print(contador);			
				}
				System.out.println();
			}	
			
					
	}
}
