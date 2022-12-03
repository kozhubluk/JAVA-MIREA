package Practice23;

class ArrayQueueADT {
    private int maxSize = 15;
    private int[] queue = new int[maxSize];
    private int nElem = 0;
    private int front = 0;
    private int rear = -1;


    public static void enqueue(ArrayQueueADT queue, int elem) {
        if (queue.nElem == queue.maxSize){
            System.out.println("Не может быть добавлено более 15 элементов");
            return;
        }
        if (queue.rear == queue.maxSize - 1) {  // циклический перенос
            queue.rear = -1;
        }

        queue.queue[++queue.rear] = elem;  //увеличение Rear и вставка
        queue.nElem++;  // увеличение количества элементов в очереди
    }
    public static int dequeue(ArrayQueueADT queue) {
        int temp = queue.queue[queue.front++]; // получаем первый элемент из очереди

        if (queue.front == queue.maxSize) { // циклический перенос
            queue.front = 0;
        }
        queue.nElem--; // уменьшаем количество элементов в очереди
        return temp;

    }
    public static int element(ArrayQueueADT queue) {
        return queue.queue[queue.front];
    }


    public static void clear(ArrayQueueADT queue){
        queue.rear = -1;
        queue.front = 0;
        queue.nElem = 0;
    }
    public static boolean isEmpty(ArrayQueueADT queue) {
        return (queue.nElem == 0);
    }

    public static int size(ArrayQueueADT queue) {
        return queue.nElem;
    }
    public static void main(String[] args){
        ArrayQueueADT q = new ArrayQueueADT();
        for (int i = 0; i < 15; i++){
            enqueue(q, i+1);
        }
        while (!isEmpty(q)) System.out.print(dequeue(q)+ " ");
    }
}