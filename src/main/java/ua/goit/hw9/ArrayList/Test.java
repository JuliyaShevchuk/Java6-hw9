package main.java.ua.goit.hw9.ArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList<String> myArrayList = new MyArrayList<>();
        System.out.println("size input " + myArrayList.size());
        System.out.println("length input " + myArrayList.lengthArray());
        System.out.println(myArrayList.print());

        for (int i = 0; i < 15; i++) {
            myArrayList.add("Index" + i);
        }

        System.out.println("size exit " + myArrayList.size());
        System.out.println("length exit " + myArrayList.lengthArray());
        System.out.println(myArrayList.print());

        System.out.println("Removed " + myArrayList.remove(2));
        System.out.println("size exit " + myArrayList.size());
        System.out.println("length exit " + myArrayList.lengthArray());
        System.out.println(myArrayList.print());

        System.out.println("Get element by index 0 - " + myArrayList.get(0));

        myArrayList.clear();
        System.out.println("size exit " + myArrayList.size());
        System.out.println("length exit " + myArrayList.lengthArray());
    }
}
