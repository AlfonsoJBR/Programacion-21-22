public class Prueba { 
  public static void main (String[] args){
    
      //esto es un comentario de una linea
      /* esto es comentario
        de varias lineas
        vale*/
        int nota1;
        int nota2;
        int nota3;
        // tambien se puede hacer int nota1,nota2,nota3
        String entrada;
      System.out.println("Hola:");
      System.out.println("Introduzca un numero entero:");
      entrada = System.console().readLine();
      System.out.println("la cadena introducida es:"+entrada);
      nota1 = Integer.parseInt(entrada);
      
      System.out.print("la cadena introducida es :");
      System.out.println(nota1);
      
  }
}
