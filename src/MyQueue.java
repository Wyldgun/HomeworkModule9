public interface MyQueue<T> {

    void add(T e);

     T peek();

     T poll();

    int size();

    void clear();
}
