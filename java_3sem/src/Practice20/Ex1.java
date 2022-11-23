package Practice20;
// создать обобщенный класс с термя параметрами
public class Ex1 <K, V, T>{
    private K k;
    private V v;
    private T t;

    public Ex1(K k, V v, T t) {
        this.k = k;
        this.v = v;
        this.t = t;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Ex1{" +
                "k=" + k +
                ", v=" + v +
                ", t=" + t +
                '}';
    }
    public static void main(String[] args){
        Ex1<Integer, String, Double> test = new Ex1(1, "Ex1", 3.14);

        System.out.println(test.getK());
        System.out.println(test.getV());
        System.out.println( test.getT());

        System.out.println(test);
    }
}
