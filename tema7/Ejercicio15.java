/* Alfonso Bravo Romo
 * 22/11/2021 DAW 1 
 */


public class Ejercicio15{
	
	public static void main (String[] args) {
		
    int comensales,i=0;
    int[] sala=new int [10];
    boolean sentados=true;
    
    for (int j=0; j<10; j++) {
      System.out.printf("%2d ",j);
    }
    System.out.println();
    
    for (int j=0; j<10;j++){
      sala[j]=(int)(Math.random()*4) ;
      System.out.printf("%2d ",sala[j]);
    }  
    
    System.out.println();
    
    System.out.print("Introduzca número de comensales: ");
    do {
      comensales=Integer.parseInt(System.console().readLine());
      if (comensales<0 || comensales>4) {
        System.out.println("Lo siento, no admitimos grupos de "+comensales+", haga grupos de 4 personas como máximo e intente de nuevo");
      }
        
    } while (comensales<1 || comensales>4);
    
    // con este bucle asignamos los comensales a una mesa a cero 
    while ((sentados==true)&&(i<10)) {
      if (sala[i]==0) { 
        sala[i]=comensales;
        sentados=false;
      } 
      i++;
    }  
   
    System.out.println();
    i=0;
    // con este bucle asignamos los comensales con gente pero tengan hueco suficiente
    while (sentados==true &&i<10) {  
      if ((sala[i]+comensales)<5) {
        sala[i]=sala[i]+comensales;
        sentados=false;
      } 
      i++;
    }  
    if (sentados) {
      System.out.println("Lo sentimos, no tenemos sitio suficiente para ustedes. Por favor, siguan esperando");
    }  
    for (int j=0; j<10; j++) {
      System.out.printf("%2d ",j);
    }
    System.out.println();
    
    for (int j=0; j<10;j++){
      System.out.printf("%2d ",sala[j]);
    }     
      
	}
}

