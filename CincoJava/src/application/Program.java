package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Crie uma matriz bidimensional. Deverá ser solicitado três nomes de alunos e
	 * quatro notas, após solicitação dos nomes e das notas deverá ser impresso os
	 * nomes acompanhados da média geral de cada aluno, deverá ser impresso também o
	 * nome do aluno que obteve a maior média e o nome do aluno que obteve a menor
	 * média.
	 * 
	 * 
	 * Para este exercício seria muito mais prática a aplicação de Orientação à
	 * Objetos com a classe "Aluno", porém o enunciado solicitou a criação de uma
	 * matriz bidimentional, e como o exercício contempla linguagens que não possuem
	 * Orientação à Objetos, foi mantido todo o código na classe principal.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String[][] matriz = new String[3][6];
		String melhorAluno = "";
		String piorAluno = "";
		Double maiorMedia = 0.0;
		Double menorMedia = 10.0;

		for (int i = 0; i < matriz.length; i++) {
			String nome = "";
			Double media = 0.0;
			Double somatorio = 0.0;

			for (int j = 0; j < matriz[i].length; j++) {
				if (j == 0) {
					System.out.print("Digite o nome do aluno/a: ");
					nome = sc.nextLine();
					matriz[i][j] = nome;
				} else if (j < matriz[i].length - 1) {
					System.out.print("Digite a " + j + "º nota do/a " + nome + ": ");
					Double nota = sc.nextDouble();
					somatorio += nota;
					matriz[i][j] = nota.toString();
					sc.nextLine();
				} else {
					media = somatorio / 4;
					matriz[i][j] = String.format("%.2f", media);
					System.out.println("A média do/a " + matriz[i][0] + " é de " + matriz[i][j]);
					if (Double.parseDouble(matriz[i][j]) > maiorMedia) {
						maiorMedia = Double.parseDouble(matriz[i][j]);
						melhorAluno = matriz[i][0];
					}
					if (Double.parseDouble(matriz[i][j]) < menorMedia) {
						menorMedia = Double.parseDouble(matriz[i][j]);
						piorAluno = matriz[i][0];
					}
				}
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("O aluno/a " + melhorAluno + " tirou a maior média com: " + maiorMedia);
		System.out.println();
		System.out.println("O aluno/a " + piorAluno + " tirou a menor média com: " + menorMedia);

		sc.close();

	}

}
