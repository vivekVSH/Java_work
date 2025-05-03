import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayList;

public class test6 {
    static class queue{
        static int array[];
        static int size;
        static int rear = -1;

        queue(int n){
            array = new int[size];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //enqueue opration 
        public static void enqueue(int data){
            if(rear == size-1){
                System.out.print("The queue is full");
                return;
            }
            rear++;
            array[rear] = data;
            
        }

        //dequeue opration
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }

            int fornt = array[0];
            for(int i=0; i<rear; i++){
                array[i] = array[i+1];
            }
            rear--;
            return fornt;
        }

        //peek opration in queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("The Queue is empty");
                return -1;
            }
            return array[0];
        }
    }
    public static void main(String args[]){

        //prebuild queue - we write linkedlist beacuse queue is interface then we cant create object of interface only create object of class
        Queue<Integer> qu = new LinkedList<>();
        //Queue<Integer> wp = new ArrayDequeue<>(); -- this is used for double ended queue
        queue q = new queue(8);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.enqueue(9);

        q.dequeue();
        q.peek();

        while(!q.isEmpty()){
            System.out.print(q.peek());
            q.dequeue();
        }

    }
}
