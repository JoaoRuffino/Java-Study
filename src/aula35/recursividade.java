package aula35;

public class recursividade {
	public static void main(String args[]) {
		
		System.out.println(fatorial(3));
		
		
	}
	
	static int fatorial(int num) {
		
		if(num == 0) {
			return 1;
		}
		return num * fatorial(num - 1);
	}
}
