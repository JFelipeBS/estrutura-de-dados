
import java.util.Scanner;

public class exercicio20 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o número a ser verificado; ");
        int num = ler.nextInt();

        Primos(num);

    }

    public static void Primos(int num) {

        int total = 0;

        if (num == 0) {
            System.out.println(num + " Não é um número primo.");
        } else {

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    total++;
                }
            }

            if (total == 2) {
                System.out.println(num + " É um número primo.");

            } else {
                System.out.println(num + " Não é um número primo.");
            }
        }
    }
}