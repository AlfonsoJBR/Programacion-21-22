public class Ejercicio17{
	public static void main (String[] args) {
	
		int numero,contador=0;
		
		do {
			System.out.print("Introduzca número :");
			numero=Integer.parseInt(System.console().readLine());
		
			if (numero<0) {
				System.out.println("Número no valido, vuelva a intentarlo otra vez");
			}else{
		
					for (int i=numero+1;i<=(numero+100);i++) {
			
					contador=contador+i;
					}
			}		
		} while (numero<0);
		
		System.out.println("la suma total es : "+contador);
		
			
					
	}
}
