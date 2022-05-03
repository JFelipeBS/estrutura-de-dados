package unidade1.src;


import java.util.Scanner;

public class exercicio15 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero: ");
        int numero = ler.nextInt();

        switch (numero) {
            case 1:
                System.out.println("UM");
                break;
            case 2:
                System.out.println("DOIS");
                break;
            case 3:
                System.out.println("TRÊS");
                break;
            case 4:
                System.out.println("QUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            default:
                System.out.println("VALOR INVALIDO");
                break;
        }
    }

}
