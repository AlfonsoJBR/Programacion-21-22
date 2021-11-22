/* Alfonso Bravo Romo
 * 17/11/2021 DAW 1 
 */


public class Ejercicio6 {
	
	public static void main (String[] args) {
		
    int[] tabla1= new int [15];
    int[] tabla2= new int [15];
    
    
    for (int i=0;i<=14;i++){
      System.out.print("Introduzd el número "+(i+1)+" : ");
      tabla1[i]=Integer.parseInt(System.console().readLine());
    } 
    for (int j=0; j<=14;j++) {
      
      if (j==14) {
        tabla2[0]=tabla1[14];
      }else{
        tabla2[j+1]=tabla1[j];
      }    
    } 
    for (int j=0; j<=14;j++) { 
      System.out.print(tabla2[j]+" ");
    }  
	}
}

