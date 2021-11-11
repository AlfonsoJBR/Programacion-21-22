public class Ejercicio13{
    public static void main(String[] args) {
        
       
       
		String numOrden="";
		int a,b,c;
             
		System.out.print("Introduzca el primer numero  :  ");
		a=Integer.parseInt(System.console().readLine());
       
        System.out.print("Introduzca el segundo numero :  ");
		b=Integer.parseInt(System.console().readLine());
		
		  System.out.print("Introduzca el tercer numero :  ");
		c=Integer.parseInt(System.console().readLine());
       
      
		
      
      
		if ((a>b) && (a>c)) {
			if (b>c) {
				numOrden=" "+a+" "+b+" "+c;
			}else{
				numOrden=" "+a+" "+c+" "+b;
			}	
		}
		if ((b>a) && (b>c)) {
			if (a>c) {
				numOrden=" "+b+" "+a+" "+c;
			}else{
				numOrden=" "+b+" "+c+" "+a;
			}	
		}
		if ((c>b) && (c>a)) {
			if (b>a) {
				numOrden=" "+c+" "+b+" "+a;
			}else{
				numOrden=" "+c+" "+a+" "+b;
			}	
		}
		
		
      System.out.println("Los número en orden de mayor a menor son "+numOrden); 
    }
}
