public class Ejercicio32{
	public static void main (String[] args) {
	
    int numero,potencia=0, aux=0,suma=0;
    String pares="";
  
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numero=Integer.parseInt(System.console().readLine());
    
    for (int i=1;i<=numero;i=i*10) {
      potencia=i;
    }  
    for (int j=potencia; j>=0;j=j/10) {
      
      aux=(numero/j);
      if (aux%2==0) {
        pares=aux+" ";
        suma=suma+aux;
      }
      numero=(numero&j)*(potencia/10);
    }
    System.out.println("Dígitos pares: "+pares);
    System.out.println("Suma de los dígitos pares : "+suma);
    
        
  }
}    

