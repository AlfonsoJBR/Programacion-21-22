public class Ejercicio8 {
	public static void main (String[] args) {
	
		int numero;
		
		
		System.out.println("Introduzca número para ver su tabla de multiplicar :");
		numero=Integer.parseInt(System.console().readLine());
		for (int i=1;i<=10;i++) {
			
			System.out.println(numero+"x"+i+"= "+(numero*i) );
			
		}	
	}
}
