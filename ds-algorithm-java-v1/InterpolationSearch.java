public class InterpolationSearch {
    public static void main(String[] args) {
        // int[] array = {1, 3, 7, 10, 14, 15, 16, 18, 20, 21, 22, 23, 25, 33, 35, 42, 45, 47, 50, 52};
        // int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        // int index = interpolationSearch(array, 33); //search value that you want to search
        // int index = interpolationSearch(array, 5); 
        int index = interpolationSearch(array, 256); 

        if(index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        //we will declared upper bound and lower bound of the search area
        int high = array.length - 1; 
        int low = 0;

        //to continue probing
        while(value >= array[low] && value <= array[high] && low <= high) {
            //our search area will be shrink every each iteration
            int probe = low + (high - low) * (value - array[low]) / (array[high] - array[low]); //formula that calculated where are value is likely going to be
            
            // System.out.println("High: " + high);
            // System.out.println("Low: " + low);
            // int var1 = high - low;
            // System.out.println(var1);
            // int var2 = value - array[low];
            // System.out.println(var2);
            // int var3 = array[high] - array[low];
            // System.out.println(var3);


            System.out.println("probe: " + probe);
            // System.out.println(array[probe]);
            // System.out.println(value);

            if(array[probe] == value) {
                return probe;
            } else if(array[probe] < value) {
                low = probe + 1;
            } else {
                high = probe - 1;
            }
        }

        return -1;
    }
}
