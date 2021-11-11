public class Ejercicio33{
	public static void main (String[] args) {
	
    int numero;
    System.out.print("Introduzca altura de la U : ");
    numero=Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=numero-1;i++) {
      
     
      for (int j=1;j<=numero;j++) {
        if (j==1 || j==numero) {
          System.out.print("*");
        }else{
          System.out.print(" ");  
        }
      }  
    System.out.println();    
    }
    System.out.print(" ");
    for (int h=1;h<=numero-2;h++){
        System.out.print("*");
    }
  }
}    

