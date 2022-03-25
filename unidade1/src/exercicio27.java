import java.util.Scanner;

public class exercicio27 {

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

        System.out.print("O maior numero do vetor e: " + maiorNum(vet));

    }

    public static int maiorNum(int vet[]) {

        int maior = 0;

        for (int i = 0; i < vet.length; i++) {
            if (vet[i] >= maior) {
                maior = vet[i];
            }
        }

        return maior;

    }

    public static void leitordevetor(int vet[]) {

        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
    }

}
