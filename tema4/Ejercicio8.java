public class Ejercicio8{
    public static void main(String[] args) {
        
       
       String nota;
       double nota1, nota2, nota3, media;
             
       System.out.print("Introduzca la nota 1 , por favor:  ");
       nota1=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca la nota 2 , por favor:  ");
       nota2=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca la nota 3 , por favor:  ");
       nota3=Double.parseDouble(System.console().readLine());
       
       media= (nota1+nota2+nota3)/3;
      
       
       
				
		if (media<=4.99) {
			nota="insuficiente";		
		}else {
			if ((media<=5.99) && (media >=5)) {
			  nota="suficiente";
			}else{
				if ((media>=6) && (media<=6.99)) {
					nota="bien";
				}else {
					if ((media<=8.99) && (media >=7)) {
						nota="notable";
					}else {
						 nota="sobresaliente";
					}
				}
			}
		}				
		
		 System.out.print("La media obtenida es: "+nota );			
    }
}
