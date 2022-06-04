package unidade3.src;

import java.util.Scanner;

public class exercicio9 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Implemente o algoritmo de ordenação shell sort.

        int vetor[] = { 7, 4, 8, 5, 0, 6, 800 };

        int h = 1;
        int temp;
        int j;

        while (h < vetor.length - 1) {
            h = 3 * h + 1;
        }

        while (h > 1) {
            h = h / 3;
        }

        for (int i = h; i < vetor.length; i++) {
            temp = vetor[i];
            j = i - h;

            while ((j >= 0) && (temp < vetor[j])) {
                vetor[j + h] = vetor[j];
                j = j - h;
            }

            vetor[j+h] = temp;
        }

       

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

    }

}
