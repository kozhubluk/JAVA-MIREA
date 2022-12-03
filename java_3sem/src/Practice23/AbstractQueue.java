package Practice23;

public abstract class AbstractQueue implements Queue{
    protected int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public int element() {
        assert size > 0;
        return doElement();
    }

    protected abstract int doElement();

    public void clear() {
        size = 0;
        doClear();
    }

    protected abstract void doClear();

    public void enqueue(int element) {
        doEnqueue(element);
        size++;
    }

    protected abstract void doEnqueue(int element);

    public int dequeue() {
        assert size > 0;
        int result = doDequeue();
        size--;
        return result;
    }

    protected abstract int doDequeue();
}
