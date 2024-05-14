package aula34;


public class testeCalculadora {

	public static void main(String[] args) {
		//Static => nao precisar instanciar a classe para utilizar seus métodos
		System.out.println(MinhaCalculadora.soma(1.7, 4.6));
		System.out.println(multiplica(4, 3));

	}

	static int multiplica(int num1, int num2) {
		return num1 * num2;
	}
}
