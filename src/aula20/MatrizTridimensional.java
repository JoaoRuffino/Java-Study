package aula20;

public class MatrizTridimensional {

	public static void main(String[] args) {
		
		double[][][] cubo = new double[3][3][3];
		
		double soma = 0;
		double somaPares = 0;
		double somaImpares = 0;
		
		for(int i = 0; i < cubo.length; i++) {
			for(int j = 0; j < cubo[i].length; j++) {
				for(int k = 0; k < cubo[i][j].length; k++){
					cubo[i][j][k] = i + j + k;
					soma += cubo[i][j][k];
					
					if(cubo[i][j][k] % 2 == 0) {
						somaPares += cubo[i][j][k];
					}else {
						somaImpares += cubo[i][j][k];
					}
					
				}
			}
		}
		
		System.out.println("Soma total = " + soma);
		System.out.println("Soma dos Pares = " + somaPares);
		System.out.println("Soma dos Impares = " + somaImpares);
	}

}
