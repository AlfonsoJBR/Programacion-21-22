/* Alfonso Bravo Romo
 * 17/11/2021 DAW 1 
 */


public class Ejercicio13{
	
	public static void main (String[] args) {
		
    int[] tabla1= new int [100];
    int menor=0,mayor=0,resaltado=0,numero;
    
    for (int i=0; i<=99;i++) {
      tabla1[i]=(int)(Math.random()*500);
      System.out.printf("%4d ",tabla1[i]);
      if (tabla1[i]<tabla1[menor]) {
        menor=i;
      }  
      if (tabla1[i]>tabla1[mayor]) {
        mayor=i;
      }  
    
    }
    System.out.println();
    System.out.println(tabla1[menor]+"   "+tabla1[mayor]);
    System.out.print("¿Que número quiere destacar? (1 - mínimo, 2 - máximo ) :");
    numero=Integer.parseInt(System.console().readLine());
    switch (numero)  {
        case 1: 
          resaltado=menor;
        break;
        case 2:
          resaltado=mayor;
        break;
        default:  
    }   
    System.out.println();
    for (int i=0; i<=99;i++) {
        if (i==resaltado) {
          System.out.print(" **"+tabla1[i]+"** ");
        } else {
          System.out.printf("%4d ",tabla1[i]);
        } 
    }
	}
}

