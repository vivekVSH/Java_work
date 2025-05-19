public class second {
    public static void main(String args[]){
        //swap two number by using without two veriable
        int a = 50;
        int b = 100;
        System.out.println("Before the swaping: "+ a + " & " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After the swaping: "+ a + " & " + b);

    }
}
