package Practice26;

import java.util.ArrayList;
import java.util.Hashtable;

public class HashTable<K, V> {
    // Класс узла связного списка . Используется только в хэш-таблице,
    // реализуется в виде двусвязного списка
    private static class LinkedListNode<K, V> {
        public LinkedListNode<K, V> next;
        public LinkedListNode<K, V> prev;
        public K key;
        public V value;
        public LinkedListNode(K k, V v) {
            key = k;
            value = v;
        }

        public String printForward() { // вывод всех элементов списка
            String data = "(" + key + "," + value + ")";
            if (next != null) {
                return data + "--->" + next.printForward();
            } else {
                return data;
            }
        }
    }

    private ArrayList<LinkedListNode<K, V>> arr;
    private int size;
    private int capacity;

    public HashTable(int capacity) {
        // Создание списка связных списков
        // Cписок заполняется значениями null

        arr = new ArrayList<LinkedListNode<K, V>>();
        arr.ensureCapacity(capacity);
        for (int i = 0; i < capacity; i++) {
            arr.add(null);
        }
        this.capacity = capacity;
    }

    // Вставка ключа и значения в хэш-таблицу
    public V put(K key, V value) {
        LinkedListNode<K, V> node = getNodeForKey(key);
        if (size + 1 >= capacity * 0.75){
            this.rehash();
        }

        if (node != null) {
            V oldValue = node.value;
            node.value = value; // обновить значение
            return oldValue;
        }

        node = new LinkedListNode<K, V>(key, value);
        int index = getIndexForKey(key);
        if (arr.get(index) != null) {
            node.next = arr.get(index);
            node.next.prev = node;
        }
        arr.set(index, node);
        size++;
        return null;
    }
    public void rehash(){ // рехещирование
        ArrayList<LinkedListNode<K, V>> na = (ArrayList<LinkedListNode<K, V>>)this.arr.clone();
        arr = new ArrayList<>(capacity*2);
        for (int i = 0; i < capacity*2; i++) arr.add(null);
        size = 0;
        capacity = capacity*2;
        for (int i = 0; i < capacity/2; i++) {
            while (na.get(i) != null){
                this.put(na.get(i).key, na.get(i).value);
                na.set(i, na.get(i).next);
            }
        }

    }

    // Удаление узла для ключа
    public V remove(K key) {
        LinkedListNode<K, V> node = getNodeForKey(key);
        if (node == null) { // если не найден
            return null;
        }

        if (node.prev != null) {
            node.prev.next = node.next;
            // удаляем из списка
        } else {
            // удаление начального узла списка
            int hashKey = getIndexForKey(key);
            arr.set(hashKey, node.next);
        }

        if (node.next != null) {
            node.next.prev = node.prev;
        }
        size--;
        return node.value;
    }

    // Получение значения по ключу
    public V get(K key) {
        if (key == null) return null;
        LinkedListNode<K, V> node = getNodeForKey(key);
        return node == null ? null : node.value;
    }

    // Получение узла связного списка для заданного ключа
    private LinkedListNode<K, V> getNodeForKey(K key) {
        int index = getIndexForKey(key);
        LinkedListNode<K, V> current = arr.get(index);
        while (current != null) {
            if (current.key == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // hash функция
    public int getIndexForKey(K key) {
        return Math.abs(key.hashCode() % arr.size());
    }
    // вывод массива с элементами
    public void print() {
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i) == null ? "" : arr.get(i).printForward();
            System.out.println(i + ": " + s);
        }
    }
}