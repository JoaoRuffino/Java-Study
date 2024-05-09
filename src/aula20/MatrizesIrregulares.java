package aula20;

import java.util.Scanner;

public class MatrizesIrregulares {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o número de pessoas entrevistadas: ");
		int pessoas = sc.nextInt();
		
		String[][] nomesFilhos = new String[pessoas][];
		
		int filhos = 0;
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Insira a quantidade de filhos da pessoa " + (i + 1) + ": ");
			filhos = sc.nextInt();
			nomesFilhos[i] = new String[filhos];
			for(int j = 0; j < filhos; j++) {
				System.out.println("Insira o nome do filho " + (j + 1) + ": ");
				nomesFilhos[i][j] = sc.next();
			}
		}
		
		for(int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Nome dos filhos da pessoa " + (i + 1));
			for(int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.print(nomesFilhos[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
