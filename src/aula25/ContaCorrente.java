package aula25;
import java.util.Scanner;

public class ContaCorrente {
	int numero;
	double saldo;
	boolean isSpecial;
	double limite;
	Scanner sc = new Scanner(System.in);
	
	
	double realizarSaque() {
		if(saldo > 0) {
			System.out.println("Deseja sacar quanto?");
			double saque = sc.nextDouble();
			if(saque > saldo) {
				System.out.println("Saldo insuficiente!");
			}else {
				saldo = saldo - saque;
				System.out.println("Saque realizado com sucesso!");
				return saque;
			}
		}else {
			System.out.println("Não é possível realizar saque!");
		}
		return 0;
	}
	
	void depositar() {
		System.out.println("Deseja depositar qual quantia?");
		double deposito = sc.nextDouble();
		saldo = saldo + deposito;
		System.out.println("Depósito realizado com sucesso!");
	}
	
	void consultarSaldo() {
		System.out.println("Seu saldo é de R$" + saldo);
	}
	void consultaEspecial() {
		if(isSpecial) {
			System.out.println("Sua conta é especial");
		}else {
			System.out.println("Sua conta não é especial");
		}
	}
	
}
