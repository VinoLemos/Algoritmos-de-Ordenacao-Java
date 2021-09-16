package algoritmos_De_Ordenacao;

public class MergeSort {

	public static void main(String[] args) {
		int vetor[] = {4, 3, 5, 2, 6, 1, 8, 7};
		
		System.out.println("Antes do Merge Sort: ");
		
		for (int vet: vetor) {
			System.out.print(vet+" ");
		}
		
		System.out.println();
		mergeSort(vetor);
		System.out.println("Depois do Merge Sort: ");
		
		for (int vet: vetor) {
			System.out.print(vet+" ");
		}
		
	}

	private static void mergeSort(int[] vet) {
		int vetSize = vet.length;

		if (vetSize < 2) {// Se o vetor tiver menos de 2 elementos
			return; // Nao há mais o que dividir
		}

		
//			Cria as duas metades
		
		int meio = vetSize / 2; // Cria o índice que indica o meio do vetor
		int[] esq = new int[meio];// Cria um vetor representando a metade esquerda
		int[] dir = new int[vetSize-meio];// Metade direita


//			Preenche as duas metades
		
		for (int i = 0; i < meio; i++) {// Preenche a metade esquerda
			esq[i] = vet[i];
		}
		// i começa no meio do vetor, e preenche enquanto for menor que o tamanho do vetor	
		for (int i = meio; i < vetSize; i++  ) {// Preenche a metade direita
			
// i - meio: Como meio equivale a metade do vetor, e i começa com valor do meio, para evitar erro de índices nós zeramos o 
// valor de i, para que comece a preencher na posição 0
			dir[i-meio]= vet[i];
		}
	
// Usando a recursividade, repete todo o procedimento acima e divide as duas metades até que tenhamos listas com
// Um elemento cada
		
		mergeSort(esq);
		mergeSort(dir);
		
		merge(vet, esq, dir);
	}
	
	
	
	
	
	
// Une os vetores divididos 
	private static void merge(int[] vet, int[] esq, int[] dir){
			int esqSize = esq.length;
			int dirSize = dir.length;
	// Variáveis de iteração para percorrer os 3 vetores
			int i = 0, j = 0, k = 0;
			
			while (i < esqSize && j < dirSize) { // Enquanto houverem elementos para serem comparados
	// Compara qual dos dois elementos nos dois vetores é o menor
				if (esq[i] <= dir[j]) {
					vet[k] = esq[i];// Caso o elemento da esquerda seja o menor, o adiciona ao vetor principal
					i++;// i avança no elemento, porém j continua na posição anterior
				}else {
					vet[k] = dir[j];// Caso o elemento da direita seja o menor, o adiciona ao vetor principal
					j++;// j avança no elemento, porém i continua na posição anterior
				}
				k++;// Avança no índice do vetor principal
			}
			
// Caso tenham sobrado elementos no vetor da esquerda, o adiciona ao vetor principal
			while ( i < esqSize) {
				vet[k] = esq[i];
						i++;
						k++;
			}
// Repete a operação no lado direito			
			while ( j < dirSize) {
				vet[k] = dir[j];
					j++;
					k++;
			}
			
			
	}
}
