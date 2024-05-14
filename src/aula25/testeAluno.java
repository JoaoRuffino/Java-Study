package aula25;
import java.util.Scanner;

public class testeAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno1 = new Aluno();
		System.out.println("Insira o nome do aluno: ");
		aluno1.nome = sc.next();
		System.out.println("Insira a matricula do aluno: ");
		aluno1.matricula = sc.next();
		System.out.println("Insira o curso do aluno: ");
		aluno1.curso = sc.next();
		
		for(int i = 0; i < aluno1.materias.length; i++) {
			System.out.println("Insira a materia " + (i + 1) + " :");
			aluno1.materias[i] = sc.next();
			for(int j = 0; j < aluno1.notas[i].length; j++) {
				System.out.println("Insira a nota " + (j + 1) + " da materia " + aluno1.materias[i] + " :");
				aluno1.notas[i][j] = sc.nextDouble();
			}
		}
		
		aluno1.mostraInfo();
		aluno1.isAprovado();

	}

}
