public class Ejercicio12 {
    public static void main(String[] args) {
        float nota1,notamedia,nota2;
             
        System.out.println("Introduce la nota del primer examen:");
        nota1=Float.parseFloat(System.console().readLine());
        System.out.println("Introduce la nota objetivo a llegar en el trimestre:");
        notamedia=Float.parseFloat(System.console().readLine());
        nota2=((notamedia-(nota1*0.40f))/0.60f);
        System.out.println("la nota necesaria para el segundo examen es: "+nota2);
        
    }
}
