import java.util.Scanner;
public class Casino {
	public static void main(String[] args) {
		int cara1 , cara2 , cara3;
		int cantidad6=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el valor del dado 1: ");
		cara1 = sc.nextInt();
		
		System.out.println("Ingrese el valor del dado 2: ");
		cara2 = sc.nextInt();
		
		System.out.println("Ingrese el valor del dado 3: ");
		cara3 = sc.nextInt();
		
		if(cara1==6) {
			cantidad6++;
		}
		
		if(cara2==6) {
			cantidad6++;
		}
		
		if(cara3==6) {
			cantidad6++;
		}
		
		switch(cantidad6) {
		
		   case 3: System.out.println("Excelente");
		              break;
		   case 2: System.out.println("Bueno");
		             break;
		   case 1: System.out.println("Regular");
		            break;
		   default: System.out.println("Pesimo");
		}
		

	}

}
