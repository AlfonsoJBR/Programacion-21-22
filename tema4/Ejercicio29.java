public class Ejercicio29{
    public static void main(String[] args) {
        
		String comida="",tipoPitufo="",bebida="";
		double precioComida=0,precioBebida=0;
		
		
		System.out.print("¿Que ha tomado de comer? (palmera, donut o pitufo): ");
		comida=System.console().readLine();
        
		if ("pitufo".equals(comida)) {
		   	System.out.print("¿Que tipo de pitufo? (aceite,tortilla): ");
			tipoPitufo=System.console().readLine();
		}	
       
		System.out.print("¿Que ha tomado de beber (zumo o cafe): ");
		bebida=System.console().readLine();
		
		switch (comida) {
			case "palmera":
				precioComida=1.40;
				comida="Palmera";
			break;
			case "donut":
				precioComida=1.0;
				comida="Donut";
			break;
			case "pitufo":
				if ("tortilla".equals(tipoPitufo)) {
					precioComida=1.60;
					comida="Pitufo con tortilla";
				}else{
					precioComida=1.20;
					comida="Pitufo con aceite";
				}
			break;			
		}
		
		if ("cafe".equals(bebida)) {
			precioBebida=1.2;
			bebida="Cafe";
		}else{
			precioBebida=1.50;
			bebida="Zumo";
		}		
		System.out.println(comida+": "+precioComida);
		System.out.println(bebida+": "+precioBebida);
		System.out.println("Total:  "+(precioBebida+precioComida));
			
    }
  }
