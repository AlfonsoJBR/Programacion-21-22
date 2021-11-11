public class Ejercicio28{
    public static void main(String[] args) {
        
		
		String jugador1="",jugador2="";
		int control=0;
		
		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera) ");
		jugador1=System.console().readLine();
       
		if (!(("piedra".equals(jugador1)) || ("papel".equals(jugador1)) || ("tijera".equals(jugador1)))) {
		   	control=1;
		}	
       
		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera) ");
		jugador2=System.console().readLine();
		
		if (!(("piedra".equals(jugador2)) || ("papel".equals(jugador2)) || ("tijera".equals(jugador2)))) {
		   	control=control+2;
		}	
		
		
		switch (control) {
			case 1:
				System.out.println("El jugador 1 se equivocó. el juego acabó");
			break;	
			case 2:
				System.out.println("El jugador 2 se equivocó. el juego acabó");
			break;	
			case 3:
				System.out.println("los dos se han equivocado, el juego acabó");
			break;		
			default:
				switch (jugador1) {
					case "piedra":
						if ("piedra".equals(jugador2)) {
							System.out.println("Empate!!!");
						}else{
							if ("papel".equals(jugador2)) {		
								System.out.println("Gana el jugador 2");
							}else{ 
								 System.out.println("Gana el jugador 1");	
							}
						}
					break;
					
					case "papel":
						if ("papel".equals(jugador2)) {
							System.out.println("Empate!!!");
						}else{
							if ("tijera".equals(jugador2)) {		
								System.out.println("Gana el jugador 2");
							}else{ 
								 System.out.println("Gana el jugador 1");	
							}
						}
					break;
					case "tijera":
						if ("tijera".equals(jugador2)) {
							System.out.println("Empate!!!");
						}else{
							if ("piedra".equals(jugador2)) {		
								System.out.println("Gana el jugador 2");
							}else{ 
								 System.out.println("Gana el jugador 1");	
							}
						}
					break;
				}		
			
		}
		
	
			
    }
  }
