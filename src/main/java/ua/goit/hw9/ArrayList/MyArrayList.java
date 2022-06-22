package main.java.ua.goit.hw9.ArrayList;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public MyArrayList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException();
        }
        array = new Object[capacity];
    }

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public void add(T value) {
        if (array.length == size) {
            Object[] newElements = new Object[(array.length * 3) / 2 + 1];
            System.arraycopy(array, 0, newElements, 0, size);
            array = newElements;
        }
        array[size] = value;
        size++;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        T elementRemoved = (T) array[index];
        System.arraycopy(array, index + 1, array, index, size - index);
        size--;
        return elementRemoved;
    }

    public void clear() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
        System.out.println("Cleaned ArrayList!");
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) array[index];
    }

    public int lengthArray() {
        return array.length;
    }

    public String print() {
        return Arrays.toString(array);
    }

}
