package Practice20;

// создать обобщенный класс с термя параметрами
// добавить вывод имен класса

public class Ex2 <K, V, T>{
    private K k;
    private V v;
    private T t;

    public Ex2(K k, V v, T t) {
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
        return "Ex2{" +
                "k = " + k + " (" + k.getClass().getName() + ")" +
                ", v =" + v + " (" + v.getClass().getName() + ")" +
                ", t =" + t + " (" + t.getClass().getName() + ")" +
                '}';
    }
    public static void main(String[] args){
        Ex2<Integer, String, Double> test = new Ex2(2, "Ex2", 3.14);

        System.out.println(test.getK());
        System.out.println(test.getV());
        System.out.println( test.getT());

        System.out.println(test);
    }
}
