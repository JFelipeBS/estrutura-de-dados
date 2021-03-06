package unidade1.src.exercicio31;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicio31 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Quantas pessoas serão cadastradas: ");
        int numPessoas = in.nextInt();

        int i = 0;

        List<Pessoa> lista = new ArrayList<Pessoa>();

        while (i < numPessoas) {

            Pessoa pessoa = new Pessoa();

            System.out.println("Pessoa " + (i+1));
            System.out.print("Digite seu CPF: ");
            String cpf = in.next();
            pessoa.setCpf(cpf);
            verificar(cpf, pessoa);
            in.nextLine();

            System.out.print("Digite seu nome: ");
            String nome = in.nextLine();
            pessoa.setNome(nome);

            System.out.print("Digite seu idade: ");
            int idade = in.nextInt();
            pessoa.setIdade(idade);

            System.out.print("Digite seu sexo (M/F): ");
            char sexo = in.next().charAt(0);
            pessoa.setSexo(sexo);

            System.out.print("Digite seu peso: ");
            float peso = in.nextFloat();
            pessoa.setPeso(peso);

            System.out.print("Digite seu altura: ");
            float altura = in.nextFloat();
            pessoa.setAltura(altura);

            pessoa.setImc(pessoa.calcImc());

            lista.add(pessoa);
            i++;

            System.out.println("");
        }

        String path = "temp/text.dat";

        try {
            escrever(path, lista);
        } catch (IOException e) {
            System.out.println("Erro na escrita");
            e.printStackTrace();
        }

        try {
            ler(path);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void verificar(String cpf, Pessoa pessoa) {

        while (cpf.length() != 11 ) {

            System.out.print("Digite seu CPF: ");
            cpf = in.next();
            pessoa.setCpf(cpf);
        }
    }

    public static void escrever(String path, List<Pessoa> lista) throws IOException {
        File file = new File(path);
        file.delete();
        file.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));

        objOutput.writeObject(lista);
        objOutput.close();
    }

    public static void ler(String path) throws IOException {

        File file = new File(path);

        if (file.exists()) {
            ObjectInputStream obj = new ObjectInputStream(new FileInputStream(file));
            try {
                System.out.println(obj.readObject());
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


    }
}
