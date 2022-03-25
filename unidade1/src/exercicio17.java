
import java.util.Scanner;

public class exercicio17 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero inicial: ");
        int inicial = ler.nextInt();
        System.out.print("Digite o numero final: ");
        int fina = ler.nextInt();

        for (int i = inicial; i <= fina; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        while (inicial <= fina) {
            if (inicial % 2 != 0) {
                System.out.print(inicial + " ");
            }
            inicial++;
        }

        System.out.println();

        do {
            if (inicial % 2 != 0) {
                System.out.print(inicial + " ");
            }
            inicial++;
        } while (inicial <= fina);
    }
}
