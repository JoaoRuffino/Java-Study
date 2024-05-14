package aula21;

import java.util.Random;

public class Foreach {
	public static void main(String args[]) {
		Random rd = new Random();
		
		int[] notas = new int[10];
		
		for(int i = 0; i < notas.length; i++) {
			notas[i] = rd.nextInt(10);
		}
		
		
		for(int item : notas) {
			System.out.print(item + " ");
		}
		
	}
}
