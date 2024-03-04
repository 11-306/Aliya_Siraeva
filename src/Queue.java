public interface Queue<E> {
    void put(E elem);
    E get();
    void clear();
}
