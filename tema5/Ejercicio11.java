public class Ejercicio11{
	public static void main (String[] args) {
	
		int numero;
		 
		
		System.out.println("Introduzca numero a calcular :");
		numero=Integer.parseInt(System.console().readLine());
		for	 (int i=0;i<5;i++) {
			System.out.println("cuadrado : "+(numero*numero)+ " /////  cubo : "+(numero*numero*numero));
			numero=numero+1;		
		} 
			
	}
}
