public class Ejercicioif2 {
  public static void main (String[] arg) {
    String ciudad;
    
    System.out.print("Cual es la capital de Karabati: ");
    ciudad=System.console().readLine();
    
    if (ciudad.equals("Tarawa")) {
      System.out.println("Bien!!! has acertado");
    }else{
        if (ciudad.equals("tarawa")) {
                System.out.println("Bien!!! has acertado, a pesar de haelo puesto en minusculas");
        }else{
            System.out.println("Ooooh! Has fallado! Estudia más geografia");
        }
    }  
  
  }
}
