public class Ejercicio10{
    public static void main(String[] args) {
        
       
       
       
       int dia;
       String mes,horoscopo;
       horoscopo="";
             
       System.out.print("Introduzca su dia de nacimiento :  ");
       dia=Integer.parseInt(System.console().readLine());
       
       System.out.print("Introduzca su mes de nacimiento:  ");
       mes=System.console().readLine();
       
      
       if ((("marzo".equals(mes)) && (dia>=21) && (dia<=31)) || (("abril".equals(mes)) && (dia>=1) && (dia<=19))) {
		   horoscopo="Aries";
	   }
      
       if ((("abril".equals(mes)) && (dia>=20) && (dia<=30)) || (("mayo".equals(mes)) && (dia>=1) && (dia<=20))) {
		   horoscopo="Tauro";
	   }
	   if ((("mayo".equals(mes)) && (dia>=21) && (dia<=31)) || (("junio".equals(mes)) && (dia>=1) && (dia<=20))) {
		   horoscopo="Géminis";
	   }
	   if ((("junio".equals(mes)) && (dia>=21) && (dia<=30)) || (("julio".equals(mes)) && (dia>=1) && (dia<=22))) {
		   horoscopo="Cáncer";
	   }
	   if ((("julio".equals(mes)) && (dia>=23) && (dia<=31)) || (("agosto".equals(mes)) && (dia>=1) && (dia<=22))) {
		   horoscopo="Leo";
	   }
	   if ((("agosto".equals(mes)) && (dia>=23) && (dia<=31)) || (("septiempbre".equals(mes)) && (dia>=1) && (dia<=22))) {
		   horoscopo="Virgo";
	   }
	   if ((("septiembre".equals(mes)) && (dia>=23) && (dia<=30)) || (("octubre".equals(mes)) && (dia>=1) && (dia<=22))) {
		   horoscopo="Libra";
	   }
	   if ((("octubre".equals(mes)) && (dia>=23) && (dia<=31)) || (("noviembre".equals(mes)) && (dia>=1) && (dia<=21))) {
		   horoscopo="Escorpio";
	   }
		if ((("noviembre".equals(mes)) && (dia>=21) && (dia<=30)) || (("diciembre".equals(mes)) && (dia>=1) && (dia<=21))) {
		   horoscopo="Sagitario";
	   }
	   if ((("diciembre".equals(mes)) && (dia>=22) && (dia<=31)) || (("enero".equals(mes)) && (dia>=1) && (dia<=19))) {
		   horoscopo="Capricornio";
	   }
	   if ((("enero".equals(mes)) && (dia>=20) && (dia<=31)) || (("febrero".equals(mes)) && (dia>=1) && (dia<=18))) {
		   horoscopo="Acuario";
	   }	
	   if ((("febrero".equals(mes)) && (dia>=19) && (dia<=29)) || (("marzo".equals(mes)) && (dia>=1) && (dia<=20))) {
		   horoscopo="Piscis";
	   }
	   if ("".equals(horoscopo)) {
		   System.out.println("La fecha o el dia que ha introducido no son correctos!");
	   }else {
		System.out.println("Su horoscopo es "+horoscopo);			
		}
    }
}
