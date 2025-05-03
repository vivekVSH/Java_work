import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.time.LocalTime;
import java.time.LocalDate;

public class main4{
    public static void main(String[] args){
        //it is adjucstable array
        ArrayList<Integer> numb = new ArrayList<Integer>();
        //Link list using prebuild method
        LinkedList<Integer> numz = new LinkedList<Integer>();

        //print local date and local time
        LocalDate obj1 =  LocalDate.now(); 
        LocalTime obj2 = LocalTime.now();
        System.out.println(obj1);
        System.out.println(obj2);

        //add element in the Link List
        numz.add(1);
        numz.add(3);
        numz.add(5);
        numz.add(6);
        numz.add(4);
        numz.add(8);
        numz.add(6);
        numz.add(2);

        //add element in the array
        numb.add(10);
        numb.add(20);
        numb.add(40);
        numb.add(60);
        numb.add(80);
        numb.add(30);
        numb.add(50);
        numb.add(90);
        numb.add(100);

        //oparation for the Linklist
        numz.addFirst(10);
        numz.addLast(20);
        numz.removeFirst();
        numz.removeLast();
        numz.getFirst();
        numz.getLast();

        System.out.println(numz);
        Collections.sort(numz);
        System.out.println(numz);

        //opration for the arrayList
        numb.remove(0);
        numb.get(4);
        numb.set(1,44);
        numb.size();

        System.out.println(numb);
        Collections.sort(numb);
        System.out.println(numb);

        Collections.reverseOrder();
        for(int i = 0; i < numz.size() ; i++){
            System.out.print(i);
        }

    }

}