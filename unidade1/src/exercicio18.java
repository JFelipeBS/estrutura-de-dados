
import java.util.Scanner;

public class exercicio18 {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        // a
        String senhaCorreta = "Senha";
        String senha = "";

        while (!senha.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            senha = ler.next();
        }

        System.out.println("senha Correta ");

        // b
        // do {

        // System.out.print("Digite a senha: ");
        // senha = ler.next();

        // } while (!senha.equals(senhaCorreta));

        // System.out.println("senha Correta ");

    }
}
