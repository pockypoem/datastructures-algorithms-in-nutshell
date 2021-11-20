public class LearnDynamicArr {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        //deleting element to test the shrink method
        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C"); //capacity is 5, when the remainder of capacity is <= 3, the capacity of array will shrink
        //the capacity has been shrink from 10 to 5 (10 / 2)

        // dynamicArray.insert(2, "X");
        // dynamicArray.delete("A");
        // System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
        System.out.println("empty: " + dynamicArray.isEmpty());
    }
    
}
