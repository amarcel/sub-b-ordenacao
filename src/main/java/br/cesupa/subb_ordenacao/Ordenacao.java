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
        
        
} // fim da classe
