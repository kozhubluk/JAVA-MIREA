package Practice20.Ex4;

public class MinMax <N extends Comparable<N>> {
    private N[] array;

    public MinMax(N[] array) {
        this.array = array;
    }

    public N[] getArray() {
        return array;
    }

    public void setArray(N[] array) {
        this.array = array;
    }
    public N findMin(){
        N tempMin = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i].compareTo(tempMin) < 0) tempMin = array[i];
        }
        return tempMin;
    }
    public N findMax(){
        N tempMax = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i].compareTo(tempMax) > 0) tempMax = array[i];
        }
        return tempMax;
    }

    public static void main(String[] args) {
        Integer[] array = {0, 2, -4, 4, 9};
        Double[] array1 = {1.3, -4.0, 2.4, 90.3, 1.0};
        MinMax<Integer> minMax = new MinMax<>(array);
        MinMax<Double> minMax1 = new MinMax<>(array1);
        System.out.println(minMax.findMax());
        System.out.println(minMax.findMin());
        System.out.println(minMax1.findMax());
        System.out.println(minMax1.findMin());
    }
}
