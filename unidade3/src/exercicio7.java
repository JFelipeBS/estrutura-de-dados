package unidade3.src;

import java.util.Scanner;

public class exercicio7 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //Implemente o algoritmo de ordenação insert sort.

        int vet[] = { 8, 4, 8, 5, 0, 6, 800 };

        int temp;
        int j;

        for (int i = 1; i < vet.length; i++) {
            temp = vet[i];
            j = i - 1;

            while ((j >= 0) && (temp < vet[j])) {

                vet[j + 1] = vet[j];
                j--;
            }

            vet[j + 1] = temp;
        }

        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

    }
}
