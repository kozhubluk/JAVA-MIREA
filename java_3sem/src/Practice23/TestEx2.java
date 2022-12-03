package Practice23;

public class TestEx2 {

    public static void main(String[] args){
        LinkedQueue lq = new LinkedQueue();
        ArrayQueue aq = new ArrayQueue();

        for (int i = 0; i < 15; i++){
            lq.enqueue(i*2);
            aq.enqueue(i);
        }
        while (!lq.isEmpty() && !aq.isEmpty()){
            System.out.print(lq.dequeue() + " ");
            System.out.println(aq.dequeue());
        }
    }
}
