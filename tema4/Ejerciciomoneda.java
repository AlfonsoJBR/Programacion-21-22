public class Ejerciciomoneda{
    public static void main(String[] args) {
        
      double importe,importe1=0,importe2=0,importe3=0,importe4=0;
      int tipomoneda;
      String simbolo1="",simbolo2="",simbolo3="",simbolo4="";
      final double eurodolar=0.86,eurolibra=1.19,euroyen=0.0073,euroyuan=0.13;
             
      System.out.print("Introduzca cantidad: ");
      importe=Double.parseDouble(System.console().readLine());
      System.out.print("Introduzca tipo moneda (1-dolar,2-libra,3-yen, 4-yuan, 5-euro: ");
      tipomoneda=Integer.parseInt(System.console().readLine());
      


       
      switch (tipomoneda) {
        case 1 :
          importe1=importe*0.86;
          importe2=importe*0.86/1.19;
          importe3=importe*0.86/0.0075;
          importe4=importe*0.86/0.13;
          simbolo1="Euros";
          simbolo2="Libras";
          simbolo3="Yen";
          simbolo4="Yuan"; 
		   break;
		   case 2:
          importe1=importe*0.86;
          importe2=importe*1.19/0.86;
          importe3=importe*0.86*0.0075;
          importe4=importe*0.86*0.13;	
          simbolo1="Euros";
          simbolo2="Dolar";
          simbolo3="Yen";
          simbolo4="Yuan"; 
       break;
		   case 3:
          importe1=importe*0.86;
          importe2=importe*0.86*1.19;
          importe3=importe*0.86*0.0075;
          importe4=importe*0.86*0.13;	
          simbolo1="Euros";
          simbolo2="Libras";
          simbolo3="Dolar";
          simbolo4="Yuan"; 
       break;
       case 4:
           importe1=importe*0.86;
           importe2=importe*0.86*1.19;
           importe3=importe*0.86*0.0075;
           importe4=importe*0.86*0.13;
           simbolo1="Euros";
          simbolo2="Libras";
          simbolo3="Dolar";
          simbolo4="Yen"; 
		   break;
		   case 5:
           importe1=importe*0.86;
           importe2=importe*0.86*1.19;
           importe3=importe*0.86*0.0075;
           importe4=importe*0.86*0.13;
           simbolo1="Euros";
          simbolo2="Libras";
          simbolo3="Yen";
          simbolo4="YUan"; 
		   break;
		   default:
          System.out.println("la moneda expresada no existe. FIN");
		   
		   break;
		 }
		 System.out.printf("El cambio en %6s es : %7.2f \n",simbolo1,importe1);
		 System.out.printf("El cambio en %6s es : %7.2f \n",simbolo2,importe2);
     System.out.printf("El cambio en %6s es : %7.2f \n",simbolo3,importe3);
     System.out.printf("El cambio en %6s es : %7.2f \n",simbolo4,importe4);  
    }
}
