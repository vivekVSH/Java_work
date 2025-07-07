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
    public static void main(String[] args){
        int[] arr = {1,3,2,6,4,9,5};
        selection(arr);
        bubble(arr);
        insertion(arr);
    }
}
