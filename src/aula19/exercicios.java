package aula19;

public class exercicios {
	public static void main(String[] args) {
		
		
		int[] vetorA = new int[10];
		char[] vetorB = new char[10];
		int[] vetorC = new int[10];
		
		for(int i = 0; i < vetorA.length; i++) {
			vetorA[i] = i + 1;
			//vetorB[i] = i + 3;
			//vetorC[i] = vetorB[i] - vetorA[i];
			//System.out.println(vetorC[i]);
		}
		
		
		for(int i = 0; i< vetorA.length; i++) {
			if(vetorA[i] < 7) {
				vetorB[i] = 'a';
			}else if(vetorA[i] == 7) {
				vetorB[i] = 'b';
			}else if (vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] = 'c';
			}else if(vetorA[i] == 10) {
				vetorB[i] = 'd';
			}else {
				vetorB[i] = 'e';
			}
			
			System.out.println("Posicao " + i + ": " + vetorB[i]);
		}
		
	}
}
