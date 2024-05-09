package aula19;

public class vetores {
	public static void main(String[] args) {
		
		double[] temperaturas = new double[10];
		
		
		for(int i = 0; i < temperaturas.length; i++) {
			temperaturas[i] = i;
			System.out.println(temperaturas[i]);
		}
		
		for(double temp : temperaturas) {
			System.out.println(temp);
		}
		
	}
}
