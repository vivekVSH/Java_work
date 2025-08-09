public class sliding_window{
    public static int slide_wido(int[] arr, int k){
        if(arr == null || arr.length == 0 || k<=0 || k > arr.length){
            return -1;
        }
        int windoSum  = 0;
        for(int i=0; i<k; i++){
            windoSum += arr[i];
        }
        int maxSum = windoSum;
        for(int i=k; i<arr.length; i++){
            windoSum = windoSum + arr[i] - arr[i - k];
            maxSum = Math.max(maxSum , windoSum);
        }
        return maxSum;
    }
    public static void main(String args[]){
        int k = 3;
    }
}