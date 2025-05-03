class Student{
    String name;
    int roll_no;
    String mail;

    //this is the method which mean the function in the class is know as methods it is used call property in in main class
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.mail);
    }

    //constuctor is used for the to construct a object that is same name as class and this is without pass parameter constructor
    // Student(){
    //     System.out.println("This user constructor");
    // }

    //pass parameter constructor we dont want initalize in the object we can directly pass value in constructor
    Student(String name , int roll_no , String mail){
        this.name = name;
        this.roll_no = roll_no;
        this.mail = mail;
    }
}

//inheritance their are four type of inheritanc in the java single level inheritance ,multi level , hybrid and herachical

class shape{
    String color;
}

class tringle extends shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);
    }
}

class circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

//encapsulation using access modifire getter and setter method

class account {
    public String name;
    public int age;

    private String password;

    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

//abstation using abstract keyword in class and method
//this also an example of runtime polymorphism which mean method overriding
//in abraction we also use of constructor

abstract class animal{
    abstract void walk();

    animal(){
        System.out.println("Create a new aniomal");
    }
}

class horse extends animal{

    horse(){
        System.out.println("We create a single horse");
    }

    public void walk(){
        System.out.println("walk on four leg");
    }
}

class chiken extends animal{

    chiken(){
        System.out.println("we create a chiken");
    }
    
    public void walk(){
        System.out.println("Walk in 2 leg");
    }
}

//above abraction is not pure so to do pure extraction we use of interfaces their is we cant create method in the base class
//Abstraction using interfaces 

interface plant{
    void takeO();
    
}

interface smallPlant{
    void takeO();
}

class BananaTree implements plant , smallPlant{
    public void takeO(){
        System.out.println("it tree take oxygen");
    }
}

//we cant inherite muliple class in sigle class but we can multiple inherite of interface in single class 

public class opp_concept {
    public static void main(String args[]){
        Student s1 = new Student("Vivek",32,"handevivek942@gmail.com");
        s1.printInfo();
        circle c1 = new circle();
        c1.area(2);

        account a1 = new account();
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());

        horse h1 = new horse();
        h1.walk();

        BananaTree b1 = new BananaTree();
        b1.takeO();
    }
}