/*
Alfonso Bravo Romo 08/11/21 
* DAW 1
 * Hacer un programa que conviertea los numeros de un pin a letras
 */


public class Ex08abr3 {
	
	public static void main (String[] args) {
    
    int pin, potencia=0, pinDecapado=0;
    String palabra="";
    
    System.out.print("Introduzca el PIN :" );
    pin=Integer.parseInt(System.console().readLine());
    
    /*en este for sacamos la potencia que tiene ese número para luego poder "cortarlo"*/
    for (int i=1; i<=pin ; i=i*10) {
      potencia=i;
    }
    /*en este for cortamos una rodaja del numero lo pasamos por un switch donde le asignamos su palabra correspondiente y luego lo sacamos por pantalla*/
    for (int j=potencia; j>0; j=j/10) {
      pinDecapado=pin/j;
      
      switch (pinDecapado) {
        case 1: 
          palabra="uno";
          break;
        
        case 2: 
          palabra="dos";
          break;
        
        case 3: 
          palabra="tres";
          break;
        case 4: 
          palabra="cuatro";
          break;
        case 5: 
          palabra="cinco";
          break;
        case 6: 
          palabra="seis";
          break;
        case 7: 
          palabra="siete";
          break;
        case 8: 
          palabra="ocho";
          break;  
         case 9: 
          palabra="nueve";
          break; 
        case 0: 
          palabra="cero";
          break;   
        default: 
      }
      System.out.print(palabra+"  ");
      pin=pin%j;
    }  
            
	}
}

