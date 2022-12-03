package Practice23;

public class ArrayQueue extends AbstractQueue {
     private int[] elements = new int[10];
    private int head;


    public void ensureCapacity(int capacity) {
        if (capacity <= elements.length) {
            return;
        }
        int[] newElements = new int[2 * capacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
    }

    protected void doEnqueue(int element) {
        ensureCapacity(size + 1);
        elements[(head+size)%elements.length] = element;
    }

    protected int doElement() {
        return elements[head];
    }

    protected int doDequeue() {
        int result = elements[head];
        head = (head + 1) % elements.length;
        return result;
    }

    protected void doClear() {
        head = 0;
    }
}