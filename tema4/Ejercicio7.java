public class Ejercicio7{
    public static void main(String[] args) {
        
       
       
       double nota1, nota2, nota3, media;
             
       System.out.print("Introduzca la nota 1 , por favor:  ");
       nota1=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca la nota 2 , por favor:  ");
       nota2=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca la nota 3 , por favor:  ");
       nota3=Double.parseDouble(System.console().readLine());
       
       media= (nota1+nota2+nota3)/3;
       System.out.print("La media obtenida es: " );
       System.out.printf( "%.2f  \n ",media);
       
				
						
						 
		 
		
		
    }
}
