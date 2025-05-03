public class bubble_sort {
    // here is n-1 camparision in array

    public static void printArr(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void conqure(int array[], int si, int mid, int ei) {
        int merge[] = new int[ei - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= ei) {
            if (array[idx1] < array[idx2]) {
                merge[x] = array[idx1];
                x++;
                idx1++;
            } else {
                merge[x] = array[idx2];
                x++;
                idx2++;
            }
        }

        while(idx1 <= mid){
            merge[x] = array[idx1];
            x++;
            idx1++;
        }

        while(idx2 <= ei){
            merge[x] = array[idx2];
            x++;
            idx2++;  
        }

        int i, j;
        for(i=0, j=si; i<merge.length; i++, j++){
            array[j] = merge[i];
        }

    }

    // funtion for the merge sort
    // time complexity of merge sort is O(nlogn)

    public static void divide(int array[], int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }

        divide(array, si, mid);
        divide(array, mid + 1, ei);
        conqure(array, si, mid, ei);
    }

    public static int partation(int array[], int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        i++;
        int temp = array[i];
        array[i] = pivot;
        pivot = temp;
        return i;   
    }

    //this function for the quick sort 
    public static void quickSort(int array[], int low , int high){
        if(low < high){
            int pidx = partation(array, low, high);

            quickSort(array, low, pidx-1);
            quickSort(array,pidx+1,high);
        }
    }

    public static void main(String args[]) {
        int array[] = { 7, 2, 6, 9, 3, 5, 1 };
        int n = array.length;

        // this for bubble sort
        // time complexity of bubble sort is O(n^2)

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        printArr(array);
        System.out.println();

        // this code selection sort
        // time complexity of selection sort is O(n^2)

        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] = temp;
        }
        printArr(array);
        System.out.println();

        // this code for insertion sort
        // time complexity of insertion sort is O(n^2)

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        printArr(array);
        System.out.println();

        divide(array , 0 , n-1);
        printArr(array);
        System.out.println();

        quickSort(array, 0 , n-1);
        printArr(array);
        System.out.println();
    }
}
