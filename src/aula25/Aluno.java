package aula25;
import java.util.Scanner;

public class Aluno {
	String nome;
	String matricula;
	String curso;
	String[] materias = new String[3];
	double[][] notas = new double[3][4];
	Scanner sc = new Scanner(System.in);
	
	void mostraInfo() {
		System.out.println("Nome: " + nome);
		System.out.println("Matricula: " + matricula);
		System.out.println("Curso: " + curso);
		System.out.println("Matérias: ");
		for(int i = 0; i < materias.length; i++) {
			System.out.println("Materia " + (i + 1) + " : " + materias[i]);
			for(int j = 0; j < notas[i].length; j++) {
				System.out.println("Nota " + (j + 1) + " : " + notas[i][j]);
			}
		}
	}
	
	void isAprovado() {
		System.out.println("Qual materia deseja verificar aprovação? ");
		int materia = sc.nextInt();
		materia--;
		
		double soma = 0;
		for(int i = 0; i < notas[materia].length; i++) {
			soma = soma + notas[materia][i];
		}
		double media = soma / notas[materia].length;
		
		if(media >= 7) {
			System.out.println("O aluno foi aprovado com média " + media);
		}else {
			System.out.println("O aluno foi reprovado com média: " + media);
		}
	}
	
	
}
