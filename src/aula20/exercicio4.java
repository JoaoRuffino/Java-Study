package aula20;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[][] compromissos = new String[30][24];
		String resp = "S";
		
		while(resp.equals("S") || resp.equals("s")) {
			
			System.out.println("1 - Marcar compromisso");
			System.out.println("2 - Visualizar compromisso");
			System.out.println("\nInsira a opção desejada: ");
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				
				System.out.println("Insira o dia do seu novo compromisso: ");
				int dia = sc.nextInt();
				System.out.println("Insira o horário do seu novo compromisso: ");
				int horario = sc.nextInt();
				
				if(dia < 0 || dia > 32 || horario > 24 || horario < 0) {
					System.out.println("Erro nos valores!");
					continue;
				}else {
					System.out.println("Insira o nome do seu compromisso: ");
					sc.nextLine();
					compromissos[dia][horario] = sc.nextLine();
				}
				
				
			}else if(opcao == 2) {
				System.out.println("Insira o dia do seu compromisso marcado: ");
				int dia = sc.nextInt();
				System.out.println("Insira o horário do seu compromisso marcado: ");
				int horario = sc.nextInt();
				if(dia < 0 || dia > 32 || horario > 24 || horario < 0) {
					System.out.println("Erro nos valores!");
					continue;
				}else {
					System.out.println("Compromisso do dia " + dia + " às " + horario + " horas: " + compromissos[dia][horario]);
				}
			}
			
			System.out.println("Deseja continuar?(S/N)");
			resp = sc.next();
		}
	}

}
