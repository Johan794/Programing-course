
public class Repaso {
	public static void main(String[] args) {
		int numero = 1; // 0 0  0 0
		String texto = "Hola";// ""
		char  caracter = 'a'; //''
		boolean booleano = false; // false
		int [] arreglo = new int[10]; // 0 1 2 3 4 5 6 7 8 9
		String [] arregloP = new String[11];//
		
		int numero2 = 0;
		System.out.println("El valor inicial de la variable es: "+numero2);
		
		if(numero>10) {
			numero2 = 100;	
		}else if(texto == "Hola como estas") {
			numero2 = 0;
		}else {
			numero2 = 23;
		}
		
		System.out.println(numero2);
		
		for(int i =0; i<texto.length(); i++) {
			System.out.println("El valor del contador es: "+i);
			switch(texto.charAt(i)) {
			  case 'H': System.out.println("Yo estoy bien y tu?");
			                           break;
			  case 'Y': System.out.println("Hola como estas");
			                break;
			  default: System.out.println("Hola no me vas a saludar?");
			}
		}
		
		System.out.println(numero*10);
		while(numero==9) {
			System.out.println("Estoy aprendiendo sobre Java :D");
			numero = numero+1;
		}
		
		do {
			System.out.println("Estoy aprendiendo sobre Java :D con el Do While");
			numero2++;
		}while(numero2==numero2+2);
	    arregloP[0]= "Buenos dias";
	    String entrada = "Hola Soy Jose";
	    
		for(int i=0; i<arreglo.length && !booleano; i++) {
			arreglo[i] = i+1;
			if(arregloP[i]==null) {
				arregloP[i] = entrada;
				booleano = true;
			}
			
		}
	
		for(int i =0; i<arreglo.length; i++) {
			System.out.println(arreglo[i]);
			System.out.println(arregloP[i]);
		}
		
		
		
		

	}

}
