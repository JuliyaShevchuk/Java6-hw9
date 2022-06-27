package main.java.ua.goit.hw9.Stack;

public class Test {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println("size input " + myStack.size());
        for (int i = 0; i < 3; i++) {
            myStack.push("Index" + i);
            System.out.println("Push element - Index" + i);
        }
        System.out.println(myStack.print());
        System.out.println("size exit " + myStack.size());

        System.out.println("Remove  element by index 2 - " + myStack.remove(2));
        System.out.println(myStack.print());
        System.out.println("size exit " + myStack.size());

        System.out.println("Last  element peek() - " + myStack.peek());
        System.out.println(myStack.print());
        System.out.println("size exit " + myStack.size());

        System.out.println("Last  element pop() - " + myStack.pop());
        System.out.println(myStack.print());
        System.out.println("size exit " + myStack.size());

        myStack.clear();
        System.out.println(myStack.print());

    }
}
