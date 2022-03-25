
import java.util.Scanner;

public class exercicio12 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a primeira nota: ");
        float nota1 = ler.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = ler.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = ler.nextFloat();

        float soma = (nota1 + nota2 + nota3);

        System.out.println("******Resultado*******");

        if ((soma / 3) < 7) {
            System.out.println("O aluno esta REPROVADO com media: " + (soma / 3));

        } else if ((soma / 3) >= 7) {
            System.out.println("O aluno esta APROVADO com media:" + (soma / 3));
        }

    }
}