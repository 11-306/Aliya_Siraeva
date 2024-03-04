import java.util.ArrayList;

public class CyclicQueue<E> implements Queue<E>{
    private final ArrayList<E> values;
    private int size;
    private int front;
    private int rear;

    public CyclicQueue(int size) {
        this.size = size;
        this.values = new ArrayList<>(size);
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void put(E elem) {
        if (isFull()) {
            System.out.println("Очередь полная");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = nextIndex(rear);
        values.add(rear, elem);
    }

    @Override
    public E get() {
        if (isEmpty()) {
            System.out.println("Очередь пустая");
            return null;
        }
        E elem = values.get(front);
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = nextIndex(front);
        }
        return elem;
    }

    @Override
    public void clear() {
        front = -1;
        rear = -1;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return nextIndex(rear) == front;
    }

    private int nextIndex(int index) {
        int next = index + 1;
        if (next >= size) {
            next = next % size;
        }
        return next;
    }
}
