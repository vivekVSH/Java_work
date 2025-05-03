import java.util.*;
public class abs {
        // overloading
    void sum(int a, int b) {
        int c=a+b;
        System.out.println(c);

    }

    void sum(int a, int b, int c) {

        int d=a+b+c;
        System.out.println(d);
    }

    void  sub(int a, int b){
        int c=a-b;
        System.out.println(c);
    }
    
    //using the constructor create a class

    String Name;
    String LastName;
    int Batch_N0;

    public abs(String Rname, String rLastName, int Rbathch_no){
        this.Name = Rname;
        this.LastName = rLastName;
        this.Batch_N0 = Rbathch_no;
    }

    //abstraction class
    abstract static class Vk{
        abstract void turnOFF();
        abstract void turnON();
    }

    static class TVremote extends Vk{
        void turnOFF(){
            System.out.println("Used for turn off the TV");
        }

        void turnON(){
            System.out.println("used to turn on the TV"); 
        }
    }

    public static void main(String[] args){

        //here is create an object to excute the constructor
       abs myObj = new abs("vivek","hande",15); 
       System.out.println(myObj.Name + " " +  myObj.LastName + " " + myObj.Batch_N0);
       Vk Abst = new TVremote();

       //call the abstraction class
       Abst.turnOFF();
       Abst.turnON();

       //method overloading
       myObj.sum(10, 20);
       myObj.sum(10, 20, 30);
       myObj.sub(20, 10);

    }

}

