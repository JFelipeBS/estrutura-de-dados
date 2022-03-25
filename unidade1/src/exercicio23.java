
import java.util.Scanner;

public class exercicio23 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int condition;

        do {
            System.out.println("");
            System.out.println("    1 para potenciação");
            System.out.println("    2 para raiz quadrada");
            System.out.println("    3 para fatorial");
            System.out.println("    0 para sai");
            System.out.print("Escolha a operção:");
            condition = in.nextInt();
            
            System.out.println("");

            switch (condition) {
                case 1:

                    System.out.print("Digite um numero: ");
                    int num1 = in.nextInt();
                    System.out.print("Digite a potencia a ser elevada: ");
                    int num2 = in.nextInt();

                    System.out.println("Resultado é: " + Math.pow(num1, num2));

                    break;

                case 2:

                    System.out.print("Digite um numero: ");
                    int raiz = in.nextInt();

                    System.out.println("Resultado é: " + Math.sqrt(raiz));

                    break;

                case 3:

                    System.out.print("Digite um numero: ");
                    int fat = in.nextInt();
                    System.out.println("Resultado: " + fatorial(fat));

                    break;

                case 0:

                    System.out.print("Programa encerrado");

                    break;

                default:
                    break;
            }

        } while (condition != 0);

    }

    public static int fatorial(int num) {

        int fatorial = 1;

        for (int i = num, j = i - 1; i >= 1; i = i - 2, j -= 2) {

            if (j <= 0) {
                j = 1;
            }
            fatorial = i * j * fatorial;
        }

        return fatorial;

    }

}
