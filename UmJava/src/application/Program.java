package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	/*
	 * Solicitar a inserção de 5 números, ao final, imprimir os números pares,
	 * números ímpares e a média geral desses números.
	 * 
	 * Como não há especificação, foram considerados números inteiros e apenas para a
	 * média foi considerado um Double com 2 casas decimais.
	 * 
	 */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		List<Integer> listaPares = new ArrayList<>();
		List<Integer> listaImpares = new ArrayList<>();
		Double somatorio = 0.0;
		Double media = 0.0;

		for (int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			Integer n = sc.nextInt();
			lista.add(n);
			somatorio += n;
		}

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 2 == 0) {
				listaPares.add(lista.get(i));
			} else {
				listaImpares.add(lista.get(i));
			}
		}

		media = (somatorio / lista.size());

		System.out.println();
		System.out.print("A lista dos números pares digitados contém: " + listaPares+".");
		System.out.println();
		System.out.println("A lista dos números ímpares digitados contém: " + listaImpares+".");
		System.out.println();
		System.out.println("A média dos números digitados é: " + String.format("%.2f", media)+".");

		sc.close();

	}

}
