public class Ejercicio30{
	public static void main (String[] args) {
	
		int dia1,dia2,hora1,hora2;
    
    
    System.out.print("Introduzca hora primera : ");
    hora1=Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca dia primero 1 || 1 lunes, 2 martes,etc|| : ");
    dia1=Integer.parseInt(System.console().readLine());
    do {
      System.out.print("Introduzca hora segunda : ");
      hora2=Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca dia segundo || 1 lunes, 2 martes,etc||: ");
      dia2=Integer.parseInt(System.console().readLine());
    
      if (dia1>dia2) {
        System.out.println("El día segundo ha de ser igual o mayor que el día primero: ");
      }
    } while (dia1>=dia2);  
    int diaaux=0, horatotal=0;
    
    
    diaaux=dia2-dia1;
    horatotal=hora2-hora1;
    horatotal=horatotal+(diaaux*24);
    System.out.println("Entre las "+hora1+":00h del día "+dia1+" y las "+hora2+":00 h del día "+dia2+" hay "+horatotal+" hora/s");
    
    
    
  }
}    
