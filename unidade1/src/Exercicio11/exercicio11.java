package unidade1.src.exercicio11;

import java.util.Scanner;

public class exercicio11 {
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.setNome("Felipe");
        conta2.setNome("mikaei");

        System.out.print("Qual o valor deseja transferir: ");
        double value = ler.nextDouble();

        conta2.recebido(conta1.transferencia(value));
        System.out.println();
        System.out.print(conta1.getNome() + " tem um saldo de " + conta1.getValor());
        System.out.println();
        System.out.print(conta2.getNome() + " tem um saldo de " + conta2.getValor());

    }

}
