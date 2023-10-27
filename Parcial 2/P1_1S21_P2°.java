public class P1_1S21_P2°{
	public static void main(String[] args) {
		int a=12;
		if (a<10){
			System.out.println("Si ingreso por que es verdadera");
		}
		if (a>10){
			System.out.println("Este segmento si se ejecuta por que se cumple la condicion");
		}
		if (true){
			System.out.println("Aqui se ejecuta por que es verdadero");
		}
		if (false){
			System.out.println("Esto no se ejecuta por que es falso");
		}
		if (a>10) == (true){
			System.out.println("Se ejecutara");
		}
		System.out.println("Continuamos con el codigo");
		System.out.println("");
		a=17;
		if (a>18){
			System.out.println("Eres mayor edad");
		}else{
			System.out.println("Eres menor de edad");
		}
		a=2;
		if (a == 1){
			System.out.println("Se evalua a 1");
		}else{ if (a == 2){
			System.out.println("Se evalua a 2");
		}else{ if (a == 3){
			System.out.println("Se evalua a 3");
		}else{
			System.out.println("Se evaluan los demas digitos");
		}
		//como valido una division entre 0
		int divisor=0;
		int dividento=0;

		if (divisor == 0){
			System.out.println("No es posible hacer la divison");
		}else{
			System.out.println("Si puedo realizar la divison");
		}		
	}
}