package unidade2.src.queu;

public interface InterfaceQueu <T> {

    // adicionar um novo elemento no fim
    void add(T elemente);

    // remover um elemento no inicio
    T remove();

    // consultar inicio da fila primeiro elemento 
    T peek();

    // se a fila esta cheia
    boolean isFull();

    // se a fila esta vazia
    boolean isEmpty();
    
}
