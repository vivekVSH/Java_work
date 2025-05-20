import java.util.*;

public class third {
    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        }

        return fibonacci(num-1) + fibonacci(num-2);
    }

    public static boolean checkOddNum(List<Integer> ls){
        for(int i : ls){
            if(i % 2 == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean palandrom(String input){
        boolean result = true;
        int length = input.length();
        for(int i=0; i<length/2; i++){
            if(input.charAt(i) != input.charAt(length - i - 1)){
                return result = false;
            }
        }
        return result;
    }

    public static String removeWhiteSpace(String test){
        StringBuilder str = new StringBuilder();
        char[] charArray = test.toCharArray();
        for(char c : charArray){
            if(!Character.isWhitespace(c)){
                str.append(c);
            }
        }
        return str.toString();
    }
    public static void main(String args[]){

        //fibonacci using recursion
        int number = 10;
        System.out.println("Here is count of number"+number);

        for(int i=0; i<number; i++){
            System.out.print(fibonacci(i)+ " ");
        }
        System.out.println();
        //check odd number in list using for each loop
        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println("List 1: " + list1 + " -> All odd? " + checkOddNum(list1));
        
        //check the string are palandrom
        String str = "vivek";
        System.out.println("Here is result : " + palandrom(str));

        //remove whitespace from string
        String str1 = "this is cool";
        System.out.println(removeWhiteSpace(str1));
    }
}
