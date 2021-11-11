public class Ejercicio4 {
    public static void main(String[] args) {
        
       
        int horas,paga;
             
       System.out.print("Introduzca las horas trabajadas esta semana:  ");
       horas=Integer.parseInt(System.console().readLine());
       
       if ((horas>=1)&&(horas<=40)) {
		   
				paga=horas*12;
				System.out.println("Su paga semanal son :"+paga+" Euros");
		} else {
				
				if ((horas>=200) || (horas<=0)) {
					System.out.println("Usted no ha trabajado esta semana o las horas que ha puesto exceden la capacidad humana. Buenas tardes!!!");
				}else{
					 paga=((horas-40)*16)+(40*12);
					 System.out.println("Su paga semanal son :"+paga+" Euros");
						
				}
			}			 
		 
		
		
    }
}
