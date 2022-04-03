
import java.util.Scanner;

public class exercicio35 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite o numero para calculo do fatorial: ");
        int fatorial = in.nextInt();

        System.out.println("O fatoriam do numero " + fatorial + " e: " + fatorial(fatorial));
    }

    public static int fatorial(int num) {
        
        int result;
       
        if (num == 0) {
            return 1;

        } else {

            result = num * fatorial(num - 1);

        }

        return result;
    }
}
