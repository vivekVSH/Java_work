public class test4 {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;
        Node prev;


        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    //doubly link list
    public void treavelElement(){
        if(head == null){
            return;
        }

        Node currNode = head; 
        System.out.print("NULL<=" );
        while(currNode != null){
            System.out.print(currNode.data + "<=>" );
            currNode = currNode.next;
        }System.out.println("NULL");
    }

    //add element at start position
    public void addFirstpos(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    //add element in the middle of the link list
    public void addMiddle(int data,int position){
        Node newNode  = new Node(data);
        if(position == 1){
            addFirstpos(data);
        }else{
            Node currNode = head;
            int currPosiution = 1;
            while(currNode != null && currPosiution < position){
                currNode = currNode.next;
                currPosiution++;
            }
            if(currNode == null){
                addEndpos(data);
            }
            else{
                newNode.next = currNode;
                newNode.prev = currNode.prev;
                currNode.prev.next = newNode;
                currNode.prev = newNode;
            }
        }
    }

    //add end of element
    public void addEndpos(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    //delete element from first positon
    public void deleteFirstpos(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node newNode = head;
        head = head.next;
        head.prev = null;
        newNode.next = null;
    }

    //delete element at end of linklist
    public void deleteLastpos(){
        if(head == null){
            return;
        }
        if(head == tail){
            head = null;
            tail = null;
            return;
        }
        Node newNode = tail;
        tail.prev = tail;
        tail.next = null;
        newNode.prev = null;

    }
    public static void main(String[] args){

        test4 linklist = new test4();

        linklist.addFirstpos(2);
        linklist.addFirstpos(4);
        linklist.addFirstpos(6);
        linklist.addFirstpos(9);
        linklist.treavelElement();

        linklist.addMiddle(4 ,2);
        linklist.addMiddle(3 ,3);
        linklist.addMiddle(2 ,4);
        linklist.treavelElement();

        linklist.addEndpos(8);
        linklist.addEndpos(9);
        linklist.addEndpos(7);
        linklist.treavelElement();

        linklist.deleteFirstpos();
        linklist.deleteFirstpos();
        linklist.treavelElement();

        linklist.deleteFirstpos();
        linklist.deleteLastpos();
        linklist.treavelElement();
    }
}
