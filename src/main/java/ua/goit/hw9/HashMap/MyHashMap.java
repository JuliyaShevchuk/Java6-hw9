package main.java.ua.goit.hw9.HashMap;

import main.java.ua.goit.hw9.LinkedList.MyLinkedList;

public class MyHashMap<K, V> {
    Node[] table;
    int size;

    public MyHashMap() {
        table = new Node[16];
    }

    public class Node<K, V> {
        int hash;
        K key;
        V value;
        Node<K, V> next;
    }

    public static int myHash(int v, int length) {
        return v % (length - 1);
    }

    public void put(K key, V value) {
        Node<K,V> newNode = new Node<>();
        newNode.hash = myHash(key.hashCode(), table.length);
        newNode.value = value;
        newNode.key = key;
        newNode.next = null;

        Node<K,V> temp = table[newNode.hash];

        Node<K,V> iterLast = null;
        boolean keyRepeat = false;
        if (temp == null) {
            table[newNode.hash] = newNode;
            size++;
        } else {
            while (temp != null) {
                if (temp.key != null && temp.key.equals(key)) {
                    keyRepeat = true;
                    System.out.println("the key is duplicated key "+key);
                    temp.value = value;
                    break;
                } else {
                    iterLast = temp;
                    temp = temp.next;
                }
            }
            if (keyRepeat == false) {
                iterLast.next = newNode;
                size++;
            }
        }
    }

    public V get(K key) {
        int hash = myHash(key.hashCode(), table.length);
        V value = null;
        if (table[hash] == null) {
            return null;
        } else {
            Node<K,V> temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key)) {
                    value = temp.value;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
        return value;
    }

    public V remove(K key) {
        Node<K,V> removeNode = null;
        int hash = myHash(key.hashCode(), table.length);
        if (table[hash] == null) {
            return null;
        } else {
            Node<K,V> temp = table[hash];
            Node<K,V> previousNode = null;
            while (temp != null) {
                if (temp.key.equals(key)) {
                    removeNode = temp;
                    if (previousNode != null) {
                        previousNode.next = removeNode.next;
                    } else {
                        if (removeNode.next != null) {
                            table[hash] = removeNode.next;
                        } else {
                            table[hash] = null;
                        }
                    }
                    size--;
                    break;
                }
                previousNode = temp;
                temp = temp.next;
            }
            return removeNode.value;
        }

    }

    public int size() {
        return size;
    }

    public void clear() {
        table = new Node[16];
        size = 0;
        System.out.println("Clened HashMap");
    }

    public void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(i + " - " + ((table[i] == null) ? "null" : (table[i].value+" key "+table[i].key)));
            Node node = table[i];
            while (node != null) {
                System.out.println("Node " + node.value);
                node = node.next;
            }
        }

    }
}
