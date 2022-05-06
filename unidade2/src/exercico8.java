package unidade2.src;

import java.util.Scanner;

import unidade2.src.stack.InterfaceStack;
import unidade2.src.stack.StackArray;

public class exercico8 {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int x;
        do {

            System.out.print("Digite a expressão pós-fixa separando números e operadores por espaço: ");
            String expressao = in.nextLine();

            // separando expressão e colocando em array de String
            String verifica[] = new String[expressao.length()];
            String agrega = "";
            int j = 0;

            for (int i = 0; i < expressao.length(); i++) {
                if (expressao.charAt(i) != ' ') {
                    agrega += (expressao.charAt(i));
                    verifica[j] = agrega;
                } else {
                    agrega = "";
                    j++;
                }
            }

            // definindo tamanho da expressão dividida
            int size = 0;
            while (verifica[size] != null) {
                size++;
            }

            decodificar(verifica, size);

            System.out.println();
            System.out.print("Deseja um novo calculo se SIM digite 1 se NÃO digite 0: ");
            x = in.nextInt();
            in.nextLine();

        } while (x != 0);

    }

    public static void decodificar(String[] expressao, int size) {

        InterfaceStack<Double> decod = new StackArray<Double>(size);

        double numeroDesempilhado;
        double numeroDesempilhadoSegundo;

        for (int i = 0; i < size; i++) {

            String simbolo = expressao[i];

            switch (simbolo) {

                // desempilhado os numeros para fazer a operação
                // dica a pilha sempre LIFO as operaçoes comecao pelo segundo numero
                case "^":
                    numeroDesempilhado = decod.pop();
                    numeroDesempilhadoSegundo = decod.pop();

                    decod.push((Math.pow(numeroDesempilhadoSegundo, numeroDesempilhado)));
                    break;

                case "/":
                    numeroDesempilhado = decod.pop();
                    numeroDesempilhadoSegundo = decod.pop();

                    decod.push((numeroDesempilhadoSegundo / numeroDesempilhado));
                    break;
                case "*":
                    numeroDesempilhado = decod.pop();
                    numeroDesempilhadoSegundo = decod.pop();

                    decod.push((numeroDesempilhadoSegundo * numeroDesempilhado));
                    break;
                case "-":
                    numeroDesempilhado = decod.pop();
                    numeroDesempilhadoSegundo = decod.pop();

                    decod.push((numeroDesempilhadoSegundo - numeroDesempilhado));
                    break;
                case "+":

                    numeroDesempilhado = decod.pop();
                    numeroDesempilhadoSegundo = decod.pop();

                    decod.push((numeroDesempilhadoSegundo + numeroDesempilhado));
                    break;

                default:
                    decod.push(Double.valueOf(simbolo));
                    break;
            }
        }

        System.out.println(decod.peek());

    }

}
