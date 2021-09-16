import java.util.Scanner;
public class Bisiesto_Secular {
 public static final double CONS = 30.417;
 public static final int BI = 366;
 public static final int NO_BI= 365;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el año");
		int year = sc.nextInt();
		System.out.println("Ingrese los meses");
		int month = sc.nextInt();
		System.out.println("Ingrese los dias");
		int days = sc.nextInt();
		month = month -1;
		if(year%4==0 || year%400==0) {
			System.out.println("Es biciesto");
			int percent = (int) ((((month*CONS)+days)/BI)*100);
			System.out.println("Ha pasado "+percent+"% del año");
		}else {
			System.out.println("No es biciesto");
			int percent = (int) ((((month*CONS)+days)/NO_BI)*100);
			System.out.println("Ha pasado "+percent+"% del año");
		}



	}

}
