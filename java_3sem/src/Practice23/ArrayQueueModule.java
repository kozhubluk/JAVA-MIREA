package Practice23;

import java.util.Arrays;

class ArrayQueueModule {
    private int[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front; // передний элемент
    private int rear; // задний элемент

    public ArrayQueueModule(int maxSize) {
        this.maxSize = maxSize;
        queue = new int[this.maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }
    public void enqueue(int elem) { // вставить элемент
        if (nElem == maxSize){
            System.out.println("Невозможно вставить более " + maxSize + " элементов");
            return;
        }
        if (rear == maxSize - 1) {  // циклический перенос
            rear = -1;
        }
        queue[++rear] = elem;
        nElem++;
    }
    public int dequeue() { // удалить и вернуть первый эл. очереди
        int temp = queue[front++]; // получаем первый элемент из очереди
        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return temp;
    }

    public int element() { // 1ый элем.
        return queue[front];
    }

    public void clear(){
        rear = -1;
        front = 0;
        nElem = 0;
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public int size() {
        return nElem;
    }

    public static void main(String[] args){
        ArrayQueueModule q = new ArrayQueueModule(15);
        for (int i = 0; i < 15; i++){
            q.enqueue(i);
        }
        System.out.println(q.dequeue());
        System.out.println(q.size());
        System.out.println(q.element());
        System.out.println(q.isEmpty());
        q.clear();
        System.out.println(q.isEmpty());
    }
}