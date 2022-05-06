package unidade2.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import unidade2.src.listaSimplesmenteEncadeada.LikendSigly;

public class exercicio5 {

    public static void main(String[] args) throws IOException {

        // arquivo para texto a ser lido e palavras contadas
        String path = "temp/frase.csv";

        // arquivo para armazenar resultado da contagem;
        String pathresult = "temp/resultado.csv";

        LikendSigly<String> teste = new LikendSigly<String>();

        teste = lerFrases(path);

        String textoCompleto = ("");
        for (int i = 0; i <= teste.size; i++) {
            textoCompleto += teste.removeFirst();
        }

        contador(textoCompleto, pathresult);

    }

    public static void contador(String frase, String path) throws IOException {

        frase = frase.toLowerCase();

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

                String resultaddo = fraseEscrita[i] + " = " + cont + " ";
                escrever(path, resultaddo);
            }

        }
    }

    public static void escrever(String path, String frase) throws IOException {

        BufferedWriter buffer = new BufferedWriter(new FileWriter(path, true));
        buffer.append(frase + '\n');
        buffer.close();
    }

    public static void ler(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = buffer.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = buffer.readLine();
        }

        buffer.close();

    }

    public static LikendSigly lerFrases(String path) throws IOException {
        BufferedReader buffer = new BufferedReader(new FileReader(path));
        String linha = buffer.readLine();

        LikendSigly<String> fraseTexto = new LikendSigly<String>();

        while (linha != null) {

            fraseTexto.addLast(linha);
            linha = buffer.readLine();
        }

        buffer.close();
        return fraseTexto;
    }
}