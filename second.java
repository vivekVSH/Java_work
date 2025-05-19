import java.util.Scanner;

public class second {
    public static boolean stringContainVowel(String input){
        return input.toLowerCase().matches(".*[aeiou].*");
    }

    public static boolean isPrime(int num){
        if(num == 0 & num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }

        for(int i=2; i<=num/2; num++){
            if(num % 2 == 0){
                return false;
            }
        }

        return true;
    }

    public static void printFiboSer(int num){
        int a = 0;
        int b = 1;
        int c = 1;

        for(int i=1; i<=num; i++){
            System.out.print(a + ", ");
            a = b;
            b = c;
            c = a + b;
        }
    }
    public static void main(String args[]){
        //swap two number by using without third veriable
        int a = 50;
        int b = 100;
        System.out.println("Before the swaping: "+ a + " & " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After the swaping: "+ a + " & " + b);

        //with using third veriable

        int c = 30;
        int d = 40;
        System.out.println("befor swaping:" + c + " & " + d);
        int temp;
        temp = c;
        c = d;
        d = temp;
        System.out.println("after swaping:" + c + " & " + d);

        //string conatain vowels or not
        String test = "vivek";
        boolean output = stringContainVowel(test);
        System.out.println(output);

        //check the number is prime or not
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(number % 2 == 0){
            System.out.println("This is not prime number");
        }else{
            System.out.println("This is prime number");
        }

        //by using recursion
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        
        //print fibonacciSequence
        int nm = sc.nextInt();
        printFiboSer(nm);
    }
}
