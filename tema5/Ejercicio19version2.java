public class Ejercicio19version2{
	public static void main (String[] args) {
	
		int altura;
		String caracter,cadena;
		
			System.out.print("Introduzca la altura de la pirámide :");
			altura=Integer.parseInt(System.console().readLine());
			System.out.print("Introduzca el relleno de la piramide :");
			caracter=System.console().readLine();
			
			cadena=caracter;
			
			
			for (int i=1;i<=altura;i++) {
				
				System.out.printf("%id \n",caracter);
				cadena=cadena+caracter+caracter;
			}	
			
					
	}
}
