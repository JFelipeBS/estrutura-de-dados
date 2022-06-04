package unidade3.src;

import java.util.Scanner;

public class exercicio8 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        // Implemente o algoritmo de ordenação select sort.

        int vet[] = { 7, 4, 8, 5, 0, 6, 800 };

        int temp;
        int menor;

        for (int i = 0; i < vet.length; i++) {
            menor = i;

            for (int j = i + 1; j < vet.length; j++) {

                if (vet[j] < vet[menor]) {
                    menor = j;
                }
            }

            if (menor != i) {
                temp = vet[i];
                vet[i] = vet[menor];
                vet[menor] = temp;
            }

        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }
}
