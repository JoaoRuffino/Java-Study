package aula19;

import java.util.Scanner;

public class Zoologico {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int animal, consumo, custo, quantidade;
		System.out.print("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		System.out.print("\n\nTABELA DE ANIMAIS\n\n");
		System.out.print("1 - Zebra\n2 - Macaco\n3 - Elefante\n4 - Leao\n5 - Jacare\n6 - Crocodilo\n7 - Hipopotamo\n8 - Girafa\n\n");
		System.out.print("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n\n");
		System.out.print("Digite o animal desejado: ");
		animal = sc.nextInt();
		
		switch(animal){
        case 1:
            consumo = 4;
            custo = 12;
            break;
        case 2:
            consumo = 2;
            custo = 4;
            break;
        case 3:
            consumo = 9;
            custo = 25;
            break;
        case 4:
            consumo = 3;
            custo = 9;
            break;
        case 5:
            consumo = 4;
            custo = 15;
            break;
        case 6:
            consumo = 3;
            custo = 13;
            break;
        case 7:
            consumo = 10;
            custo = 20;
            break;
        case 8:
            consumo = 4;
            custo = 15;
            break;
        default:
            System.out.println("\n\nValor nao valido!\n\n");
            consumo = 0;
            custo = 0;
		}
		
		System.out.print("Insira a quantidade de animais: ");
		quantidade = sc.nextInt();
		int consumoDiario = quantidade * consumo;
	    int consumoMensal = consumoDiario * 30;
	    int custoMensal = custo * consumoMensal;
	    System.out.print("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n\n");
	    System.out.print("Dados obtidos:\nTipo de Animal: " + animal + "\nQuantidade de animais: " + quantidade + "\nCusto por kilo de comida: R$" + custo);
	    System.out.print("\nConsumo diario:" + consumoDiario + "Kg");
	    System.out.print("\nConsumo Mensal: " + consumoMensal + "Kg");
	    System.out.print("\nCusto Mensal: R$" + custoMensal);
	    System.out.print("\n\n=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*\n\n");
	}

}
