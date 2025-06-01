import java.util.*;
import java.io.*;

//example of method overriding
class test{
    void printName(){
        System.out.print("vivek");
    }
}

class test2 extends test{
    void printName(){
        System.out.print("yash");
    }
}

//example of interface

interface Bike{
    void aplly(int stop);
    void speed(int speedup);
}

interface EvBike{
    void tkSpeed();
    void okSpeed();
}

class Duke implements Bike ,EvBike {
    public void aplly(int stop){
        System.out.println("increase speed");
    }

    public void speed(int speedup){
        System.out.println("decease speed");
    }

    public void tkSpeed(){
        System.out.println("yess");
    }
    public void okSpeed(){
        System.out.println("okkk");
    }
}

//example of abstrack class
abstract class Cycle{
    void paddle(int pk){
        System.out.println("okkk");
    }
    void assis(int ak){
        System.out.println("okkk");
    }
}

abstract class Moter{
    void ak (int st){
        System.out.println("okkk");
    }
}

class meta extends  Moter{
    void st(int am){
        System.out.println("okkk");
    }
}


public class eleven{
    //give example of enums
    public enum state {
        Start,
        Runnig,
        Waiting,
        Dead;
    }

    public static void main(String[] args){
        //print every constants
        System.out.println("Print States:");
        for(state st : state.values()){
            System.out.println(st);
        }

        //we can not create more then one abstact class but we can create more then one interface interface are pure abstraction

    }

}