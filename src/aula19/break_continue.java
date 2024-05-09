package aula19;

public class break_continue {

	public static void main(String[] args) {
		
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				System.out.println("Achou o 5! Saindo do for...");
				break;
			}
			System.out.println(i + " Tentativa");
		}
		
		for(int i = 0; i <= 10; i++) {
			if(i == 5) {
				System.out.println("Achou o 5! Continuando...");
				continue;
			}
			System.out.println(i + " Tentativa");
		}
		
	}
}
