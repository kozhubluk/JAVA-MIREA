package Practice20.Ex3;


import java.io.Serializable;

// T - реализует Comparable
// V - реализует Animal и Serializable
// K
public class Ex3 <T extends Comparable<T>, V extends Animal & Serializable, K>{
    private K k;
    private V v;
    private T t;

    public Ex3(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
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
        return "Ex3{" +
                "k=" + k +
                ", v=" + v +
                ", t=" + t +
                '}';
    }
    public static void main(String[] args){
        Ex3<Integer, GuineaPig, String> ex3 = new Ex3<Integer, GuineaPig, String> (1, new GuineaPig("Oleg", 3), "STROKA");
        System.out.println(ex3);
    }
}


