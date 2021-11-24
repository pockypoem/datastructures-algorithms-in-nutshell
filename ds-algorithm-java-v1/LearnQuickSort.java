public class LearnQuickSort {
    public static void main(String[] main) {
        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};

        //invoke quickSort function
        //3 parameters: our array, beginning index, end index
        quickSort(array, 0, array.length - 1);

        for(int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end) {
        if(end <= start) return; //base case

        //find the location of pivot
        //we passing our original array as an argument to the partition function
        //no need of sub-array
        int pivot = partition(array, start, end);

        //pass each partition function recursively back into the quickSort function
        quickSort(array, start, pivot - 1); //left side from the pivot
        quickSort(array, pivot + 1, end); //right side from the pivot
    }

    //partition is going to sort our array and find the pivot
    //all the elements in the left will be smaller than our pivot
    //our elements in the right will be larger than our pivot
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;
        
        for(int j = start; j <= end - 1; j++) {
            if(array[j] < pivot) {
                i++;
                //swap variables
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        //swap i with j at the pivot place
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; //location of our pivot
    }
}
