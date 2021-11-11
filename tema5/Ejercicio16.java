public class Ejercicio16{
	public static void main (String[] args) {
	
		int numero,contador=0;
		String tipo="no primo";
		
		System.out.print("Introduzca número :");
		numero=Integer.parseInt(System.console().readLine());
		
		
		
		 for (int i=1;i<=numero;i++) {
			
			if 	((numero%i)==0) {
				contador=contador+1;
			}
		}
		if (contador==2) {
			System.out.println ("El número es primo");
		}else{
			System.out.println ("El número no es primo");
		}	
			
					
	}
}
