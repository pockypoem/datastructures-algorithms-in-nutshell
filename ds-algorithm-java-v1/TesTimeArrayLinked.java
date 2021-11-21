import java.util.ArrayList;
import java.util.LinkedList;

public class TesTimeArrayLinked {
    public static void main(String[] args) {
        //Testing between Array List and Linked List
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        //keep track on the time
        //we work with nanosecond so we use long datatype
        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }

        //=================LinkedList=========================
        //Returns the current value of the running Java Virtual Machine's high-resolution time source, in nanoseconds.
        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);

        //remove element from linkedlist
        // linkedList.remove(0); -> LinkedList is faster than array List
        // linkedList.remove(500000);
        linkedList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList:\t" + elapsedTime + " ns");

        //=================ArrayList=========================
        startTime = System.nanoTime();

        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999); //last index
        //in getting the element, array List is faster than linked list

        //remove element from arraylist
        // arrayList.remove(0);
        // arrayList.remove(500000); -> arrayList is faster than linked list
        arrayList.remove(999999); // -> array List is faster than Linked List

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapsedTime + " ns");
    }
}