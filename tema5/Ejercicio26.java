public class Ejercicio26 {
	public static void main (String[] args) {
	
			int numero,digito,contador=1, digitosnumero=1;
			String posicion="";
		
			System.out.print("Introduzca numero :");
			numero=Integer.parseInt(System.console().readLine());
			System.out.print("Introduzca dígito :");
			digito=Integer.parseInt(System.console().readLine());
			/* esto sirver para contar cuantos digitos tiene el numero*/
			
			for (int i=10;i<=numero;i=i*10) {
					digitosnumero=digitosnumero*10;
				}
			
			
			do  {
					
				
				
				if (digito==numero/digitosnumero) {
					
					posicion=posicion+" "+contador;
				}
				numero=numero-((numero/digitosnumero)*digitosnumero);	
				digitosnumero=digitosnumero/10;
					
				contador=contador+1;
								
				
			} while (digitosnumero>0)	;
			
			System.out.print("El número "+digito+" aparece en la posición  "+posicion);
			
					
	}
}
