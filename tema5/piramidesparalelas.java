public class piramidesparalelas{
	public static void main (String[] args) {
  
    int altura1,altura2;
    
    System.out.println("Introduzca altura pirámide número 1:");
    altura1=Integer.parseInt(System.console().readLine());
  
    System.out.println("Introduzca altura pirámide número 2:");
    altura2=Integer.parseInt(System.console().readLine());
  
    if (altura1>altura2) {
      hmax=altura1;
    }else{
      hmax=altura2;
    }
    int espaciosPir1=0,espaciosPir2=0;
    int rellenoPir1=altura1,rellenoPir2=altura2; 
    
    
    for (int i = 0; i<=hmax;i++){
      
      for (int j=0; j < espaciosPir1; j++) {
        System.out.print(" ");
       } 
      for (int j=0; j<rellenoPir1; j++) {
         System.out.print("o");
      }
      
      for (int j=0; j < espaciosPir1-1; j++) {
        System.out.print("o");
       } 
      
      for (int j=0; j < espaciosPir1; j++) {
        System.out.print(" ");
       }
       
       for (int j=0; j < espaciosPir2; j++) {
        System.out.print(" ");
       }  
       espaciosPir1++;
       rellenoPir1--;
       espaciosPir2++;
       rellenoPir2--;
       
      
         
 
  
  
  }
}  
