import java.util.ArrayList;
import java.util.Collections;

public class test {
    Node head;
    private int size = 0;

    class Node{
        String data;
        Node next;
    
        Node(String data){
            this.data = data;
            this.next = null;
            size++; 
        }
    }
    
    //add element in the first in link list
    public void addFirst(String data){
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
    public void addLast(String data){
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

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(5);
        list.remove(1);
        list.size();
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list);
        //arraylist is good for the search opration and linklist is good for add element in the llinklist of middle and any where.

        //LinkList Revision
        test lits = new test();
        lits.addFirst("Hey");
        lits.addFirst("vivek");
        lits.printList();

        lits.addLast("How ");
        lits.addLast("are");
        lits.addLast("you");
        lits.printList();

        lits.deleteFirst();
        lits.printList();
        lits.deleteLast();
        lits.printList();

        int sz = lits.getSize();
        System.out.println(sz);
    }
}

