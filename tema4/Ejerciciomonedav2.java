public class Ejerciciomonedav2{
    public static void main(String[] args) {
        
      double importe,factor=0;
      int tipomoneda;
      ;
      final double eurodolar=1.16,eurolibra=0.84,euroyen=132.81,euroyuan=7.45,euro=1;
             
      System.out.print("Introduzca cantidad: ");
      importe=Double.parseDouble(System.console().readLine());
      System.out.print("Introduzca tipo moneda (1-dolar,2-libra,3-yen, 4-yuan, 5-euro: ");
      tipomoneda=Integer.parseInt(System.console().readLine());
      
      switch (tipomoneda) {
        case 1:
          factor=eurodolar;
        break;
        case 2:
          factor=eurolibra;
        break;
        case 3:
          factor=euroyen;
        break;
        case 4:
          factor=euroyuan;
        break;
        case 5:
          factor=euro;
        break;
        default:
      }  
      importe=importe/factor;
      if ((tipomoneda!=1) && (tipomoneda!=2) && (tipomoneda!=3) && (tipomoneda!=4) && (tipomoneda!=5)) {     
      
          System.out.println("la moneda expresada no existe. FIN");
      } else {
          if (tipomoneda!=1) {
            		 System.out.printf("El cambio en Dolares es : %7.2f \n",(importe*eurodolar));
          }
          if (tipomoneda!=2) {
            		 System.out.printf("El cambio en Libras  es : %7.2f \n",(importe*eurolibra));
          }
          if (tipomoneda!=3) {
            		 System.out.printf("El cambio en Yenes   es : %7.2f \n",(importe*euroyen));
          }
          if (tipomoneda!=4) {
            		 System.out.printf("El cambio en Yuanes  es : %7.2f \n",(importe*euroyuan));
          }
          if (tipomoneda!=5) {
            		 System.out.printf("El cambio en Euros   es : %7.2f \n",(importe));
          }
          
          
      }
		 
    }
}
