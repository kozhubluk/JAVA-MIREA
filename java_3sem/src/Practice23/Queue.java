package Practice23;

public interface Queue {

    void enqueue(int element);

    int dequeue();

    int element();

    int size();

    boolean isEmpty();

    void clear();
}