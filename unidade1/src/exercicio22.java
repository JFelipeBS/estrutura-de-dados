package unidade1.src;


import java.util.Scanner;

public class exercicio22 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        int num = in.nextInt();

        int fatorial = 1;

        for (int i = num, j = i - 1; i >= 1; i = i - 2, j -= 2) {

            if (j <= 0) {
                j = 1;
            }
            fatorial = i * j * fatorial;
        }

        System.out.println("O fatorial do numero " + num + " é " + fatorial);
    }
}
