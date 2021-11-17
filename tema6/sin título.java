/*
 Alfonso Bravo Romo
 * Daw 1 15/11/21
 * 
 */


public class sin título {
	
	public static void main (String[] args) {
    
    int dado1, dado2,tiradas=0;
    
    System.out.println ("Programa que tira varias veces dos dados hasta que los dos resultados son iguales");
    System.out.println ("---------------------------------------------------------------------------------");
    do {
      dado1=(Math.ramdon()*6)+1;
      dado2=(Math.ramdon()*6)+1;
      System.out.println(dado1+"  "+dado2);
      tiradas++;
    } while (dado!=dado2);
    
    System.out.println("Han sido "+tiradas+" intentos ");
    		
	}
}

