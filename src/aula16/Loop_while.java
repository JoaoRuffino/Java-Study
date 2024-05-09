package aula16;

public class Loop_while {
	public static void main(String[] args) {
		int i = 0;
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		
		
		do {
			System.out.println(i);
		}while(i <= 10);
		
		
		for(i = 0; i < 10; i++) {
			System.out.println("Valor de i: " + i);
		}
		
	}
}
