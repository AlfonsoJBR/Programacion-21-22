public class Ejercicio43{
	public static void main (String [] args) {
		
		int numero,posicionizda=0, digitos=0, x=1,z=1;
		
		int resultadoDerecha=0,resultadoizda=0,cifra,posicion;
		
		System.out.print("Introduzca un número entero positivo: ");
		numero=Integer.parseInt(System.console().readLine());
		
		System.out.print("Introduzca la posicon por donde quiere partir el número: ");
		posicion=Integer.parseInt(System.console().readLine());
		
		for (int i=1;i<=numero;i=i*10) {
			digitos=digitos+1;
		}	
		
		posicionizda=digitos-posicion;
		System.out.println(digitos);
		System.out.println(posicionizda);
		
		for (int j=1;j<=digitos;j++) {
			
			if (j==digitos){
				cifra=numero;
			}else{	
				cifra=numero%(numero/10);
			}
			
			if (j<=posicionizda) {
				resultadoizda=resultadoizda+(cifra*z);
				z=z*10;
			}else{	
				resultadoDerecha=resultadoDerecha+(cifra*x);
				x=x*10;
			}		
			numero=numero/10;
		
					
		
			
		}
		System.out.println("los números partidos son el "+resultadoDerecha+" y el "+resultadoizda);
	}
	
}	
