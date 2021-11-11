public class Ejercicio9 {
	public static void main (String[] args) {
	
		int numero,cifra=1,digito=0,i;
		
		
		System.out.println("Introduzca número para ver cuantas cifras tiene :");
		numero=Integer.parseInt(System.console().readLine());
		for (i=0;(i<=100 && numero>=cifra);i++) {
			cifra=cifra*10;
			
				
		}
		System.out.println("El numero tiene : "+i+" cifras");
			
	}
}
