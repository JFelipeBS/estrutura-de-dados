
import java.util.Scanner;

public class exercicio14 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o a: ");
        float a = ler.nextFloat();
        System.out.print("Digite o b: ");
        float b = ler.nextFloat();
        System.out.print("Digite o c: ");
        float c = ler.nextFloat();

        raizes(a, b, delta(a, b, c));

    }

    public static float delta(float a, float b, float c) {

        float delta = (float) (Math.pow(b, 2) - 4 * a * c);

        return delta;
    }

    public static void raizes(float a, float b, float delta) {

        float raiz1, raiz2;

        if (delta >= 0) {

            raiz1 = (float) ((-(b) + Math.sqrt(delta)) / 2 * a);
            raiz2 = (float) ((-(b) - Math.sqrt(delta)) / 2 * a);

            System.out.print("O valor da raiz1 é: " + raiz1);
            System.out.print("O valor da raiz2 é: " + raiz2);

        } else {
            System.out.print("O valor de delta é menor que 0 nao e possivel resolver com numeros reais");
        }
    }

}
