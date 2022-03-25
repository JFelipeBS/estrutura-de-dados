
import java.util.Scanner;

public class exercicio16 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero inicial: ");
        int inicial = ler.nextInt();
        System.out.print("Digite o numero final: ");
        int fina = ler.nextInt();

        // a
        while (inicial <= fina) {
            System.out.print(inicial + " ");
            inicial++;
        }
        // b
        System.out.println();

        do {
            System.out.print(inicial + " ");
            inicial++;
        } while (inicial <= fina);

        // c
        for (int i = inicial; i <= fina; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

    }
}
