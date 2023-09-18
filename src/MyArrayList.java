import java.util.Arrays;
import java.util.StringJoiner;

public class MyArrayList<T> {
    public static final int DEFAULT_CAPACITY = 10;
    private Object[] data;
    private int size;

    public MyArrayList() {
        data = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public void add(T value) {
        if (size == data.length) {
            Object[] newData = new Object[DEFAULT_CAPACITY * 2];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
        }
        data[size] = value;
        size++;
    }

    public T remove(int index) {
        Object[] newData = new Object[data.length - 1];
        Object temp = null;
        boolean isFound = true;
        for (int i = 0; i < data.length; i++) {
            if (i == index) {
                temp = data[i];
                //newData[i] = "removed?";
                isFound = false;
                size--;
            } else {
                if (isFound){
                    newData[i] = data[i];
                } else {
                    newData[i - 1] = data[i];
                    i++;
                }
            }
        }
        data = (T[]) newData;
        return (T) temp;
    }

    public void clear() {
        for (int i = 0; i < data.length; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringJoiner result = new StringJoiner(", ");
        for (int i = 0; i < size; i++) {
            if(data[i] != null){
                result.add(data[i].toString());
            }
        }
        return "[" + result + "]";
    }
}
