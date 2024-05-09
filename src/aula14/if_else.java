package aula14;
import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		int idade = sc.nextInt();
		if(idade >= 18) {
			System.out.println("É maior de idade");
		}else {
			System.out.println("É menor de idade");
		}
		
		
		switch(idade) {
		case 1:
			System.out.println("Numero 1");
			break;
		case 2:
			System.out.println("Numero 2");
			break;
		default:
			System.out.println("Nem 1 nem 2");
		}
		
	}
}
