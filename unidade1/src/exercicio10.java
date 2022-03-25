
import java.util.Scanner;

public class exercicio10 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o valor a ser verificado: ");
        int numero = ler.nextInt();

        if (numero % 2 == 0) {
            System.out.println();
            System.out.println("*****Resultado******");
            System.out.print("O numero " + numero + " é par.");
        } else {

            System.out.println();
            System.out.println("*****Resultado******");
            System.out.print("O numero " + numero + " é impar.");

        }

    }
}