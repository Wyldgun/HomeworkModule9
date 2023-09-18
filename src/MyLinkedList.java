import java.util.Arrays;
import java.util.StringJoiner;

public class MyLinkedList<T> implements MyQueue<T>, MyStack<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
            node.prev = tail;
        }
        tail = node;
        size++;
    }

    public T remove(int index) {

        Node<T> current = head;

        for (int i = 0; i <= size; i++) {
            if (i == index) {
                if (index != 0) {
                    current.prev.next = current.next;
                } else if(index != size() - 1){
                    current.next.prev = current.prev;
                }

                if (index == 0) {
                    head = current.next;
                } else if (index == size() - 1) {
                    tail = current.prev;
                }
                current.next = null;
                current.prev = null;
                size--;
                break;
            }
            current = current.next;
        }

        return (T) current.value;
    }

    @Override
    public void clear() {
        Node<T> current = head;
        for (int i = 0; i <= size; i++) {
            if (head.next == null) {
                break;
            } else {
                current = current.next;
                current.prev.next = null;
                current.prev = null;
                size--;
            }
        }

        head = null;
        tail = null;
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    public T get(int index) {

        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;
    }

    //My Stack methods
    @Override
    public void push(T e) {
        add(e);
    }

    @Override
    public T pop() {
        return remove(size() - 1);
    }

    @Override
    public T peek1() {
        return tail.value;
    }

    //My Queue methods
    @Override
    public T peek() {
        return head.value;
    }

    @Override
    public T poll() {
        return remove(0);
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");

        Node<T> current = head;
        for (int i = 0; i < size; i++) {
            if (current != null) {
                result.add(current.value.toString());
                current = current.next;
            }
        }
        return "[" + result + "]";
    }

    static class Node<T> {
        T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }

}
