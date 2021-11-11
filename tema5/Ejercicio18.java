public class Ejercicio18{
	public static void main (String[] args) {
	
		int numero1,numero2,contenedor;
		
		
		System.out.print("Introduzca número 1 :");
		numero1=Integer.parseInt(System.console().readLine());
		System.out.print("Introduzca número 2 :");
		numero2=Integer.parseInt(System.console().readLine());
		
		if (numero1>numero2) {
			contenedor=numero2;
			numero2=numero1;
			numero1=contenedor;
		}	
			
		 for (int i=numero1;i<=numero2;i=i+7) {
			
			System.out.println (i+" ");
		
		}	
			
					
	}
}
