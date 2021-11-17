/*
 Alfonso Bravo Romo 08/11/2021
 DAW 1 
 Dibujar un calendario del mes que se pida por teclado
 */


public class Ex08abr4{
	
	public static void main (String[] args) {
      
      int dias=31,x=0;
      String mes, dia, bisiesto, caracter=" ";
      
      System.out.print("Indique el mes (en minuscula): ");
      mes=System.console().readLine();
      if ("febrero".equals(mes) {
        
          System.out.print("¿Es un año bisiesto? (s/n) : ");
          bisiesto=System.console().readLine();
      }
          
      System.out.print("Indique el dia de la semana en el que empieza el mes (en minusculas) : ");
      dia=System.console().readLine();
      
      
      
      
      if ("abril".equals(mes) || "junio".equals(mes) || "septiembre".equals(mes) || "noviembre".equals(mes)) {
        dias=30;
      }
      if ("febrero".equals(mes) && "s".equals(bisiesto)){
        dias=29;
      }else if ("febrero".equals(mes) && "n".equals(bisiesto))  {
        dias=28;
      }    
      
      
        
          System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
          System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
          System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
         
        for (int i=1;i<=5;i++){
          
          for (int j=1;j<=7;j++) {
           x=x+1; 
             if (x<=dias && dias<10) { 
                System.out.printf("%3d │ ",x);
                System.out.print(" ");

                
             }else if (x<=dias && dias>=10) {
                System.out.print("│"+x+" "); 
                
             } else {
                System.out.print("│   ");

             }   
          } 
           System.out.println("│");
           System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
        }   
           
           
           System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
           
           
          
          
          
      
    
    
    
    
    
    
		
	}
}

