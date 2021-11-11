public class Ejercicio7 {
	public static void main (String[] args) {
	
		int intento;
		boolean acierto=false;
		
		
		for (int i=1;(i<=4 && acierto==false);i++) {
			
			System.out.println("Introduzca combinanción :");
			intento=Integer.parseInt(System.console().readLine());
			if (intento==4848) {
					System.out.println("La caja fuerte se ha abierto satisfactoriamente");
					acierto=true;
			}else{
					System.out.println("Lo siento, esa no es la combinación");
			}
		}	
	}
}
