public class DynamicArray {
    int size;
    public int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }

    //overloaded constructor just if user put their own capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }

    //add method
    public void add(Object data) {
        if(size >= capacity) {
            grow(); //to expand the array
        }
        array[size] = data; //should be the end of the array
        size++;
    }

    public void insert(int index, Object data) {
        if(size >= capacity) {
            grow();
        }
        for(int i = size; i > index; i--) {
            array[i] = array[i - 1]; //it will shift right to make a room for the insertion
        }
        array[index] = data;
        size++;
    }

    public void delete(Object data) {
        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                //shift all the elements to the left
                for(int j = 0; j < (size - i - 1); j++) {
                    array[i + j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (int) (capacity/3)) { //we don't want to shrink often, just because that's consuming
                    shrink();
                }
                break;
            }
        }
    }

    public int search(Object data) {
        for(int i = 0; i < size; i++) {
            if(array[i] == data) {
                return i;
            }
        }
        return -1;
    }

    //to expand the size of the array
    private void grow() {
        //instansiate a new array
        //increase the capacity first
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    private void shrink() {
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String toString() {
        String string = "";

        //i < capacity to display the other empty element
        // if you don't want to display, just change it to i < size
        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if(string != "") {
            string = "[" + string.substring(0, string.length() - 2) + "]"; //example from A, B, C , -> become A, B, C (no comma at the end)
        } else {
            string = "[]";
        }

        return string;
    }
}
