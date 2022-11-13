//interface used to create a bag ADT
public interface Bag<Object> {
    void add(Object item);
    void discard(String itemName);
    void sort();
    void isEmpty();
}
