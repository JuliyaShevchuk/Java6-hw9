package main.java.ua.goit.hw9.Queue;

public class Test {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>();
        System.out.println("size input " + myQueue.size());
        for (int i = 0; i < 3; i++) {
            myQueue.add("Index" + i);
            System.out.println("Add element - Index" + i);
        }
        myQueue.print();
        System.out.println("size exit " + myQueue.size());
        System.out.println("Remove element by index 2 - " + myQueue.remove(2));

        myQueue.print();
        System.out.println("size exit " + myQueue.size());

        System.out.println("First  element peek() - " + myQueue.peek());
        myQueue.print();
        System.out.println("size exit " + myQueue.size());

        System.out.println("First  element poll() - " + myQueue.poll());
        myQueue.print();
        System.out.println("size exit " + myQueue.size());

        myQueue.clear();
        myQueue.print();

    }
}
