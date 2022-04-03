import java.util.Scanner;

public class exercicio36 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("DIgite o numero inicial: ");
        int init = in.nextInt();
        System.out.print("DIgite o numero final: ");
        int finit = in.nextInt();

        System.out.println("somatorio Recursivo = " + somatorioRecursirvo(init, finit));
        System.out.println("somatorio Repetcao = " + somatorioRepeticao(init, finit));

    }

    public static int somatorioRecursirvo(int init, int finit) {
        int result = 0;
        if (init == finit) {
            return init;
        } else {

            result = init + somatorioRecursirvo(init + 1, finit);

        }

        return result;

    }

    public static int somatorioRepeticao(int init, int finit) {
        int soma = 0;
        for (int i = init; i <= finit; i++) {
            soma += i;
        }

        return soma;
    }

}
