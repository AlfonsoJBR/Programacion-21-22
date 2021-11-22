/* Alfonso Bravo Romo
 * 17/11/2021 DAW 1 
 */


public class Ejercicio12{
	
	public static void main (String[] args) {
		
    int[] tabla1= new int [10];
    int[] tabla2= new int [10];
    int posIni,posFin;
    boolean control=true;
    
    System.out.print("Se van a generar aleatoriamente 10 números");
    System.out.println();
    /*bucle para introducir números aleatorios*/
    for (int i=0;i<=9;i++){
      System.out.printf("%3d ",i);
    }
    System.out.println();
    for (int i=0;i<=9;i++){
      tabla1[i]=(int)(Math.random()*30);
      System.out.printf("%3d ",tabla1[i]);
    } 
    System.out.println();
    /* bucle para introducir números de posiciones y controlar que esten bien metidos */
    do {
      
      System.out.print("Introduzca la posición inical a cambiar ");
      posIni=Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca la posición final a cambiar ");
      posFin=Integer.parseInt(System.console().readLine());
      
      
      if ((posIni>posFin ) || (posIni<0 || posIni >9) || (posFin<0 || posFin>9)) {
        System.out.println("Los números itroducidos son incorrectos, vuelva a introducir otros que sean correctos");
        control=false;
      }  
    } while (control==false);  
    
    
    tabla2[posIni]=tabla1[posFin];
    
    for (int j=0; j<=9;j++) {
     
      if (j>=posIni+1 && j<=posFin-1) {
        tabla2[j]=tabla1[j];
          
      }else if (j==9) {
        tabla2[0]=tabla1[j];
        
      } else {
        tabla2[j+1]=tabla1[j] ;
      }  
    tabla2[posFin]=tabla1[posIni];    
    } 
    System.out.println();
    for (int j=0; j<=9;j++){
      System.out.printf(" %3d",j);
    }
    System.out.println();  
    for (int j=0; j<=9;j++) { 
      System.out.printf(" %3d",tabla2[j]);
    }  
	}
}

