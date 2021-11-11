public class Ejercicio15{
    public static void main(String[] args) {
        
       
       
		String simbolo;
		int opcion;
		
		System.out.println("Introduzca el simbolo que formara la piramide (numeros, letras, caracteres...:");
        simbolo=System.console().readLine();
        
        
             
		System.out.println("Elija orientacion de la piramide");
		System.out.println("--------------------------------");
		System.out.println("1. Vertice arriba");
		System.out.println("2. Vertice abajo");
		System.out.println("3. Vertice derecha");
		System.out.println("4. Vertice izquierda");
		System.out.print("Elija una opción (1-4): ");
		
		opcion=Integer.parseInt(System.console().readLine());
		
		switch (opcion) {
			case 1:
				System.out.println("   "+simbolo);
				System.out.println("  "+simbolo+" "+simbolo);
				System.out.println(" "+simbolo+"   "+simbolo);
				System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
			break;
			case 2:
				System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo+simbolo+simbolo);
				System.out.println(" "+simbolo+"   "+simbolo);
				System.out.println("  "+simbolo+" "+simbolo);
				System.out.println("   "+simbolo);
			break;
			case 3:
				System.out.println(simbolo);
				System.out.println(simbolo+"  "+simbolo);
				System.out.println(simbolo+"    "+simbolo);
				System.out.println(simbolo+"      "+simbolo);
				System.out.println(simbolo+"    "+simbolo);
				System.out.println(simbolo+"  "+simbolo);
				System.out.println(simbolo);
			break;
			case 4:
				System.out.println("   "+simbolo);
				System.out.println("  "+simbolo+simbolo);
				System.out.println(" "+simbolo+" "+simbolo);
				System.out.println("  "+simbolo+simbolo);
				System.out.println("   "+simbolo);
			break;
			default:
				System.out.println("No ha elegido una opcion correcto. No hay dibujo, lo siento"); 
			}
   
   
    }
}
