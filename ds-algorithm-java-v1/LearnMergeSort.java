public class LearnMergeSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 5, 3, 4, 7, 6, 1};

        mergeSort(array); //recursive method

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if(length <= 1) return; //base case (define our array in two each time)

        //find middel position of our array
        int middle = length / 2;
        //subarray
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0; //for left array
        int j = 0; //for right array

        for(; i < length; i++) {
            if(i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    //helper method (to help another method)
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while(l < leftSize && r < rightSize) {
            //check which element is smaller
            if(leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        //probably going to be one element to remaining that we can't compare with another element because there is only one left
        while(l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while(r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
        
    }
}
