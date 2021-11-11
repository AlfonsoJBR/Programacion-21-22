
public class ejercicio2 {
	
	public static void main (String[] args) {
		
    int num;
    String carta="",tipo="",num1;
    
      num=(int)(Math.random()*52+1);
      switch (num) {
        case 1-12:
          tipo="picas";
        break;  
        case 13-25:
          tipo="treboles";
        break;
        case 26-39:
          tipo="corazones";
        break;
        case 40-52:
          tipo="diamantes";
        break;
        num1=num;
        if (num=10 || num=22 || num=36 || num=49 ){
          num1="J"; 
    System.out.println("La carta es :"+carta+" de "+tipo);
  
  }
}    
