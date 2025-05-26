import java.util.*;

public class six {

    public static long factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return (n * factorial(n -1));
    } 

    public static int binarySearch(int[] arr, int low, int high, int key){

        int mid = (low + high)/2;

        while(low <= high){
            if(arr[mid] < key){
                low = mid + 1;
            }else if(arr[mid] == key){
                return mid;
            }else{
                high = mid - 1;
            }
            mid = (low + high)/2;
        }

        if(low > high){
            return -1;
        }
        return -1;
    }

    /* this is function without using Collection packeg
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;    
            curr.next = prev;    
            prev = curr;         
            curr = next;         
        }

        return prev; 
    }

    
    public ListNode reverseListRecursive(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        
        ListNode newHead = reverseListRecursive(head.next);

        
        head.next.next = head;
        head.next = null;

        return newHead;
    } */
    public static void main(String[] args) {

        //sort array using userdefine method
        int[] array = {2,4,5,3,24,2,3,5,5,8,96,5,4};
        Arrays.sort(array);
        System.out.print(Arrays.toString(array));
        System.out.println();
        //int[] array = new int[5]; --it is fix size array
        //ArrayList<Integer> list = new ArrayList<>(); --this is dynamic array


        //factorial using recursion
        int n = 10;
        System.out.println(factorial(n));

        //reverse link list
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(30);
        list.add(5);
        list.add(10);
        list.add(40);

        System.out.print(list);
        System.out.println();
        Collections.reverse(list);
        System.out.print(list);
        System.out.println();

        //binary search 
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};

        int key = 0;

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element " + key + " found at index: " + result);
        } else {
            System.out.println("Element " + key + " not found in the array.");
        }
    }
}
