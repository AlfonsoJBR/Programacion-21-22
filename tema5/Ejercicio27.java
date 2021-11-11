public class Ejercicio27{
	public static void main (String[] args) {
	
		int numero,contador=0,sumatorio=0;
    
    
    System.out.println("Introduzca número máximo :");
    numero=Integer.parseInt(System.console().readLine());
    
    for (int i=3; i<=numero; i=i+3){
      
      contador=contador+1;
      sumatorio=sumatorio+i;
    }  
    System.out.println("Los multiplos de 3 son : "+contador+" en total");
    System.out.println("La suma total de los múltiplos de 3 es :"+sumatorio); 
	}
}
