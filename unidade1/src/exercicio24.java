package unidade1.src;


import java.util.Scanner;

public class exercicio24 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int value = in.nextInt();

        int vetor[] = new int[value];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o indice [" + i + "] do vetor: ");
            vetor[i] = in.nextInt();
        }

        System.out.println("");

        System.out.println("******** Resultado do Vetor ********");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("O indice [" + i + "] do vetor e: " + vetor[i]);
            System.out.println("");

        }
    }
}
