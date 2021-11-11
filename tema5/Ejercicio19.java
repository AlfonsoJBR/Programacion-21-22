public class Ejercicio19{
	public static void main (String[] args) {
	
		int altura;
		String caracter;
		
			System.out.print("Introduzca la altura de la pirámide :");
			altura=Integer.parseInt(System.console().readLine());
			System.out.print("Introduzca el caracter para dibujar la piramide :");
			caracter=System.console().readLine();
			
			
			
			
			for (int i=1;i<=altura;i++) {
				
				for (int espacio=1;espacio<=altura-i;espacio++) {
					System.out.print(" ");
				}	
			
				for (int letra=1;letra<=(i*2)-1;letra++) {
					System.out.print(caracter);
				}
				System.out.println();
			}	
			
					
	}
}
