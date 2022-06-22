package main.java.ua.goit.hw9.HashMap;

public class Test {
    public static void main(String[] args) {
        MyHashMap myHashMap=new MyHashMap();
        myHashMap.print();
        System.out.println("Size - "+myHashMap.size());
        System.out.println("Add elements");
        myHashMap.put(10,"a");
        myHashMap.put(20,"b");
        myHashMap.put(30,"c");
        myHashMap.put(10,"ss");
        myHashMap.put(40,"h");
        myHashMap.put(50,"k");
        myHashMap.put(70,"m");
        System.out.println("Size - "+myHashMap.size());
        myHashMap.print();
        System.out.println("-----------------");
        System.out.println("Get key 30 - "+myHashMap.get(30));
        System.out.println("Size - "+myHashMap.size());
        System.out.println("-----------------");
        System.out.println("Remove key 10 - "+myHashMap.remove(10));
        System.out.println("Size - "+myHashMap.size());
        myHashMap.print();
        System.out.println("-----------------");
        myHashMap.clear();
        System.out.println("Size - "+myHashMap.size());
        myHashMap.print();





    }
}

