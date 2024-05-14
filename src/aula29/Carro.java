package aula29;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	public Carro(String marca, String modelo, int numPassageiros, double capCombustivel, double consumoCombustivel) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
	}
	
	Carro(){		
	}

	void exibirAutonomia() {
		System.out.println("A autonomia do " + modelo + " é de: " + (this.capCombustivel * this.consumoCombustivel) + "km");
	}
	
	double obterAutonomia() {
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		return km / this.consumoCombustivel;
	}
}
