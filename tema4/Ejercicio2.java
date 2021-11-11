public class Ejercicio2 {
    public static void main(String[] args) {
        
        String dia;
        int hora;
             
       System.out.print("Introduzca la hora en formato 24h sin minutos y le devolveré un emotivo saludo:  ");
       hora=Integer.parseInt(System.console().readLine());
       
       if ((hora>=6)&&(hora<=12)) {
		   
				dia="Buenos días!!!";
		} else {
				
				if ((hora>=13) && (hora<=20)) {
					dia="Buenas tardes!!!";
				}else{
					if ((hora>=24) || (hora<=0))  {
						
						dia="Vaya! La hora introducida no es correcta o no existe, lo siento otra vez será";
					}else{	
						dia="Buenas noches!!!";
					}	
				}
			}			 
		 
		 System.out.println(dia);
		
    }
}
