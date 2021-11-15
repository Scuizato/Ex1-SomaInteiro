package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite dois valores inteiros para realizar a soma :");
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		int soma = v1 + v2;
		System.out.printf("O valor da soma dos dois valores é: %d", soma);

		sc.close();

	}
}