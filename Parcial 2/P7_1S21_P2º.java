import java.util.Scanner;

public class P7_1S21_P2º{
	public static void main(String[] args) {
		char opc;
		Scanner teclado = new Scanner(System.in);

		do{
			System.out.println("M e n u  d e  o p c i o n e s");
			System.out.println("1. - Suma");
			System.out.println("2. - Resta");
			System.out.println("3. - Multiplicacion");
			System.out.println("4. - Division");
			System.out.println("S. - Salir");
			System.out.println("Que opcion deseas? ");
			opc = teclado.nextLine().charAT(0);
			switch(opc){
			case '1': System.out.println("aqui va la suma");break;
			case '2': System.out.println("aqui va la resta");break;
			case '3': System.out.println("aqui va la multiplicacion");break;
			case '4': System.out.println("aqui va la division");break;
			case 'S':
			case 's':	
				System.out.println("aqui va la opcion de salir");
				estado=false;
				break;	
			}
		}while(true);
	}
}