package unidade1.src;


import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class exercicio38c {

    public static void main(String[] args) {

        // Queue: usado quado hover elementos com chaves repetidas, e facilita a adicao
        // e remocao de elementos no inicio da fila

        //LinkedList:
        //conserva ordem
        //aceita elementos null
        System.out.println("Queue LinkedList");
        Queue<String> queue = new LinkedList<String>();
        queue.add("Itaicaba");
        queue.add("Palhano");
        queue.add("Itaicaba");
        queue.add(null);
        System.out.println(queue);
        // consultar inicio .peek
        System.out.println("Inicio: "+ queue.peek());
        // Remover inicio .remove(SEM PARAMETRO)
        queue.remove();
        System.out.println("Inicio: "+ queue.peek());

        //PriorityQueue:
        //Ordena os elementos
        //nao aceita elementos null
        System.out.println();
        System.out.println("Queue PriorityQueue");
        Queue<String> priorityqueue =new PriorityQueue<String>();
        priorityqueue.add("Brasilia");
        priorityqueue.add("Sao Paulo");
        priorityqueue.add("Ceara");
        priorityqueue.add("Brasilia");
        priorityqueue.add("Roraima");
        priorityqueue.add("Rondonia");
        priorityqueue.add("Acre");
        priorityqueue.add(null);
        System.out.println(priorityqueue);

    }
}
