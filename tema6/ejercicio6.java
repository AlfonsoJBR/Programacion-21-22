
public class ejercicio6{
	
	public static void main (String[] args) {
		
    int num, intento=5, opcion;
    
    num=(int)(Math.random()*100);
        System.out.println("Adivine un número entre 0 y 100, tiene 5 intentos :" );
        System.out.println(num);

    
    do {
        intento=intento-1;
        System.out.print("Introduzca su número:  ");
        opcion=Integer.parseInt(System.console().readLine());
        
        if (num==opcion) {
          intento=-1;
          System.out.println("Ha acertado!!! . FIN" );

        }else{
           System.out.print("Error, le quedan "+intento+" intentos ");
           if (opcion<num) {
             System.out.println("El número secreto es mayor!!");
            }else{
             System.out.println("El número secreto es menor!!");
            }
        }
        
          
    }   while (intento>0);
    if (intento==0) {
      System.out.println("Se le han acabado los intentos y los ha fallado todos. Adios!!!");
    }
   }
}    
