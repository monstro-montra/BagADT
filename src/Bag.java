//interface used to create a bag ADT
public interface Bag<T> {
    void add(T item);
    void discard(T item);
    void sort();
    boolean isEmpty();
}
