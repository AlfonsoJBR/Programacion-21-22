
public class ejercicio1 {
	
	public static void main (String[] args) {
		
    int num,total=0;
    for (int i=1; i<=3; i++) {
      num=(int)(Math.random()*6+1);
      System.out.println("Tirada número "+i+" :"+num);
      total=total+num;
    }  
    System.out.println("La suma total da : "+total);
  
  }
}    
