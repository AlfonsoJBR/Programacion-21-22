public class Ejercicio9{
    public static void main(String[] args) {
        
       
       
       double radicando=0;
       double x1,x2, a, b, c;
             
       System.out.print("Introduzca el valor de a :  ");
       a=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca el valor de b:  ");
       b=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca el valor de c:  ");
       c=Double.parseDouble(System.console().readLine());
       
       if (a==0)  {
         if (b==0) {
            System.out.println("No es una ecuación");
         }else{
            x1=-c/b;
            System.out.println("Solo tiene una solución X1= "+x1);
          }  
       }else
          
          radicando=b*b-4*a*c;
          if (radicando>=0) {
              x1=(-b+Math.sqrt(radicando))/(2*a);
              x2=(-b-Math.sqrt(radicando))/(2*a);
              System.out.println("La solución x1 ="+x1+" y x2="+x2);
          }else{
              System.out.println("Esta ecuación da números imaginarios");
          
          }    
        }
        

       
      
				
    }

