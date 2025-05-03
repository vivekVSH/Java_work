public class test2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    //for deleting nth node from linklist
    public void deleteNthNode(int data){
        if(head == null){
            return;
        }

        int size = 0;
        Node currNode = head;
        while(currNode.next == null){
            currNode = currNode.next;
            size = size + 1;
        }

        int n = 0;
        if(n == size){
            head = head.next;
        }

        int toSearch = size -1;
        Node prevNode = head;
        int i = 1;
        while(i < toSearch){
            prevNode = prevNode.next;
            i++;
        }
        prevNode = prevNode.next.next;
        return; //data
    }
    public static void main(String[] args){
        test2 linklist = new test2();

        linklist.deleteNthNode(4);
    }
}
