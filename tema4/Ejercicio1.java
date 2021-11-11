public class Ejercicio1 {
    public static void main(String[] args) {
        
        String dia,asignatura;
             
       System.out.print("Introduzca día de la semana y le diré que asignatura tiene: ");
       dia=System.console().readLine();
       
       switch (dia) {
		   case "lunes" :
		   asignatura="Lenguages de Marca";
		   break;
		   case "martes":
		   asignatura="Entornos de desarrollo";
		   break;
		   case "miercoles":
		   asignatura="Lenguages de marca - Miercoles";
		   break;
		   case "jueves":
		   asignatura="Entornos de desarrollo - Jueves";
		   break;
		   case "viernes":
		   asignatura="Formación orientación laboral";
		   break;
		   default:
		   System.out.println("Ese día no tiene clase o no está correctamente escrito");
		   asignatura=" Ninguna";
		   break;
		 }
		 System.out.println("La asignatura es : "+asignatura);
		   
    }
}
