class P12_1S21{
	public static void main(String[] args) {

		int a;

		for (a=0;a<0;a++){
			System.out.println("el valor para a es " +a);
		}
		System.out.println();
		System.out.println();
		a=10;
		for (;a<20;a+=2){ //a=a+2
			System.out.print("Valor de a nuevo " + a);
		}
		System.out.println();
		System.out.println();
		for (a=20; a>0;a--) { // a=a-1
			System .out.println("valor en decremento de a " +a);
		}
		a=1;
		for (; ; ) {
			System.out.println("Valor de a " + a);
			if (a>10) break;
			a++;
		}	
	}
}			