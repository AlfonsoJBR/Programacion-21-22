public class Ejercicio13 {
    public static void main(String[] args) {
        
        String cadena="";
             
        System.out.println("Introduce la primera frase: ");
        cadena=cadena+" "+System.console().readLine();
        System.out.println("Introduce la segunda frase: ");
        cadena=cadena+" "+System.console().readLine();
        System.out.println("Introduce la tercera frase: ");
        cadena=cadena+" "+System.console().readLine();
        System.out.println("Introduce la cuarta frase: ");
        cadena=cadena+" "+System.console().readLine();
        System.out.println("Introduce la quinta frase: ");
        cadena=cadena+" "+System.console().readLine();
       
        System.out.println("Ahora saldran en pantalla todas las frases juntas: ");
        System.out.println(cadena);
    }
}
