package aula12;
import java.util.Scanner;
import java.util.Locale;

public class scan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Bem vindo " + nome);

        System.out.println("Insira sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade);

        System.out.println("Insira sua conta bancária: ");
        double conta = scan.nextDouble();
        System.out.println("Você possui em sua conta R$" + conta);
    }
}
