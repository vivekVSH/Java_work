abstract class main {
  public String Name  = "Vivek";
  public int age  = 22;
  public abstract void study(); //abstract method  
}

class Student extends main{
    public int grajate_year = 2025;

    public void study(){
        System.out.print("Student study in All day");
    }
}
//call the method using abstact class
public class main3 {
  public static void main(String[]args){
      Student myObj = new Student();
      System.out.println(myObj.Name);
      System.out.println(myObj.age);
      System.out.println(myObj.grajate_year);
      myObj.study();
  }
}
