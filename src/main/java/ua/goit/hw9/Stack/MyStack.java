package main.java.ua.goit.hw9.Stack;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<T> {
    private static final int DEFAULT_CAPACITY = 5;
    private int size;
    private Object[] array;
    private int top;


    public MyStack() {
        this(DEFAULT_CAPACITY);
    }

    public MyStack(int s) {
        if (s <= 0) {
            throw new IllegalArgumentException();
        }
        this.size = s;
        array = new Object[size];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public void push(T value) {
        array[++top] = value;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T elementRemoved = (T) array[index];
        System.arraycopy(array, index + 1, array, index, (top + 1) - index);
        top--;
        return elementRemoved;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            T element = (T) array[top];
            array[top] = null;
            top--;
            return element;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return null;
        } else {
            return (T) array[top];
        }
    }

    public void clear() {
        array = new Object[size];
        top = -1;
        System.out.println("Cleaned stack!");
    }

    public int size() {
        return top + 1;
    }

    public String print() {
        return Arrays.toString(array);
    }
}
