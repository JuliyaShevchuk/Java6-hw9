package main.java.ua.goit.hw9.LinkedList;

import java.util.Objects;

public class MyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    static class Node<T> {
        T element;
        Node<T> previous;
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
            newNode.previous = tail;
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
            head.previous = null;
        } else {
            Node<T> element = get(index - 1);
            removeElement = element.next;
            if (index == size - 1) {
                tail = element;
                tail.next = null;
            } else {
                Node<T> elementNext = element.next.next;
                element.next = elementNext;
                elementNext.previous = element;
            }
        }
        size--;
        return removeElement.element;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
        System.out.println("Clened LinkedList");
    }

    public int size() {
        return size;
    }

    public Node<T> get(int index) {
        Node<T> element = head;
        for (int i = 0; i < index; i++) {
            element = element.next;
        }
        return element;
    }

    public void print() {
        System.out.println("Element head -" + ((head == null) ? null : head.element));
        Node<T> element = head;
        for (int i = 0; i < size; i++) {
            System.out.println("Element - " + element.element);
            element = element.next;
        }
        System.out.println("Element tail -" + ((tail == null) ? null : tail.element));

    }
}
