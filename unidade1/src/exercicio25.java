import java.util.Scanner;

public class exercicio25 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero de linhas da matris: ");
        int linhas = in.nextInt();
        System.out.print("Digite o numero de colunas da matris: ");
        int colunas = in.nextInt();

        int matriz[][] = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o valor do espaço [" + i + "], [" + j + "] " + "da matriz: ");
                matriz[i][j] = in.nextInt();
            }
        }

        System.out.println("");
        System.out.print("Resultado");
        System.out.println("");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");

        }

    }

}
