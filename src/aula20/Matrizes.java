package aula20;

public class Matrizes {
	public static void main(String args[]) {
		double[][] notas = new double[3][4];
		notas[0][0] = 9;
		notas[0][1] = 5.7;
		notas[0][2] = 8.3;
		notas[0][3] = 9.5;
		
		double soma = 0;
		
		for(int i = 0; i < notas.length; i++) {
			soma = 0;
			for(int j = 0; j < notas[i].length; j++) {
				soma = soma + notas[i][j];
				System.out.print(notas[i][j] + " ");
			}
			
			System.out.println("Media de notas: " + (soma/4));
			System.out.println();
		}
		
		double[][] notas2 = {{2, 4, 6, 7}, {4, 7, 9, 10}};
	}
}
