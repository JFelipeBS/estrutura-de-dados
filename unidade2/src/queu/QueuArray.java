package unidade2.src.queu;

public class QueuArray<T> implements InterfaceQueu<T> {

    private int size;
    private int first;
    private int last;
    private Object array[];

    public QueuArray(int size) {
        this.size = size;
        this.first = -1;
        this.last = -1;
        this.array = new Object[size];
    }

    @Override
    public void add(T elemente) {

        if (isFull()) {
            System.out.println("Lista cheia");
        }

        int testeLast = (last + 1) % size;
        last = testeLast;
        array[last] = elemente;

        // para inserir primeiro elemento
        if (first == -1) {
            first = 0;
        }

    }

    @Override
    @SuppressWarnings("unchecked")
    public T remove() {

        if (isEmpty()) {
            System.out.println("Lista vazia");
            return null;
        }

        T retorno = (T) array[first];

        // para lista que so possui um elemento
        if (last == first) {
            last = -1;
            first = -1;
        }

        first = (first + 1) % size;

        return retorno;

    }

    @Override
    @SuppressWarnings("unchecked")
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return (T) array[first];
    }

    @Override
    public boolean isFull() {

        int testeLast = (last + 1) % size;

        if (testeLast == first) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (first == -1) {
            return true;
        }
        return false;
    }

}
