/* Alfonso Bravo Romo 08/11/21
 * DAW 1
  El programa calcula el numero de vueltas que da la tierra en x años 
 */


public class Ex08abr1 {
	
	public static void main (String[] args) {
		
    int  year;
    long vueltas;
    System.out.print("Introduzca el número de años : ");
    year=Integer.parseInt(System.console().readLine());
    
    vueltas=year*365;
    
    System.out.println("En ese tiempo, la Tierra ha dado "+vueltas+" vueltas sobre sí misma.");
	}
}

