package aula20;
import java.util.Scanner;

public class JogoDaVelha {
	
	public static void ExibeTabuleiro(char[][] tabuleiro) {
		System.out.println("\nTabuleiro: ");
		System.out.println("\n==============");
		for(int i = 0; i < tabuleiro.length; i++) {
			for(int j = 0; j < tabuleiro[i].length; j++){
				System.out.print("| " + tabuleiro[i][j] + " ");
			}
			System.out.println("\n==============");
		}
	}
	
	public static boolean ConfereResultado(char[][] tabuleiro, char jogador) {
		for(int i = 0; i < tabuleiro.length; i++) {
			if(tabuleiro[i][1]!= '-' && tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][1] == tabuleiro[i][2]) {
				System.out.println("O jogador " + jogador + " venceu!!");
				return true;
			}
			if(tabuleiro[1][i]!= '-' && tabuleiro[0][i] == tabuleiro[1][i] && tabuleiro[1][i] == tabuleiro[2][i]) {
				System.out.println("O jogador " + jogador + " venceu!!");
				return true;
			}
		}
		if(tabuleiro[0][0]!= '-' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
			System.out.println("O jogador " + jogador + " venceu!!");
			return true;
		}
		if(tabuleiro[0][2] != '-' && tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] == tabuleiro[2][0]) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean venceu = false;
		char[][] tabuleiro = new char[3][3];
		for(int i = 0; i < tabuleiro.length; i++){
			for(int j = 0; j < tabuleiro[i].length; j++){
				tabuleiro[i][j] = '-';
			}
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");
		System.out.println("JOGO DA VELHA #");
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=");

		ExibeTabuleiro(tabuleiro);
		System.out.println("Iniciando o Jogo...");
		int contadorJogadas = 0;

		while(venceu == false) {
			
			System.out.println("Jogador X, escolha o local da jogada: ");
			System.out.print("\nLinha: ");
			int linha = sc.nextInt();
			System.out.print("\nColuna: ");
			int coluna = sc.nextInt();
			if(tabuleiro[linha][coluna] == '-') {
				tabuleiro[linha][coluna] = 'X';	
				contadorJogadas++;
			}else {
				System.out.println("Jogada inválida!");
			}
			
			ExibeTabuleiro(tabuleiro);
			venceu = ConfereResultado(tabuleiro, 'X');
			if(venceu == true) {
				break;
			}
			if(contadorJogadas == 9) {
				System.out.println("FIM DE JOGO! DEU VELHA!");
				System.exit(0);
			}
			
			System.out.println("Jogador O, escolha o local da jogada: ");
			System.out.print("\nLinha: ");
			linha = sc.nextInt();
			System.out.print("\nColuna: ");
			coluna = sc.nextInt();
			
			if(tabuleiro[linha][coluna] == '-') {
				tabuleiro[linha][coluna] = 'O';		
				contadorJogadas++;
			}else {
				System.out.println("Jogada invalida!");
			}
			
			ExibeTabuleiro(tabuleiro);
			venceu = ConfereResultado(tabuleiro, 'O');
			if(venceu == true) {
				break;
			}
			
			if(contadorJogadas == 9) {
				System.out.println("FIM DE JOGO! DEU VELHA!");
			}
		}
		
	}
}


