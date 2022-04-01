import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercicio34 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String path = "temp/ContandoPalavras.csv";
        BufferedWriter buffer = new BufferedWriter(new FileWriter(path));

        System.out.print("Digite a Frase: ");
        String frase = in.nextLine();

        System.out.println("====================================");
        System.out.println("A frase digitada foi: " + frase);
        System.out.println("====================================");
        System.out.println("");

        contador(frase, path, buffer);
        buffer.close();

        System.out.print("Se desejar ver o resultado digite 1 se nao digite 0: ");
        int verifica = in.nextInt();
        System.out.println("");

        switch (verifica) {
            case 1:
                leitor(path);
                System.out.println("");
                System.out.println("====================================");
                break;

            case 0:
                System.out.println("Finalizou");
                System.out.println("====================================");
                break;

            default:
                System.out.println("Finalizou");
                System.out.println("====================================");
                break;
        }

    }

    public static void contador(String frase, String path, BufferedWriter buffer) throws IOException {

        frase = frase.toLowerCase();
        frase = frase.trim();

        String[] frasesSeparada = frase.split(" ");
        String[] fraseEscrita = new String[frasesSeparada.length];

        for (int i = 0; i < frasesSeparada.length; i++) {
            int cont = 0;

            for (int j = 0; j < frasesSeparada.length; j++) {
                if (frasesSeparada[i].equals(frasesSeparada[j])) {
                    cont++;
                }
            }

            int verifique = 0;

            for (int z = 0; z < fraseEscrita.length; z++) {

                if (frasesSeparada[i].equals(fraseEscrita[z])) {
                    verifique = 1;
                }
            }

            fraseEscrita[i] = frasesSeparada[i];

            if (verifique == 0) {
                String save = fraseEscrita[i] + " = " + cont + "; ";
                escrever(path, save, buffer);
            }

        }
    }

    public static void escrever(String path, String frase, BufferedWriter buffer) throws IOException {
        buffer.append(frase);
    }

    public static void leitor(String path) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader(path));
        String linha = read.readLine();

        while (linha != null) {

            System.out.print(linha);
            linha = read.readLine();
        }

        read.close();
    }
}
