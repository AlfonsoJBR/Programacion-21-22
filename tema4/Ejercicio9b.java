public class Ejercicio9{
    public static void main(String[] args) {
        
       
       
       
       double x1,x2, a, b, c;
             
       System.out.print("Introduzca el valor de a :  ");
       a=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca el valor de b:  ");
       b=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca el valor de c:  ");
       c=Double.parseDouble(System.console().readLine());
       
       
         
       
       x1= (-b+(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
      
       x2= (-b-(Math.sqrt(Math.pow(b,2)-4*a*c)))/(2*a);
       
			if (a==0) {
        System.out.println("Con a valor 0 no tiene solución");
      }else{
        System.out.println("Las soluciones obtenidas son x1= "+x1+" y x2 = "+x2
      }
    }
}
