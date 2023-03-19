package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	/*
	 * Solicitar 5 números, ao fim, imprimir o número maior e o número menor. 
	 * Como não há especificação, foram considerados números inteiros.
	 */

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			lista.add(sc.nextInt());
		}

		Integer maior = lista.get(0);
		Integer menor = lista.get(0);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > maior) {
				maior = lista.get(i);
			}
		}

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) < menor) {
				menor = lista.get(i);
			}
		}
		System.out.println();
		System.out.println("O maior número digitado é: " + maior+".");
		System.out.println();
		System.out.println("O menor número digitado e: " + menor+".");

		sc.close();
	}

}
