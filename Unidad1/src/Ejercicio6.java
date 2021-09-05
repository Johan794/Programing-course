import java.util.Scanner;
public class Ejercicio6 {
     public static double OCHOPORCIENTO = 0.08;
     public static double DIEZPORCIENTO = 0.1;
     
	public static void main(String[] args) {
		int precioSinDescuento = 0;
		int totalAPagar = 0;
		int cantidad , precio;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad: ");
		  cantidad = sc.nextInt();
		System.out.print("Ingrese el precio: ");
		  precio = sc.nextInt();
		
		  precioSinDescuento = cantidad * precio;
		  System.out.println(precioSinDescuento);
		  if(precioSinDescuento<50000) {
			  System.out.println("Se le aplico el 8%");
			  totalAPagar = (int)((int) precioSinDescuento-(precioSinDescuento*OCHOPORCIENTO));
		  }else {
			  System.out.println("Se le aplico el 10%");
			  totalAPagar = (int)((int) precioSinDescuento-(precioSinDescuento*DIEZPORCIENTO));
		  }
		  
		   System.out.println("El total a pagar es: "+totalAPagar);
		  

	}

}
