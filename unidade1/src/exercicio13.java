
import java.util.Scanner;

public class exercicio13 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a primeira nota: ");
        float nota1 = ler.nextFloat();
        System.out.print("Digite a segunda nota: ");
        float nota2 = ler.nextFloat();
        System.out.print("Digite a terceira nota: ");
        float nota3 = ler.nextFloat();

        float soma = mp(nota1, nota2, nota3);

        if (soma >= 7) {
            System.out.println("O aluno esta APROVADO com media: " + (soma));
        } else if (soma < 3.5) {
            System.out.println("O aluno esta REPROVADO com media:" + (soma));
        } else if ((soma > 3.5) && (soma<7)) {
            System.out.println("O aluno esta RCUPERAÇÃO com media:" + (soma));
        }

        if (soma > 3.5 && soma < 7) {

            System.out.print("Digite a nota da quarta prova: ");
            float nota4 = ler.nextFloat();

            float result = nf(mp(nota1, nota2, nota3), nota4);

            if (result > 5) {
                System.out.println("O aluno esta APROVADO PELA 4ª PROVA com media:" + (result));
            } else {
                System.out.println("O aluno esta REPROVADO com media:" + (result));
            }

        }

    }

    public static float mp(Float nota1, Float nota2, Float nota3) {
        float soma = (nota1 + nota2 + nota3) / 3;
        return soma;
    }

    public static float nf(Float mp, Float nota4) {
        float result = ((mp * 6 + nota4 * 4) / 6 + 4);
        return result;
    }

}
