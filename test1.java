public class test1 {
    Node head;
    private int size = 0;

    class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
            size++; 
        }
    }
    
    //add element in the first in link list
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
             head = newNode;
             return;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    //add element at end of Linklist
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //print all in the linklist
    public void printList(){
        if(head == null){
            System.out.println("NUll");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->" );
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first node from linklist
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last element from list
    public void deleteLast(){
        if(head == null){
            System.out.println("The list was empty");
            return;
        }
        size--;                 

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLastNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLastNode = secondLastNode.next;
        }
        secondLastNode.next = null;
    }

    //for linklist size
    public int getSize(){
        return size;
    }

    //reverse linklist by using itrative method
    public void reverseList(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //link list reverse using recursive method
    public Node recursiveReverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node newHead = recursiveReverse(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }

    public static void main(String[] args){
        test1 lits = new test1();
        lits.addFirst(4);
        lits.addFirst(3);
        lits.printList();

        lits.addLast(6);
        lits.addLast(8);
        lits.addLast(7);
        lits.printList();

        lits.reverseList();
        lits.printList();

        lits.head = lits.recursiveReverse(lits.head);
        lits.printList();

        int sz = lits.getSize();
        System.out.println(sz);

    }
}
