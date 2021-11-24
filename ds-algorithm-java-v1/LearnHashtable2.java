import java.util.*;

public class LearnHashtable2 {
    public static void main(String args[]) {
        Hashtable<String, String> table = new Hashtable<>(21);

        //add element with put method
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squid");
        table.put("777", "Garry");

        for(String key : table.keySet()) {
            //different datatype has a different formula
            System.out.println(key.hashCode() % 21 + "\t" + key + "\t" + table.get(key)); //if we use 10 or 11 for capacity, we will have 2 collisions
            //to prevent the collision, we can increase the capacity. For example the capacity is 21
        }
    }
}
