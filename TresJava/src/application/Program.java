package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Elabore um programa de computador que realize o cálculo de notas. Este
	 * programa deverá solicitar o nome do aluno e quatro notas. Todo este conjunto
	 * deverá estar contido em um laço que confirme se deseja encerrar o programa ou
	 * continuar solicitando outros nomes e notas. Ao final da solicitação do nome e
	 * das notas deverá ser impresso o nome do aluno e a sua média. Se a nota for
	 * menor que 6 imprimir Reprovado, senão, se a nota for igual ou maior que 6,
	 * imprimir Aprovado.
	 * 
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp = 's';
		while (resp == 's') {

			System.out.print("Digite o nome do aluno: ");

			String nome = sc.nextLine();
			Double media = 0.0;
			Double soma = 0.0;
			String resultado = "Aprovado/a.";
			System.out.println();
			for (int i = 0; i < 4; i++) {
				System.out.print("Digite a " + (i + 1) + "º nota do/a " + nome + ": ");
				soma += sc.nextDouble();
			}
			media = soma / 4;
			if (media < 6) {
				resultado = "Reprovado/a.";
			}
			System.out.println();
			System.out.println(nome + ": " + String.format("%.2f", media) + " - " + resultado);
			System.out.println();
			System.out.print("Você deseja continuar lançando notas? (s/n): ");

			resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.println();
		}

		System.out.println("Lançamento de notas encerrado.");
		sc.close();
	}

}
