import java.util.ArrayList;

public class Pilha<T> {
    private ArrayList<T> items;
    private int top;

    public Pilha() {
        items = new ArrayList<>();
        top = -1;
    }

    public void empilhar(T item) {
        if (top < items.size()) {
            top++;
            items.add(item);
        } else {
            throw new IllegalStateException("A pilha está cheia");
        }
    }

    public T desempilhar() {
        if (!isEmpty()) {
            T item = items.get(top);
            items.remove(top);
            top--;
            return item;
        } else {
            throw new IllegalStateException("A pilha está vazia");
        }
    }

    public T topo() {
        if (!isEmpty()) {
            return items.get(top);
        } else {
            throw new IllegalStateException("A pilha está vazia");
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int tamanho() {
        return top + 1;
    }
}
