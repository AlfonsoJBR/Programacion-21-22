
public class ejercicio5{
	
	public static void main (String[] args) {
		
    int num,nummayor=0,nummenor=199,nummedia=0;
    for (int i=1 ; i<=50; i++){
        num=(int)(Math.random()*101)+100;
        System.out.print(num+" ");
        if (num>nummayor) {
          nummayor=num;
        }
        if (num<nummenor){
          nummenor=num;  
        }
        nummedia=nummedia+num;
          
    }   
    System.out.println(); 
    System.out.println("El número mayor es :"+nummayor);
    System.out.println("El número menor es :"+nummenor);
    System.out.println("La media es : "+nummedia);
  }
}    
