public class Ejercicio27{
    public static void main(String[] args) {
        
		
		String nata="",tipochoco="",sabor="", adorno="";
		double preciotarta=0;
		
		
		System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
		sabor=System.console().readLine();
       
		if ("chocolate".equals(sabor)) {
		   System.out.print("¿Que tipo de chocolate quiere? (negro o blanco): ");
			tipochoco=System.console().readLine();
		}	
       
		System.out.print("¿Quiere nata? (s/n): ");
		nata=System.console().readLine();
		
		System.out.print("¿Quiere ponerle un nombre? (s/n): ");
		adorno=System.console().readLine();
		
		switch (sabor) {
			case "chocolate":
				if ("negro".equals(tipochoco)) {
					preciotarta=14.0;
				}else{	
					preciotarta=15.0;
				}
			break;	
			case "manzana":
					preciotarta=18.00;
			break;		
			case "fresa":
					preciotarta=16.00;
			break;
		}
		
		System.out.printf("Tarta de "+sabor+tipochoco+": %4.2f € \n",preciotarta);
					
		if ("s".equals(nata)) {
			System.out.println("Con nata:      2,50 €");
			preciotarta=preciotarta+2.5;
		}
		
		if ("s".equals(adorno)) {
			System.out.println("Con nombre:    2,75 €");
			preciotarta=preciotarta+2.75;
		}	
		System.out.printf("Total: %12.2f € \n",preciotarta);
		
			
    }
  }
