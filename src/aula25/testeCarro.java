package aula25;

public class testeCarro {

	public static void main(String[] args) {

		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;

		//System.out.println(van.marca);
		
		//van.exibirAutonomia();
		
		double autonomia = van.obterAutonomia();
		//System.out.println(autonomia);
		
		double qtdCombustivel = van.calculaCombustivel(10);
		//System.out.println(qtdCombustivel);
		
		ContaCorrente minhaConta = new ContaCorrente();
		
		minhaConta.numero = 1;
		minhaConta.isSpecial = true;
		minhaConta.limite = 500.00;
		minhaConta.saldo = 1000;
		
		minhaConta.consultaEspecial();
		minhaConta.consultarSaldo();
		minhaConta.depositar();
		minhaConta.consultarSaldo();
		double saque = minhaConta.realizarSaque();
		System.out.println("Meu saque: " + saque);
		minhaConta.consultarSaldo();
		
	}

}
