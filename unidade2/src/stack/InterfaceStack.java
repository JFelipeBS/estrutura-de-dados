package unidade2.src.stack;

public interface InterfaceStack <E> {

    //metodo para emplilhar
    void push(E element);
    
    //metodo para deseplilhar
    E pop();

    //metodo para consultar topo
    E peek();

    //metodo para verificar se a pilha esta cheia
    boolean isFull();
    
    //metodo para verificar se a pilha esta vazia
    boolean isEmpty();

}
