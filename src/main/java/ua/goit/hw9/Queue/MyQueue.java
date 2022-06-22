package main.java.ua.goit.hw9.Queue;

import java.util.Objects;

public class MyQueue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element) {
            this.element = element;
        }
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T remove(int index) {
        Objects.checkIndex(index, size);
        Node<T> removeElement;
        if (index == 0) {
            removeElement = head;
            head = head.next;
        } else {
            Node<T> element = head;
            for (int i = 0; i < index - 1; i++) {
                element = element.next;
            }
            removeElement = element.next;
            if (index == size - 1) {
                tail = element;
                tail.next = null;
            } else {
                Node<T> elementNext = element.next.next;
                element.next = elementNext;
            }
        }
        size--;
        return removeElement.element;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Clened queue");
    }

    public int size() {
        return size;
    }

    //peek() возвращает первый элемент в очереди (FIFO)
    public T peek() {
        return head.element;
    }

    //poll() возвращает первый элемент в очереди и удаляет его из коллекции
    public T poll() {
        return remove(0);
    }

    public void print() {
        Node<T> element = head;
        for (int i = 0; i < size; i++) {
            System.out.println("Element - " + element.element);
            element = element.next;
        }
        System.out.println("Element head -" + ((head == null) ? null : head.element));
        System.out.println("Element tail -" + ((tail == null) ? null : tail.element));
    }
}
