/*
Alfonso Bravo Romo 08/11/2021
DAW 1  
* 
* Dibuja por pantall una pirámide rellena porosa hacia arriba
 * 
 */


public class Ex08abr2{
	
	public static void main (String[] args) {
		
    int altura,alturab;
    String caracter;
    
    System.out.print("Introduzca la altura de la pirámide :");
    altura=Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el caracter de relleno :");
    caracter=System.console().readLine();
    alturab=0;
    for (int i=1;i<=altura;i++) {
      alturab=alturab+1;
    /*este bucle pinta los espacios en blanco antes de los caracteres*/
      for (int j=1;j<=altura-alturab; j++) {
         System.out.print(" ");
      }   
    /*este bucle pinta la piramide*/
      
      for (int j=1;j<=alturab; j++) {
         System.out.print(caracter+" ");
      }
      System.out.println();
    }
    
    
	}
}

