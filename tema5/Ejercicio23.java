public class Ejercicio23{
  	public static void main (String[] args) {
    
    int numero,contador=0,total=0;
    do {
      System.out.print("Introduzca número a sumar: ");
      numero=Integer.parseInt(System.console().readLine());
      contador=contador+1;
      total=total+numero;
    } while (total<=10000);
    System.out.println("La suma total es : "+total);
    System.out.println("Han sido : "+contador+" números");
    System.out.println("La media es : "+total/contador);
        
    }
}
