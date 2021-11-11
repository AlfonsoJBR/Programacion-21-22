public class Ejercicio26{
    public static void main(String[] args) {
        
		String tarjetacine="",dia="",tipoentrada="";
		int entradas=0,entradaparejas=0;
		double descuento=0,precioentrada=8,total=0;
       
       System.out.println("Venta de entradas Cinecampa ");
       System.out.println("--------------------------- ");
       System.out.print("Introduzca número de entradas: ");
       entradas=Integer.parseInt(System.console().readLine());
       
       System.out.print("Introduzca dia de la semana: ");
       dia=System.console().readLine();
       
       System.out.print("Tiene tarjeta Cinecampa (s/n): ");
       tarjetacine=System.console().readLine();
		
		
		if ("s".equals(tarjetacine)) {
			descuento=0.1;
		}	
		switch (dia) {
			
				
				
			
			case "jueves":
				entradaparejas=entradas/2;	
				entradas=entradas%2;
				total=(entradaparejas*11)+(entradas*precioentrada);
			break;
      case "miercoles":
      precioentrada=5.0;
				        
			default:
				total=precioentrada*entradas;
					
					
		}	
		
		System.out.println("Gracias por su compra, aqui tiene las entradas" );
		System.out.println("----------------------------------------------" );
		if (entradaparejas!=0)  {
					System.out.printf("Entrada parejas: %15d  \n",entradaparejas);
					System.out.println("Precio por entrada de pareja: 11.00 €");
    }      
    if (entradas!=0) {
				  System.out.printf("Entrada individual : %11d  \n",entradas);	
					System.out.println("Precio por entrada indiviudal: "+(double)precioentrada+" € ");
		}	  
				
		System.out.printf("Total: %28.2f € \n",total);
		System.out.printf("Descuento: %24.2f € \n",(total*descuento));
		System.out.printf("A pagar: %26.2f € \n",(total-(total*descuento)));
			
    }
  }
