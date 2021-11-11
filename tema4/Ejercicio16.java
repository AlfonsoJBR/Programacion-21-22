public class Ejercicio16{
    public static void main(String[] args) {
        
       
       
		String respuesta;
		int puntuacion=0;
		
		        
             
		System.out.println("Test de pareja. Conteste v de verdadero o f falso");
		System.out.println("-------------------------------------------------");
		
		
		System.out.print("1. Tu pareja parece esta mas inquieta de lo normal sin ningun motivo : ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		
		System.out.print("2. Ha aumentado sus gastos de vestuario:  ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("3. Ha perdido el interes que antes mostraba por ti:");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("4. Ahora muestra mas interes en su aseo personal: ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("5. No te deja que mires la agenda del movil : ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("6. A veces recibe llamadas que no contesta estando tu delante : ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("7. Ultimamente se preocupa mas de mantener la linea : ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("8. Muchos dias llega muy tarde y dice que es culpa del trabajo: ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		
		System.out.print("9. Ultimamente usa mas perfume/colonia: ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		System.out.print("10. Se confunde y dice que ha estado en sitios que no ha ido contigo:  ");
		respuesta=System.console().readLine();
		if (("v".equals(respuesta)) || ("V".equals(respuesta))) {
			puntuacion=puntuacion+3;
		}
		
		
		if ((puntuacion>=0) && (puntuacion<=10)) {
			System.out.println ("Enhorabuena!! tu pareja parece ser totalmente fiel!!");
		}
		if ((puntuacion>=11) && (puntuacion<=22)) {
			System.out.println ("Quizas exista peligro de otra persona en su vida o en su mente, aunque seguramente sera algo sin importancia. no bajes la guardia!!!");
		}
		if ((puntuacion>=23) && (puntuacion<=30)) {
			System.out.println ("Si amigo o amiga, tu pareja esta liada con otro/otra");
		}
		
			
		
		
    }
  }
