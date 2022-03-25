
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio9 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");

        float raio = 0;

        System.out.print("Digite o valor do Raio: ");
        raio = ler.nextFloat();

        while (raio < 0) {
            System.out.println("O valor do raio deve ser maior do que 0");
            System.out.print("Digite o valor do Raio: ");
            raio = ler.nextFloat();
        }

        System.out.println();
        System.out.println("----------Resultado---------");

        double area = 2 * Math.PI * raio;
        String resposta = df.format(area);

        System.out.println("A área do circulo é: " + resposta);

    }

}
