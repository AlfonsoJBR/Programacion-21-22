public class Ejercicio23{
    public static void main(String[] args) {
        
       String codigopromocional,tipoiva;
       double baseimponible=0,promo=0,iva=0;
       int control=0;
       
       
       System.out.print("Introduzca base imponible: ");
       baseimponible=Double.parseDouble(System.console().readLine());
       
       System.out.print("Introduzca tipo de iva (superreducido,reducido, general) : ");
       tipoiva=System.console().readLine();
       
       System.out.print("Introduzca el código promocional (nopro, mitad, meno5, 5porc) : ");
       codigopromocional=System.console().readLine();
		
		switch (tipoiva) {
			case "superreducido":
			iva=4;
			break;
			case "reducido":
			iva=10;
			break;
			case "general":
			iva=21;
			break;
			default:
				control=1;
		}
		
		switch (codigopromocional) {
			case "nopro":
				promo=0;
				
			break;
			case "mitad":
				promo=((baseimponible*(1+(iva/100)))/2);
			break;
			case "meno5":
				promo=5;
			break;
			case "5porc":
				promo=((baseimponible*(1+(iva/100)))*0.05);
			break;
			default: 
			   control=2;
		}
			
		switch (control) {
			case 1:
				System.out.println("El iva no es correcto. No puedo computar la factura");
			break;
			case 2:
				System.out.println("la promo no es correcta. No puedo computar la factura");
			break;
			default:
				System.out.printf("Base imponible: %19.2f \n",baseimponible);
				System.out.printf("IVA ("+iva+"): %23.2f \n",((baseimponible*iva)/100));
				System.out.printf("Precion con IVA: %18.2f \n",(baseimponible*(1+(iva/100.0))));
				System.out.printf("Cód. promo ("+codigopromocional+"): %14.2f \n",promo);
				System.out.printf("Total: %28.2f \n",(baseimponible*(1+(iva/100.00))-promo));
		}	
    }
  }
