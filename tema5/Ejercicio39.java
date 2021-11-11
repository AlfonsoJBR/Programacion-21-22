public class Ejercicio39{
	public static void main (String [] args) {
		
		int numero,resultado=1 ;
		
		
		System.out.print("Introduzca un número para hacerlo factorial ");
		numero=Integer.parseInt(System.console().readLine());
		
		for (int i=1;i<=numero;i++) {
			
			resultado=resultado*i;
			System.out.println(i+"! = "+resultado);
		}
		
		
		
	}
	
}	
