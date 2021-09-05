
public class Ejericicio1 {

	public static void main(String[] args) {
		int numero = 10;
		System.out.println("Inicial "+numero);
		int numero2 = numero+9;
		System.out.println("Despues de la suma: "+numero2);
		int numero3 = numero-4;
		System.out.println("Despues de la resta: "+numero3);
		int numero4 = numero/5;
		System.out.println("Despues de la division: "+numero4);
				
		if(numero%2==0) {
			System.out.println("El numero es par");
			System.out.println(numero);
		}else {
			System.out.println("El numero es inpar");
			System.out.println(numero);
		}

	}

}
