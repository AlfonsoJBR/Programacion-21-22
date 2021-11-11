public class Ejercicio19version2Posibilidad{
	public static void main (String[] args) {
	
		int altura;
		String caracter,cadena;
		
			System.out.print("Introduzca la altura de la pirámide :");
			altura=Integer.parseInt(System.console().readLine());
			System.out.print("Introduzca el relleno de la piramide :");
			caracter=System.console().readLine();
			
			cadena=caracter;
			
      int hueco = altura;
			
			for (int i=1;i<=altura;i++) {
				String auxiliar="%"+hueco+"s%s\n";
				System.out.printf(auxiliar," ",cadena);
				cadena=cadena+caracter+caracter;
        hueco--;
			}	
			
					
	}
}
