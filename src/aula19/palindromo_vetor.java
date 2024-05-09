package aula19;

public class palindromo_vetor {

	public static void main(String[] args) {

		int[] vetor = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
		
		boolean palindromo = true;
		
		for(int i = 0, j = vetor.length - 1; i < vetor.length / 2; i++, j--) {
			
			if(vetor[i] == vetor[j]) {
				System.out.println(vetor[i] + " == " + vetor[j]);
				continue;
			}else {
				System.out.println(vetor[i] + " != " + vetor[j]);
				System.out.println("Não é um palíndromo");
				palindromo = false;
				break;
			}
		}
		
		if(palindromo) {
			System.out.print("Vetor: ");
			for(int num : vetor) {
				System.out.print(num + " ");
			}
			System.out.println("\nO vetor é um Palindromo");
		}
		
		
		
		
	}

}
