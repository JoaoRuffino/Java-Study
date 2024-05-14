package aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	void exibirAutonomia() {
		System.out.println("A autonomia do " + modelo + " é de: " + (capCombustivel * consumoCombustivel) + "km");
	}
	
	double obterAutonomia() {
		return capCombustivel * consumoCombustivel;
	}
	
	double calculaCombustivel(double km) {
		return km / consumoCombustivel;
	}
	
}
