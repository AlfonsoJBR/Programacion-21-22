public class Ejercicioif {
  public static void main (String[] arg) {
    int n, resto;
    
    System.out.print("introduzca un entero : ");
    n=Integer.parseInt(System.console().readLine());
    resto=n%2;
    if (resto==0) {
      System.out.println("El numero"+n+" introducido es par ");
    }else{
      System.out.println("El numero"+n+" introducido es impar ");
    }  
  
  }
}
