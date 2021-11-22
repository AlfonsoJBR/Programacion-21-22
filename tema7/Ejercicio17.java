/* Alfonso Bravo Romo
 * 22/11/2021 DAW 1 
 */


public class Ejercicio17{
	
	public static void main (String[] args) {
		
    int numero,i=0;
    int[] vector=new int [10];
    boolean control=false;
    
    for (int j=0; j<10; j++) {
      System.out.printf("%2d ",j);
    }
    System.out.println();
    
    for (int j=0; j<10;j++){
      vector[j]=(int)(Math.random()*101) ;
      System.out.printf("%2d ",vector[j]);
    }  
    
    System.out.println();
    
    System.out.print("Introduzca un número entre el 0 y el 100: ");
    
    //con este bucle controlamos que el numero esta dentro del array, si no es asi , lo pide hasta  que sea igual a uno dentro del array
    do {
      numero=Integer.parseInt(System.console().readLine());
      for (int z=0;z<10;z++) {
        if (numero==vector[z]){
          control=true;
        }
      }  
      if (control==false) {  
          System.out.println("Lo siento, el valor que ha introducido no esta dentro del rango del ejercicio. Vuelva a introducirlo por favor");
      }
            
    } while (control==false);
    
    // con este bucle rotamos el array hasta que el número indicado llegue a la posición 0 del array
    while (vector[0]!=numero) {
      int aux=0;
      for (int j=0; j<10;j++) { 
        if (j==9){
          aux=vector[0];
          vector[0]=vector[j];
          vector[j]=aux;
        } else {
          aux=vector[j+1];
          vector[j+1]=vector[j];
          vector[j]=aux;
        } 
      
      }
    }  
   
    
    for (int j=0; j<10; j++) {
      System.out.printf("%2d ",j);
    }
    System.out.println();
    
    for (int j=0; j<10;j++){
      System.out.printf("%2d ",vector[j]);
    }     
      
	}
}

