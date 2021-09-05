import java.util.Scanner;

public class Ejericiox {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int entradaNumero;
		String entradaString;
		
		System.out.println("Ingrese una palabra: ");
		entradaString = sc.nextLine();
		
		System.out.println("Ingrese un numero: ");
		
		entradaNumero = sc.nextInt();
		
		entradaNumero = entradaNumero+10;
		
		entradaString = entradaString.toUpperCase();
		
		
		
		System.out.println(entradaNumero);
		System.out.println(entradaString);
	}

}
