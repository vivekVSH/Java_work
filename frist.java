import java.util.Scanner;

public class frist {

    public static String reverseString(String input){
        StringBuilder input1 = new StringBuilder();
        input1.append(input);
        input1.reverse();
        return input1.toString();
    }

    public static int reverseNumber(int num){
        int reverNUm = 0;
        while(num != 0){
            int digit = num % 10;
            reverNUm = reverNUm*10 + digit;
            num = num / 10;
        }
        return reverNUm;
    }

    public static void main(String args[]){

        //frist program
        System.out.println("Hello Vivek!!");
        Scanner sc = new Scanner(System.in);

        //second program
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

        //third program
        String str = "Vivek";
        String reverse = reverseString(str);
        System.out.println("the reverse string is : " + reverse);

        int number = 3456;
        int revnumber = reverseNumber(number);
        System.out.println("This is the reverse number:" + revnumber);

        String s = "Hande";
        String r = "";
        char ch;
        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            r = ch + r;
        }
        System.out.println(r);
    }
}