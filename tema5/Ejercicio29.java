public class Ejercicio29{
	public static void main (String[] args) {
	
		int numero1,numero2,aux=0,total=1;
    
    
    System.out.print("Introduzca número primero : ");
    numero1=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca número primero : ");
    numero2=Integer.parseInt(System.console().readLine());
    
    if (numero1<numero2) {
      numero1=aux;
      numero1=numero2;
      numero2=aux;
    }  
    
    for (int i=numero2; i<=numero1; i++) {
        if (numero1/numero2==0) {
          System.out.print(i+" ");
        }
     }   
  }
}
