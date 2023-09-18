import java.util.*;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 8;
    private Node<K, V>[] entries = new Node[DEFAULT_CAPACITY];

    private int size;

    public void put(K key, V value) {
        int index = getIndex(key);
        Node<K, V> current = entries[index];
        Node<K, V> node = new Node<>(key, value, null);
        if (current == null) {
            entries[index] = node;
            size++;
        } else {
            while (true) {
                if (current.next == null) {
                    current.next = node;
                    break;
                }
                current = current.next;
            }
        }
    }

    private int getIndex(K key) {
        return Math.abs(key.hashCode() % entries.length);
    }

    public V remove(K key) {
        int index = getIndex(key);
        Node<K, V> current = entries[index];

        if (entries[index].key.equals(key)) {
            while (true) {
                if (current.next == null) {

                    entries[index] = null;
                    break;
                }
                current = current.next;
            }
            size--;
        }
        return current.value;
    }

    public void clear() {
        for (int i = 0; i < entries.length; i++) {
            if (entries[i] != null) {
                entries[i] = null;
                size--;
            }
        }
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = getIndex(key);
        if (entries[index].getKey().equals(key)) {
            return entries[index].value;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (Node<K, V> temp:entries) {
            if (temp != null) {
                result.add(temp.toString());
            }
        }
        return "{" + result + "}";
    }

    private static class Node<K, V> {
        private K key;
        private V value;

        private Node<K, V> next;

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }
}
