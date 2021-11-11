public class Ejercicio25{
	public static void main (String[] args) {
	
			int numero;
			String reverso="";
		
			System.out.print("Introduzca numero :");
			numero=Integer.parseInt(System.console().readLine());
			
			
			
			do  {
				
				reverso=reverso+(numero%10);
				numero=(numero-(numero%10))/10;
				
								
				
			} while (numero>0)	;
			
			System.out.print("El número reverso es : "+reverso);
			
					
	}
}
