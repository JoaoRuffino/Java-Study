package aula20;



public class exercicio1 {
	public static void main(String args[]) {
		
		int[][] matriz = new int[4][4];
		
		System.out.println("Matriz criada: ");
		int maior = 0, linha = 0, coluna = 0;
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * 10);
				System.out.print(matriz[i][j] + " ");
				
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
					linha = i;
					coluna = j;
				}
			}
			System.out.println();
		}
		System.out.println("O maior numero gerado nessa matriz é: " + maior + " - Na posicão [" + linha + "][" + coluna + "]");
	}
}
