import java.util.Scanner;

public class frist {
    public static void main(String args[]){
        System.out.println("Hello Vivek!!");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        int sub = a-b;
        float div = a/b;
        int mul = a*b;
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
    }
}
