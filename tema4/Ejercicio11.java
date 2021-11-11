public class Ejercicio11{
    public static void main(String[] args) {
        
       
       
       
		int horas,segundo,minutos;
             
		System.out.print("Introduzca la hora en formato 24 horas  :  ");
		horas=Integer.parseInt(System.console().readLine());
       
        System.out.print("Introduzca los minutos :  ");
		minutos=Integer.parseInt(System.console().readLine());
       
      
		segundo=86400-((horas*3600)+(minutos*60));
      
      
		if ((horas<0) || (horas>23) || (minutos<0) || (minutos>60)) {
		  
		  System.out.println("La hora o los minutos introducidos no son correctos");
		}else{  
      
			System.out.println("quedan "+segundo+" segundos para la media noche");
		}
      
    }
}
