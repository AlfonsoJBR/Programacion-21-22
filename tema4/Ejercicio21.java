public class Ejercicio22{
    public static void main(String[] args) {
        
       String dia;
       int hora,minuto,tiempo;
       
       
       System.out.print("Introduzca dia (de lunes a viernes) : ");
       dia=System.console().readLine();
       
       System.out.print("Introduzca hora:  ");
       hora=Integer.parseInt(System.console().readLine());
       
       System.out.print("Introduzca minutos:  ");
       minuto=Integer.parseInt(System.console().readLine());
		
		switch (dia) {
			case "lunes":
			tiempo=((24*60*4)+(hora*60)+minuto);
			break;
			case "martes":
			tiempo=((24*60*3)+(hora*60)+minuto);
			break;
			case "miercoles":
			tiempo=((24*60*2)+(hora*60)+minuto);
			break;
			case "jueves":
			tiempo=((24*60*1)+(hora*60)+minuto);
			break;
			case "viernes":
			tiempo=((hora*60)+minuto);
			break;
			Default:
			System.out.println("El dia no es correcto. No puedo computar los minutos.");
			
		}	
		if (("viernes".equals(dia)) && (hora>15)) {
			System.out.println("El dia no es correcto. No puedo computar los minutos.");
			}else{	
				System.out.println("quedan "+tiempo+" minutos para el viernes a las 15:00");
			}
		
    }
  }
