public class Ejercicio28{
	public static void main (String[] args) {
	
		int numero,total=1;
    
    
    System.out.print("Introduzca número factorial: ");
    numero=Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=numero; i++) {
      
      total=total*i;
    }  
    System.out.println(numero+"! :"+total); 
	}
}
