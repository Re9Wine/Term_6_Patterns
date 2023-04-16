package org.example.Iterator;

public class IteratorRunner {
    public static void main(String[] args) {
        List<Integer> list = new List<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        IIterator iterator = list.getIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
