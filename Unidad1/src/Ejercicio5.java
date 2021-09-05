import java.util.Scanner;
public class Ejercicio5 {
	public static void main(String[] args) {
		String palabra = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese una palabra: ");
		palabra = sc.nextLine();
	
		if(palabra.length()>=10 && palabra.length()<=100) {
			 System.out.println("está en el rango");
		}else {
			System.out.println("No está en el rango");
		}
		
	}

}
