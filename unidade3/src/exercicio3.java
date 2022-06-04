package unidade3.src;

import java.util.Scanner;

public class exercicio3 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //Implemente o algoritmo de busca binária.

        int vetor[] = { 1, 2, 3, 4, 5 };
        int inicio = 0;
        int fim = vetor.length - 1;

        int busca = 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (busca > vetor[meio]) {
                inicio = meio + 1;
            } else if (busca < vetor[meio]) {
                fim = meio - 1;
            } else {
                System.out.println("Numero " + busca + " foi encontrado no indice[" + meio + "]");
                break;
            }

        }

    }
}
