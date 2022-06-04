package unidade3.src;

import java.util.Scanner;

public class exercicio1 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        //Implemente o algoritmo de busca linear . Utilize uma estrutura estática.

        int i[] = new int[8];

        for (int j = 0; j < i.length; j++) {
            i[j] = (int) (Math.random() * 10);
            System.out.println("valor [" + j + "]: " + i[j]);
        }

        System.out.println("Qual numero deve ser buscado? ");
        int numero = in.nextInt();

        boolean ou = false;
        for (int j = 0; j < i.length; j++) {
            if (numero == i[j]) {
                System.out.println("O numero " + numero + " foi encontrado no indice [" + j + "]");
                ou = false;
                break;
            } else {
                ou = true;
            }
        }

        if (ou) {
            System.out.println("O numero " + numero + " não foi encontrado");
        }

    }

}
