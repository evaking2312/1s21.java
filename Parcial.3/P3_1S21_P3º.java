public class P3_1S21_P3º{
	public static void elevacion(int a,int contador){
		System.out.println("el valor es " +a);
		if (!(contador == 5)) elevacion(a*2,contador+1);

	}


	public static void main(String[] args){
		int valor = 2;
		elevacion(valor,1);
		
	}
}