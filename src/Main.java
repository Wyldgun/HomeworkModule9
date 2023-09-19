import java.util.*;

public class Main {
    public static void main(String[] args) {
        myArrayListTest();
        myLinkedListTest();
        myQueueTest();
        myStackTest();
        myHashMapTest();
    }

    private static void myArrayListTest() {

        //Integer test
        MyArrayList<Integer> myArrayListInteger = new MyArrayList<>();
        ArrayList<Integer> arrayListInteger = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            myArrayListInteger.add(i);
            arrayListInteger.add(i);
        }

        System.out.println("-----------------------------");
        System.out.println("MY_ARRAY_LIST:");
        System.out.println("-----------------------------");

        System.out.println("myArrayListInteger = " + myArrayListInteger);

        System.out.println("myArrayListInteger.remove() = " + myArrayListInteger.remove(2));
        System.out.println("myArrayListInteger = " + myArrayListInteger);

        System.out.println("myArrayListInteger.size() = " + myArrayListInteger.size());
        System.out.println("myArrayListInteger.get() = " + myArrayListInteger.get(2));

        myArrayListInteger.clear();
        System.out.println("myArrayListInteger.clear() = " + myArrayListInteger);

        System.out.println("-----------------------------");

        System.out.println("arrayListInteger = " + arrayListInteger);

        System.out.println("arrayListInteger.remove() = " + arrayListInteger.remove(2));
        System.out.println("arrayListInteger = " + arrayListInteger);

        System.out.println("arrayListInteger.size() = " + arrayListInteger.size());
        System.out.println("arrayListInteger.get() = " + arrayListInteger.get(2));

        arrayListInteger.clear();
        System.out.println("arrayListInteger.clear() = " + arrayListInteger);

        System.out.println("-----------------------------");

        //String test
        MyArrayList<String> myArrayListString = new MyArrayList<>();

        myArrayListString.add("a");
        myArrayListString.add("b");
        myArrayListString.add("c");
        myArrayListString.add("d");

        ArrayList<String> arrayListString = new ArrayList<>();

        arrayListString.add("a");
        arrayListString.add("b");
        arrayListString.add("c");
        arrayListString.add("d");

        System.out.println("myArrayListString = " + myArrayListString);

        System.out.println("myArrayListString.remove() = " + myArrayListString.remove(2));
        System.out.println("myArrayListString = " + myArrayListString);

        System.out.println("myArrayListString.size() = " + myArrayListString.size());
        System.out.println("myArrayListString.get() = " + myArrayListString.get(2));

        myArrayListString.clear();
        System.out.println("myArrayListString.clear() = " + myArrayListString);

        System.out.println("-----------------------------");

        System.out.println("arrayListString = " + arrayListString);

        System.out.println("arrayListString.remove() = " + arrayListString.remove(2));
        System.out.println("arrayListString = " + arrayListString);

        System.out.println("arrayListString.size() = " + arrayListString.size());
        System.out.println("arrayListString.get() = " + arrayListString.get(2));

        arrayListString.clear();
        System.out.println("arrayListString.clear() = " + arrayListString);

    }

    private static void myLinkedListTest() {

        //Integer test
        MyLinkedList<Integer> myLinkedListInteger = new MyLinkedList<>();
        LinkedList<Integer> linkedListInteger = new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            myLinkedListInteger.add(i);
            linkedListInteger.add(i);
        }

        System.out.println("-----------------------------");
        System.out.println("MY_LINKED_LIST:");
        System.out.println("-----------------------------");

        System.out.println("myLinkedListInteger = " + myLinkedListInteger);

        System.out.println("myLinkedListInteger.remove() = " + myLinkedListInteger.remove(2));
        System.out.println("myLinkedListInteger = " + myLinkedListInteger);

        System.out.println("myLinkedListInteger.size() = " + myLinkedListInteger.size());
        System.out.println("myLinkedListInteger.get() = " + myLinkedListInteger.get(2));

        myLinkedListInteger.clear();
        System.out.println("myLinkedListInteger.clear() = " + myLinkedListInteger);

        System.out.println("-----------------------------");

        System.out.println("linkedListInteger = " + linkedListInteger);

        System.out.println("linkedListInteger.remove() = " + linkedListInteger.remove(2));
        System.out.println("linkedListInteger = " + linkedListInteger);

        System.out.println("linkedListInteger.size() = " + linkedListInteger.size());
        System.out.println("linkedListInteger.get() = " + linkedListInteger.get(2));

        linkedListInteger.clear();
        System.out.println("linkedListInteger.clear() = " + linkedListInteger);

        //String test
        MyLinkedList<String> myLinkedListString = new MyLinkedList<>();

        myLinkedListString.add("a");
        myLinkedListString.add("b");
        myLinkedListString.add("c");
        myLinkedListString.add("d");

        LinkedList<String> linkedListString = new LinkedList<>();

        linkedListString.add("a");
        linkedListString.add("b");
        linkedListString.add("c");
        linkedListString.add("d");

        System.out.println("-----------------------------");

        System.out.println("myLinkedListString = " + myLinkedListString);

        System.out.println("myLinkedListString.remove() = " + myLinkedListString.remove(2));
        System.out.println("myLinkedListString = " + myLinkedListString);

        System.out.println("myLinkedListString.size() = " + myLinkedListString.size());
        System.out.println("myLinkedListString.get() = " + myLinkedListString.get(2));

        myLinkedListString.clear();
        System.out.println("myLinkedListString.clear() = " + myLinkedListString);

        System.out.println("-----------------------------");

        System.out.println("linkedListString = " + linkedListString);

        System.out.println("linkedListString.remove() = " + linkedListString.remove(2));
        System.out.println("linkedListString = " + linkedListString);

        System.out.println("linkedListString.size() = " + linkedListString.size());
        System.out.println("linkedListString.get() = " + linkedListString.get(2));

        linkedListString.clear();
        System.out.println("linkedListString.clear() = " + linkedListString);
    }

    private static void myQueueTest() {
        //Integer test
        MyQueue<Integer> myQueueListInteger = new MyLinkedList<>();
        Queue<Integer> queueListInteger = new LinkedList<>();

        for (int i = 1; i < 5; i++) {
            myQueueListInteger.add(i);
            queueListInteger.add(i);
        }

        System.out.println("-----------------------------");
        System.out.println("MY_QUEUE:");
        System.out.println("-----------------------------");

        System.out.println("myQueueListInteger = " + myQueueListInteger);

        System.out.println("myQueueListInteger.poll() = " + myQueueListInteger.poll());
        System.out.println("myQueueListInteger.peek() = " + myQueueListInteger.peek());
        System.out.println("myQueueListInteger = " + myQueueListInteger);

        System.out.println("myQueueListInteger.size() = " + myQueueListInteger.size());

        myQueueListInteger.clear();
        System.out.println("myQueueListInteger.clear() = " + myQueueListInteger);

        System.out.println("-----------------------------");

        System.out.println("queueListInteger = " + queueListInteger);

        System.out.println("queueListInteger.poll() = " + queueListInteger.poll());
        System.out.println("queueListInteger.peek() = " + queueListInteger.peek());
        System.out.println("queueListInteger = " + queueListInteger);

        System.out.println("queueListInteger.size() = " + queueListInteger.size());

        queueListInteger.clear();
        System.out.println("queueListInteger.clear() = " + queueListInteger);

        System.out.println("-----------------------------");

        //String test
        MyQueue<String> myQueueListString = new MyLinkedList<>();

        myQueueListString.add("a");
        myQueueListString.add("b");
        myQueueListString.add("c");
        myQueueListString.add("d");

        Queue<String> queueListString = new LinkedList<>();

        queueListString.add("a");
        queueListString.add("b");
        queueListString.add("c");
        queueListString.add("d");

        System.out.println("myQueueListString = " + myQueueListString);

        System.out.println("myQueueListString.poll() = " + myQueueListString.poll());
        System.out.println("myQueueListString.peek() = " + myQueueListString.peek());
        System.out.println("myQueueListString = " + myQueueListString);

        System.out.println("myQueueListString.size() = " + myQueueListString.size());

        myQueueListString.clear();
        System.out.println("myQueueListString.clear() = " + myQueueListString);

        System.out.println("-----------------------------");

        System.out.println("queueListString = " + queueListString);

        System.out.println("queueListString.poll() = " + queueListString.poll());
        System.out.println("queueListString.peek() = " + queueListString.peek());
        System.out.println("queueListString = " + queueListString);

        System.out.println("queueListString.size() = " + queueListString.size());

        queueListString.clear();
        System.out.println("queueListString.clear() = " + queueListString);
    }

    private static void myStackTest() {
        //Integer test
        MyStack<Integer> myStackListInteger = new MyLinkedList<>();
        Stack<Integer> stackListInteger = new Stack<>();

        for (int i = 1; i < 5; i++) {
            myStackListInteger.push(i);
            stackListInteger.push(i);
        }

        System.out.println("-----------------------------");
        System.out.println("MY_STACK:");
        System.out.println("-----------------------------");

        System.out.println("myStackListInteger = " + myStackListInteger);

        System.out.println("myStackListInteger.pop() = " + myStackListInteger.pop());
        System.out.println("myStackListInteger.peek() = " + myStackListInteger.peek1());
        System.out.println("myStackListInteger = " + myStackListInteger);

        System.out.println("myStackListInteger.size() = " + myStackListInteger.size());

        myStackListInteger.clear();
        System.out.println("myStackListInteger.clear() = " + myStackListInteger);

        System.out.println("-----------------------------");

        System.out.println("stackListInteger = " + stackListInteger);

        System.out.println("stackListInteger.pop() = " + stackListInteger.pop());
        System.out.println("stackListInteger.peek() = " + stackListInteger.peek());
        System.out.println("stackListInteger = " + stackListInteger);

        System.out.println("stackListInteger.size() = " + stackListInteger.size());

        stackListInteger.clear();
        System.out.println("stackListInteger.clear() = " + stackListInteger);

        System.out.println("-----------------------------");

        //String test
        MyStack<String> myStackListString = new MyLinkedList<>();

        myStackListString.push("a");
        myStackListString.push("b");
        myStackListString.push("c");
        myStackListString.push("d");

        Stack<String> stackListString = new Stack<>();

        stackListString.add("a");
        stackListString.add("b");
        stackListString.add("c");
        stackListString.add("d");

        System.out.println("myStackListString = " + myStackListString);

        System.out.println("myStackListString.pop() = " + myStackListString.pop());
        System.out.println("myStackListString.peek() = " + myStackListString.peek1());
        System.out.println("myStackListString = " + myStackListString);

        System.out.println("myStackListString.size() = " + myStackListString.size());

        myStackListString.clear();
        System.out.println("myStackListString.clear() = " + myStackListString);

        System.out.println("-----------------------------");

        System.out.println("stackListString = " + stackListString);

        System.out.println("stackListString.pop() = " + stackListString.pop());
        System.out.println("stackListString.peek() = " + stackListString.peek());
        System.out.println("stackListString = " + stackListString);

        System.out.println("stackListString.size() = " + stackListString.size());

        stackListString.clear();
        System.out.println("stackListString.clear() = " + stackListString);
    }

    private static void myHashMapTest() {
        //String-Integer test
        MyHashMap<String, Integer> myHashMapList = new MyHashMap();
        HashMap<String, Integer> hashMapList = new HashMap<>();

        String[] letter = new String[]{"a", "a", "a", "b", "c", "d"};
        for (int i = 0; i < letter.length; i++) {
            myHashMapList.put(letter[i], i);
            hashMapList.put(letter[i], i);
        }

        System.out.println("-----------------------------");
        System.out.println("MY_HASH_MAP:");
        System.out.println("-----------------------------");

        System.out.println("myHashMapList = " + myHashMapList);

        System.out.println("myHashMapList.remove() = " + myHashMapList.remove("a"));
        System.out.println("myHashMapList.get() = " + myHashMapList.get("b"));
        System.out.println("myHashMapList = " + myHashMapList);

        System.out.println("myHashMapList.size() = " + myHashMapList.size());

        myHashMapList.clear();
        System.out.println("myHashMapList.clear() = " + myHashMapList);

        System.out.println("-----------------------------");

        System.out.println("hashMapList = " + hashMapList);

        System.out.println("hashMapList.remove() = " + hashMapList.remove("a"));
        System.out.println("hashMapList.get() = " + hashMapList.get("b"));
        System.out.println("hashMapList = " + hashMapList);

        System.out.println("hashMapList.size() = " + hashMapList.size());

        hashMapList.clear();
        System.out.println("hashMapList.clear() = " + hashMapList);

        System.out.println("-----------------------------");
    }

}



