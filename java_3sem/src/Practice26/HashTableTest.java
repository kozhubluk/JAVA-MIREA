package Practice26;

public class HashTableTest {
    public static void main(String[] args){
        HashTable<String, Integer> ht = new HashTable<>(10);
        ht.put("one", 1);
        ht.put("two", 2);
        ht.put("three", 3);
        ht.put("four", 4);
        ht.put("five", 5);
        ht.print();
        System.out.println("-------------------после рехеширования----------------------");
        ht.put("six", 6);
        ht.put("seven", 7);
        ht.put("eight", 8);
        ht.put("nine", 9);
        ht.put("ten", 10);
        ht.put("eleven", 11);
        ht.put("twelve", 12);
        ht.print();

        System.out.println(ht.get("two"));
        System.out.println(ht.remove("nine"));
        System.out.println("-------------------после удаления----------------------");
        ht.print();
    }
}
