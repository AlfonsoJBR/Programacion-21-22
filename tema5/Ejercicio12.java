public class Ejercicio12{
	public static void main (String[] args) {
	
		int numero,fibosig=0,fiboant1=0,fiboant2=1;
		 
		
		System.out.print("Introduzca un numero para calcular la secuencia de fibonachi hasta ese número :");
		numero=Integer.parseInt(System.console().readLine());
		
		for	 (int i=0;i<numero;i++) {
			
			System.out.print(fibosig+" , ");
			fibosig=fiboant1+fiboant2;
			fiboant2=fiboant1;
			fiboant1=fibosig;	
				
		} 
			
	}
}
