import java.util.*;

public class LearnHashtable {
    public static void main(String[] args) {
        //Integer -> key, String -> value
        //if you want to change the load factor: new Hashtable<>(10, 0.5f)
        //f -> for float number
        Hashtable<Integer, String> table = new Hashtable<>(10); //have initial capacity of 11 elements in java
        //and have load factor = 0.75
        //load factor means if our hashtable is fill at the 0.75 capacity, it will dynamically expand to communicate more elements

        //add element with put method
        table.put(100, "Spongebob");
        table.put(123, "Patrick");
        table.put(321, "Sandy");
        table.put(555, "Squid");
        table.put(777, "Garry");

        //If you want to remove entry
        // table.remove(777);

        //to display our hashtable with key-value format:
        //keySet() -> to take all of our key and turn them into a set
        //and set is something that we can iterate over
        for(Integer key : table.keySet()) {
            //let's display each key hashcode too
            //to calculate the index, we can do like this: key.hashCode() % capacity of hashtable
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
            // a hash code value for this object, equal to the primitive int value represented by this Integer object.
        }

    }
}
