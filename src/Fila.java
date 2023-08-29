import java.util.ArrayList;

public class Fila<T> {
    private ArrayList<T> items;
    private int top;

    public Fila() {
        items = new ArrayList<>();
        top = -1;
    }

    public void enfileirar(T item) {
        if (top < items.size()) {
            top++;
            items.add(item);
        } else {
            throw new IllegalStateException("A pilha está cheia");
        }
    }

    public T desenfileirar() {
        if (!isEmpty()) {
            return items.remove(0);
        }
        throw new IllegalStateException("A fila está vazia");
    }

    public T frente() {
        if (!isEmpty()) {
            return items.get(0);
        }
        throw new IllegalStateException("A fila está vazia");
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int tamanho() {
        return top + 1;
    }
}

