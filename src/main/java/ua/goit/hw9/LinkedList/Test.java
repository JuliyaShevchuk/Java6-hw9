package main.java.ua.goit.hw9.LinkedList;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println("size input " + myLinkedList.size());
        for (int i = 0; i < 3; i++) {
            myLinkedList.add("Index" + i);
            System.out.println("Add element - Index" + i);
        }
        myLinkedList.print();

        System.out.println("size exit " + myLinkedList.size());
        System.out.println("Get element by index 0 - " + myLinkedList.get(0));
        System.out.println("Remove element by index 2 - " + myLinkedList.remove(2));

        myLinkedList.print();
        System.out.println("size exit " + myLinkedList.size());

        myLinkedList.clear();

        myLinkedList.print();
        System.out.println("size exit " + myLinkedList.size());


    }
}
