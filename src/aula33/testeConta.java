package aula33;

public class testeConta {

	public static void main(String[] args) {
		
		ContaCorrente conta1 = new ContaCorrente(123, 1050.67, false, 5000);
		
		conta1.sacar();
		conta1.depositar();
		conta1.consultarSaldo();
		conta1.isEspecial();

	}

}
