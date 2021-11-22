/* Alfonso Bravo Romo
 * 17/11/2021 DAW 1 
 */


public class Ejercicio11 {
	
	public static void main (String[] args) {
		
    int[] tabla1= new int [10];
    int noprimo,z=0,temporal=0;
    
    /*bucle para introducir números*/
    for (int i=0;i<=9;i++){
      System.out.print("Introduzd el número "+(i+1)+" : ");
      tabla1[i]=Integer.parseInt(System.console().readLine());
    } 
    
    
    for (int j=0; j<=9;j++) {
      noprimo=0;
      /*bucle para ver si es número primo*/
      for (int i=1;i<=tabla1[j]; i++) {
        if (tabla1[j]%i==0) {
          noprimo=noprimo+1;   
        }
      }
      /* si el numero es primo lo permutamos con el siguiente no primo que esté en la posicion z */
      /* si el número no es primo permanece en su posición */
      if (noprimo<3) {
        temporal=tabla1[z];
        tabla1[z]=tabla1[j];
        tabla1[j]=temporal;
        z=z+1; 
      }
    } 
    for (int j=0; j<=9;j++) { 
      System.out.print(tabla1[j]+" ");
    }  
	}
}

