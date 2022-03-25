import java.util.Scanner;

public class exercicio26 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o tamanho do vetor: ");
        int valor = in.nextInt();
        int vet[] = new int[valor];

        System.out.println("");

        System.out.println("Definindo vetor original");

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o valor da posicao " + i + " do vetor: ");
            vet[i] = in.nextInt();
        }

        System.out.println("");
        System.out.print("vetor original: ");

        leitordevetor(vet);

        System.out.println("");
        System.out.print("vetor invertido: ");

        leitordevetor(inversor(vet));

    }

    public static int[] inversor(int vet[]) {

        int inverso[] = new int[vet.length];
        for (int i = vet.length - 1, j = 0; i >= 0 && j < vet.length; i--, j++) {

            inverso[j] = vet[i];

        }

        return inverso;
    }

    public static void leitordevetor(int vet[]) {

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

}
