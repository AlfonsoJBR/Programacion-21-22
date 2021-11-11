public class Ejercicio22{
  	public static void main (String[] args) {
    
      int numero,contador=0;
	
		
      
		
      for (int j=2; j<=100;j++) {
        contador=0;
        for (int i=1;i<=j;i++) {
        
          if 	((j%i)==0) {
            contador=contador+1;
          }
        }
          if (contador==2) {
            System.out.print(j+" ");
          
          }	
        
      }  
    }
}
