package aula33;

import java.util.Scanner;

public class ContaCorrente {
	private int numero;
	private double saldo;
	private boolean isEspecial;
	private double limite;
	
	Scanner sc = new Scanner(System.in);
	
	ContaCorrente(){
		
	}
	
	public ContaCorrente(int numero, double saldo, boolean isEspecial, double limite) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.isEspecial = isEspecial;
		this.limite = limite;
	}

	public double sacar() {
		System.out.println("Realizando saque na conta");
		if(this.saldo > 0) {
			System.out.println("Insira a quantia que deseja sacar: ");
			double saque = sc.nextDouble();
			if(saque > this.saldo) {
				System.out.println("Valor ultrapassa saldo!");
				return 0;
			}else {
				this.saldo = this.saldo - saque;
				System.out.println("Saque realizado com sucesso. Seu saldo é de " + this.saldo);
				return saque;
			}
		}else {
			System.out.println("Não é possível realizar saque!");
			return 0;
		}
	}
	
	public void depositar() {
		System.out.println("Realizando depósito...");
		System.out.println("Insira a quantia que deseja depositar: ");
		double deposito = sc.nextDouble();
		if(deposito <= 0) {
			System.out.println("Valor inválido!");
			return;
		}else {
			this.saldo = this.saldo + deposito;
			System.out.println("Depósito realizado com sucesso!");
			System.out.println("Seu saldo agora é de R$" + this.saldo);
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Seu saldo atual é de R$" + this.saldo);
		return;
	}
	
	public void isEspecial() {
		if(this.isEspecial) {
			System.out.println("Essa conta é especial!");
			return;
		}else {
			System.out.println("Essa conta não é especial!");
			return;
		}
	}
	
	
	
	
}
