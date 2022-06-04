package unidade3.src;

import java.util.Scanner;

public class exercicio6 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Implemente o algoritmo de ordenação bubble sort.

        int vet[] = { 8, 4, 8, 5, 0, 6, 800 };

        for (int i = 0; i < vet.length; i++) {
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[i] > vet[j]) {
                    int temp = vet[i];
                    vet[i] = vet[j];
                    vet[j] = temp;
                }
            }
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }
}
