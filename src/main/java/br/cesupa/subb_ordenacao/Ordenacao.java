package br.cesupa.subb_ordenacao;

public class Ordenacao {

    public static int[] selectionSort(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int indiceMenor = i;
            for (int indiceSeguinte = i + 1; indiceSeguinte < vetor.length; indiceSeguinte++) {
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
            for (int direita = esquerda + 1; direita < vetor.length; direita++) {
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
                vetor[j + 1] = vetor[j];
                j--;
            } // fim do while
            vetor[j + 1] = chave;
        } // fim do for
        return vetor;
    } // fim do método insertionSort

    public static int[] mergeSort(int[] vetor, int tamanho) {
        if (tamanho < 2) {
            return null;
        }
        int meio = tamanho / 2;
        int[] vesq = new int[meio];
        int[] vdir = new int[tamanho - meio];
        for (int i = 0; i < meio; i++) {
            vesq[i] = vetor[i];
        }
        for (int i = meio; i < tamanho; i++) {
            vdir[i - meio] = vetor[i];
        }
        mergeSort(vesq, meio);
        mergeSort(vdir, tamanho - meio);
        merge(vetor, vesq, vdir, meio, tamanho - meio);
        return vetor;
    } // fim do mergeSort

    private static void merge(int[] vetor, int[] vesq, int[] vdir, int esq, int dir) {
        int i = 0, j = 0, k = 0;
        while (i < esq && j < dir) {
            if (vesq[i] <= vdir[j]) {
                vetor[k++] = vesq[i++];
            } else {
                vetor[k++] = vdir[j++];
            }
        } // fim do while
        while (i < esq) {
            vetor[k++] = vesq[i++];
        }
        while (j < dir) {
            vetor[k++] = vdir[j++];
        }
    }

    public static int[] quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
        return vetor;
    }
    
    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio], i = inicio+1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) i++;
            else if (vetor[f] >= pivo) f--;
            else {
                int aux = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = aux;
                i++; f--;
            } // fim do else
        } // fim do while
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    } // fim da função


} // fim da classe
