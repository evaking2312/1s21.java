import java.util.Scanner;

public class P5_1S21_P3º{

	public static int promedio(int a, int b, int c,){
		return ((a+b+c)/3);
	} 

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int [] numeros = new int[10];
		for (int x=0;x<10;x++){
			System.out.println("Ingresa el valor de un numero["+(x+1)+"]: ");
			numeros[x]=teclado.nextInt();
		}
		return numeros;
	}

	public static void main(String[] args) {	
		System.out.println("el promedio de 3 numeros es "+promedio(5,7,9));
		int[] arreglo = captura();
		for (a=0; a<arreglo.length;a++){
			System.out.println("valor en la posicion["+(a+1)+"]: "+arreglo[a]);
		} 
	}
} 