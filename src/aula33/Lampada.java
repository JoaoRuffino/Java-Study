package aula33;

public class Lampada {
	private String modelo;
	private String marca;
	private double voltagem;
	private boolean isOn;
	
	
	Lampada(){
		
	}
	
	Lampada(String modelo, String marca, double voltagem, boolean isOn){
		this.modelo = modelo;
		this.marca = marca;
		this.voltagem = voltagem;
		this.isOn = isOn;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getModelo() {
		return this.modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getMarca() {
		return this.marca;
	}

	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}
	
	public boolean getIsOn() {
		return isOn;
	}

	
	public void ligarLampada() {
		System.out.println("Luz acesa!");
		this.isOn = true;
	}
	public void desligarLampada() {
		System.out.println("Luz apagada!");
		this.isOn = false;
	}


	
	
	
}
