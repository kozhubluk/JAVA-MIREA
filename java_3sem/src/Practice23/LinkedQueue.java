package Practice23;

public class LinkedQueue extends AbstractQueue{

    private Node head;
    private Node current;

    protected int doElement() {
        return head.value;
    }

    protected void doEnqueue(int element) {
        Node newNode = new Node(element, null);
        if (size == 0) {
            this.head = newNode;
        } else {
            this.current.next = newNode;
        }
        current = newNode;
    }

    protected int doDequeue() {
        int res = head.value;
        head = head.next;
        return res;
    }

    protected void doClear() {
        head = null;
        current = null;
    }
    private static class Node {
        public int value;
        public Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

}
