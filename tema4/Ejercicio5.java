public class Ejercicio5{
    public static void main(String[] args) {
        
       
        int a,b;
        double x;
             
       System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax+b=0:  ");
       System.out.print("Introduzca el valor de a :  ");
       a=Integer.parseInt(System.console().readLine());
       System.out.print("Introduzca el valor de b :  ");
       b=Integer.parseInt(System.console().readLine());
       
       
       if (a==0) {
		   
				
				System.out.println("Esta ecuación no tiene solución real");
		} else {
				
				x = -(b/(double)a);
				System.out.println("x = "+x);
				
						
		}
						 
		 
		
		
    }
}
