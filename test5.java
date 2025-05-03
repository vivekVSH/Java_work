import java.util.Stack;

public class test5 {
    //stack using LinkList
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class stack{

        public static Node head;
        public static boolean isEmpty(){
            return head == null;
        }

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return ;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String args[]){
        stack s = new stack();
        //prebuild stack implementation method
        Stack<Integer> s1 = new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);

        while(!s.isEmpty()){
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}
