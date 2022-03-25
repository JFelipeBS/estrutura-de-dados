import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class exercicio28 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int valor = in.nextInt();
        int vet[] = new int[valor];

        System.out.println("");

        System.out.println("Definindo vetor");

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor da posicao " + i + " do vetor: ");
            vet[i] = in.nextInt();
        }

        System.out.println("");

        System.out.print("vetor definido: ");
        leitordevetor(vet);

        System.out.println("");

        System.out.print("O vetor alterado: ");
        leitordevetor(salto(vet));

    }

    public static int[] salto(int vet[]) {

        int utimo = vet[vet.length - 1];

        for (int i = vet.length - 1; i >= 1; i--) {

            vet[i] = vet[i - 1];
            vet[i - 1] = utimo;

        }
        return vet;
    }

    public static void leitordevetor(int vet[]) {

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

}