public class Ejercicio24{
    public static void main(String[] args) {
        
		
		int control=0,tipoempleado=0,estadocivil=0;
		double dias=0,sueldobase=0,irpf=0;
      
       System.out.println("MiniNomina: ");
       System.out.println("----------- ");
       System.out.println("1. Programador junior");
       System.out.println("2. Programador senior");
       System.out.println("3. Jefe de proyecto ");
       
       System.out.print("Introduzca tipo de empleado: (1-3) : ");
       tipoempleado=Integer.parseInt(System.console().readLine());
       
       System.out.print("Cuantos dias ha estado de viaje visitando clientes : ");
       dias=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca su estado civil : (1 - soltero, 2 -casado): ");
		estadocivil=Integer.parseInt(System.console().readLine());
		
		switch (tipoempleado) {
			case 1:
			sueldobase=950;
			break;
			case 2:
			sueldobase=1200;
			break;
			case 3:
			sueldobase=1600;
			break;
			default:
				control=1;
		}
		
		switch (estadocivil) {
			case 1:
				irpf=25;
			break;
			case 2:
				irpf=20;
			break;
			default: 
			   control=2;
		}
			
		switch (control) {
			case 1:
				System.out.println("El tipo de empleado no es correcto. No puedo computar.");
			break;
			case 2:
				System.out.println("El estado civil no es correcto. No puedo computar ");
			break;
			default:
				System.out.println("--------------------------------------------");
				System.out.printf("Sueldo base: %19.2f \n",sueldobase);
				System.out.printf("Dietas ("+(int)dias+" viajes ) : %11.2f \n",(dias*30.0));
				System.out.println("--------------------------------------------");
				System.out.printf("Sueldo bruto: %18.2f \n",(sueldobase+(dias*30.0)));
				System.out.printf("Retención IRPF ("+(int)irpf+"):  %9.2f \n",(sueldobase+(dias*30))*(irpf/100.0));
				System.out.println("--------------------------------------------");
				System.out.printf("Sueldo neto: %19.2f \n",((sueldobase+(dias*30.0))-((sueldobase+(dias*30.0))*(irpf/100.0))));
		}	
    }
  }
