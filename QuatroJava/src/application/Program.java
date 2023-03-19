package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Criar um vetor de cinco posições, solicitar cinco números e ao fim, imprimir
	 * o valor apresentado na posição três.
	 * 
	 * Como o enúnciado não especifica, foram considerados números inteiros e para a
	 * posição três foi considerada a quarta posição do vetor, pois vetores começam
	 * em zero.
	 * 
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Integer[] vect = new Integer[5];
		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("O número na posição 3 do vetor é: " + vect[3] + ".");
		sc.close();
	}

}
