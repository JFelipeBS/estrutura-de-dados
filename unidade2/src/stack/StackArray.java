package unidade2.src.stack;

public class StackArray<E> implements InterfaceStack<E> {

    private int top;
    private Object[] array;
    private int size;

    public StackArray(int size) {
        this.top = -1;
        this.size = size;
        this.array = new Object[size];
    }

    @Override
    public void push(E element) {

        if (isFull()) {
            System.out.println("pilha cheia");
        } else {
            top++;
            array[top] = element;
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public E pop() {

        if (isEmpty()) {
            System.out.println("pilha vazia");
            return null;
        }else{
            E retorna = (E) array[top];
            top--;
            return retorna;   
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public E peek() {

        if (isEmpty()) {
            System.out.println("pilha Vazia");
            return null;

        } else {
            return (E) array[top];
        }
    }

    @Override
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        }
        return false;
    }

}
