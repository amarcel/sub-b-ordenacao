package br.cesupa.subb_ordenacao;

public class Ordenacao {
        public static int[] selectionSort(int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                int indiceMenor = i;
                for (int indiceSeguinte = i+1; indiceSeguinte < vetor.length; indiceSeguinte++) {
                    if (vetor[indiceSeguinte] < vetor[indiceMenor]) {
                        indiceMenor = indiceSeguinte;
                    } // fim do if
                } // fim do for interno
                // troca:
                int aux = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = aux;
            } // fim do for externo
            return vetor;
        } // fim do método selectionSort
        
        public static int[] bubbleSort(int[] vetor) {
            for (int esquerda = 0; esquerda < vetor.length; esquerda++) {
                for (int direita = esquerda+1; direita < vetor.length; direita++) {
                    if (vetor[esquerda] > vetor[direita]) {
                        // troca:
                        int aux = vetor[esquerda];
                        vetor[esquerda] = vetor[direita];
                        vetor[direita] = aux;
                    } // fim do if
                } // fim do for direita
            } // fim do for esquerda
            return vetor;
        } // fim do método bubbleSort
        
        public static int[] insertionSort(int[] vetor) {
            for (int i = 1; i < vetor.length; i++) {
                int chave = vetor[i];
                int j = i - 1;
                while (j >= 0 && vetor[j] > chave) {
                    vetor[j+1] = vetor[j];
                    j--;
                } // fim do while
                vetor[j+1] = chave;
            } // fim do for
            return vetor;
        } // fim do método insertionSort
        
        public static int[] mergeSort(int[] vetor, int tamanho) {
            if (tamanho < 2) return null;
            int meio = tamanho / 2;
            int[] vesq = new int[meio];
            int[] vdir = new int[tamanho-meio];
            // FAÇA
        } // fim do mergeSort

//funcao mergeSort(vetor, tamanho)
//    se (tamanho < 2)
//        return;
//    int meio = tamanho / 2;
//    int[] vesq = new int[meio];
//    int[] vdir = new int[tamanho-meio];
//    para (i = 0; i < meio; i++)
//        vesq[i] = vetor[i];
//    para (i = meio; i < tamanho; i++)
//        vdir[i-meio] = vetor[i];
//    mergeSort(vesq, meio);
//    mergeSort(vdir, tamanho-meio);
//    merge(vetor, vesq, vdir, meio, tamanho-meio);
//fim_funcao

        
} // fim da classe
