package aula33;

public class testeLampada {

	public static void main(String[] args) {
		Lampada lamparina = new Lampada("Normal", "Phillips", 1.5, false);
		
		System.out.println(lamparina.getVoltagem());
		lamparina.ligarLampada();
		System.out.println(lamparina.getIsOn());

	}

}
