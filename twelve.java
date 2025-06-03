import java.util.PriorityQueue;

public class twelve {
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
    public static void main(String[] args){

        //find largest element in the array 
        int[] number = {3,4,5,2,6,8,9,4};
        int large = number[0];
        for(int i=1; i<number.length; i++){
            if(number[i] > large){
                large = number[i];
            }
        }
        System.out.println("This is Largest number in array : " + large);

        //find Kth largest element in the array
        int[] num = {3,5,5,3,2,7,8,9,4,3};
        int k = 7;
        System.out.println(findKthLargest(num, k));
    }
}
