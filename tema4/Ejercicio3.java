public class Ejercicio3 {
    public static void main(String[] args) {
        
        String dia;
        int numero;
             
       System.out.print("Introduzca un número del 1 al 7 y le diré que día de la semana es:  ");
       numero=Integer.parseInt(System.console().readLine());
       
       switch (numero) {
		   case 1 :
				dia="Lunes";
				break;
		   case 2:
				dia="Martes";
				break;
		   case 3:
				dia="Miercoles";
				break;
		   case 4:
				dia="Jueves";
				break;
		   case 5:
				dia="Viernes";
				break;
			case 6:
				dia="Sabado";
				break;
			case 7:
				dia="Domingo";
			break;
		   default:
		   
		   dia="";
		   break;
		 }
		 
		 if ("".equals(dia)) {
			 System.out.println("Vaya!, el número introducido no está entre 1 y 7. Otra vez será");
		 } else {
			 System.out.println("El día es : "+dia);
		 }  
    }
}
