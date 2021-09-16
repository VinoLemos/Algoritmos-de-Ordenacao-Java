package algoritmos_De_Ordenacao;

public class Quicksort {

	public static void quickSort(int[] vetor, int inicio, int fim) {

		int pivot;
		if (fim > inicio) {
			pivot = particiona(vetor, inicio, fim);
			quickSort(vetor, inicio, pivot-1);
			quickSort(vetor, pivot+1, fim);
		}
	}
		
	private static int particiona(int[] vetor, int inicio, int fim) {
		
		int esq, dir, pivot, aux;
		
		esq= inicio;
		dir = fim;
		pivot = vetor[inicio];
		while (esq < dir ) {
			while ( vetor[esq] <= pivot) {
				esq++;
			}
			while ( vetor[dir] > pivot) {
				dir--;
			}
			if (esq < dir) {
				aux = vetor[esq];
				vetor[esq] = vetor[dir];
				vetor[dir] = aux;
			}
			
		}
		vetor[inicio] = vetor[dir];
		vetor[dir] = pivot;
		return dir;
	}
	
	
	public static void trocar(int[] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {1,5,3,7,4,8,6,9,2};
		
		System.out.println("Antes do Quick Sort: ");
		
		for(int vet : vetor) {
			System.out.print(vet + " ");
		}
		System.out.println();
		quickSort(vetor, 0, vetor.length-1);

		System.out.println("Depois do Quick Sort: ");
		for(int vet : vetor) {
			System.out.print(vet + " ");
		}
		
		
	}

}
