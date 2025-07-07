public class sorting_tech {
    public static void selection(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minElement = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minElement]){
                    minElement = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minElement];
            arr[minElement] = temp;
        }
    }

    public static void bubble(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void insertion(int[] arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev >= 0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static int partition(int[] arr, int start, int end){
        int piot = arr[end];
        int idx = start - 1;

        for(int i=start; i<end-1; i++){
            if(arr[i] < piot){
                idx++;
                swap(arr, idx, i);
            }
        }
        swap(arr, idx, end);
        return idx++;
    }

    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quick(int[] arr, int start, int end){
        if(start < end){
            int piot = partition(arr, start, end);
            quick(arr, start, piot-1);
            quick(arr, piot+1, end);
        }
    }


    public static void main(String[] args){
        int[] arr = {1,3,2,6,4,9,5};
        int n = arr.length;
        selection(arr);
        bubble(arr);
        insertion(arr);
        quick(arr,0,n);
    }
}
