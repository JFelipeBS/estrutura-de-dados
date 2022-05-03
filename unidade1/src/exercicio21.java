package unidade1.src;


import java.util.Scanner;

public class exercicio21 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o número de inicial: ");
        int inicial = ler.nextInt();
        System.out.print("Digite o número de final: ");
        int finall = ler.nextInt();

        int somatorio = 0;

        for (int i = inicial; i <= finall; i++) {
            somatorio = i + somatorio;
        }
        System.out.print("O somatorio é: " + somatorio);
    }
}
