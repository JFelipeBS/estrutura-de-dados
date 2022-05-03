package unidade1.src;


import java.util.Scanner;

public class exercicio19 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero inicial: ");
        int n = ler.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(n + "x" + i + " = " + (i * n));
        }
    }
}
