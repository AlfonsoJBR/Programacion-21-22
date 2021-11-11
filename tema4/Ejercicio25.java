public class Ejercicio25{
    public static void main(String[] args) {
        
		
		int anchura=0,altura=0;
		double bordado=0, precio=0, preciototal=0;
		String escudo="";
      
       
       System.out.print("Introduzca la altura de la bandera en cm: ");
       altura=Integer.parseInt(System.console().readLine());
       
       System.out.print("Introduzca la anchura de la bandera en cm: ");
       anchura=Integer.parseInt(System.console().readLine());
       
       System.out.print("Quiere escudo bordado (s/n): ");
		escudo=System.console().readLine();
		
		
		if ("s".equals(escudo)) {
			bordado=2.50;
			escudo="Con escudo";
		}else{
			escudo="Sin escudo";	
		}	
		precio=altura*anchura*0.01;
		preciototal=precio+bordado+3.25;
		System.out.println("Gracias, aqui tiene el desglose de su compra :");
		System.out.printf("Bandera de "+(altura*anchura)+" cm2 : %10.2f € \n",precio);
		System.out.printf(escudo+" %20.2f € \n",bordado);
		System.out.println("Gastos de envio :          3,25 €");
		System.out.printf("Total: %24.2f € \n",preciototal);
			
    }
  }
