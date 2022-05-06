package unidade2.src;

import unidade2.src.stack.InterfaceStack;
import unidade2.src.stack.StackArray;

public class exercicio1 {
    public static void main(String[] args) {

        InterfaceStack<Integer> test = new StackArray<Integer>(2);

        System.out.println("empilhando..");
        test.push(15);
        System.out.println("empilhando..");
        test.push(18);

        System.out.println("O topo da pilha e: " + test.peek());
        System.out.println("Desempilhando: " + test.pop());

        System.out.println("empilhando..");
        test.push(15);

        System.out.println("O topo da pilha e: " + test.peek());

        System.out.println("Pilha vazia? : " + test.isEmpty());
        System.out.println("Pilha cheia? : " + test.isFull());

    }

}
