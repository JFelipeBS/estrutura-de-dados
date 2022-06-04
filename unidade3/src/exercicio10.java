package unidade3.src;

import java.util.Scanner;

public class exercicio10 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Implemente o algoritmo de ordenação quick sort.

        int vetor[] = { 7, 4, 8, 5, 0, 6, 800 };

        quicksort(vetor, 0, vetor.length - 1);

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }

    public static void quicksort(int[] vetor, int inicio, int fim) {

        int i = inicio;
        int j = fim;
        int meio = vetor[(inicio + fim) / 2];
        int temp;

        while (i < j) {

            while (vetor[i] < meio) {
                i++;
            }
            while (vetor[j] > meio) {
                j--;
            }

            if (i <= j) {
                temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
                i++;
                j--;
            }

        }

        if (j > inicio) {
            quicksort(vetor, inicio, j);
        }

        if (i < fim) {
            quicksort(vetor, i, fim);
        }

    }

}
