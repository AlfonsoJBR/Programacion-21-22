public class Ejercicio14{
    public static void main(String[] args) {
        
       
       
		String numOrden="";
		int numero;
             
		System.out.print("Introduzca un numero  y le dire si es par o divisible por 5 :  ");
		numero=Integer.parseInt(System.console().readLine());
       
            
		
      
      
		if ((numero%2==0) && (numero%5==0)) {
			System.out.println("El numero es divisible entre 5 y ademas numero par "); 
		}else{	
			if (numero%2==0) { 
				
				System.out.println("El numero es solo par "); 
			}else{
			    if (numero%5==0) {
					System.out.println("El numero es solo divisible entre 5 "); 
				}else{
					System.out.println("El numero no es ni par ni divisible entre 5 , lo siento"); 
				}	
			}
		}		
    
      
    
    }
}
