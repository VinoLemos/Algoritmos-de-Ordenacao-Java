package algoritmos_De_Ordenacao;

import java.util.Scanner;

public class Bubble_Sort {
	public static void bubble_sort(int vetor[]) {
		int aux = 0;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor.length; j++) {
				if (vetor[i] < vetor[j]) {
					aux = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = aux;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int vetor[] = { 5, 3, 6, 9, 4, 2, 8, 7 };
		for (int vet : vetor) {
			System.out.print(vet + " ");
		}
		System.out.println();
		bubble_sort(vetor);
		System.out.println("Após Bubble Sort: ");

		for (int vet : vetor) {
			System.out.print(vet + " ");
		}
		sc.close();
	}

}
