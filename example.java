import java.util.Arrays;
//import java.util.Math;

public class example{
    public static void main(String[] args){
        String str = "This is good";
        String rev = "";

        //count the word in string
        int countWord = str.split("\\s").length;
        int count = str.length();
        System.out.println(countWord);
        System.out.println(count);

        //to run this code use of stringBuilder form
        StringBuilder  reversedStr = new StringBuilder(str);
        reversedStr.reverse();
        System.out.print(reversedStr.toString());
        //for the reverse string
        for(int i = str.length() - 1 ; i >= 0 ; i--){
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        //print sum of element in the array
        int[] array = {20,40,50,60,70};
        int sum = 0;
        for(int i=0;i<array.length;i++){
            sum = sum + array[i];
        }
        System.out.println(sum);

        //covert string to array and make it reverse
        String myStr = "Panchnam";
        char[] myArray = myStr.toCharArray();
        System.out.println(myArray);
        int counts = myArray.length;
        for(int i = counts-1; i >= 0; i--){
            System.out.print(myArray[i]);
        } System.out.println();

        //to sort the element in array
        String[] cars = {"BMW" , "Volvo","Swift","Ertica"};
        for(int i = 0 ; i < cars.length ; i++){
            System.out.print(" " + cars[i]);
        }System.out.println();
        Arrays.sort(cars);
        for(String i : cars){
            System.out.print(" "+ i);
        }System.out.println();

        //print avarage in the of array
        int[] age = {20,40,30,10,50};
        int sums = 0;
        for(int i=0;i<age.length;i++){
            sums = sums + age[i];
        }
        int length = age.length;
        int avg = sums/length;
        System.out.println(avg);

        //find the lowest age in array
        int[] ages = {20,40,30,10,50};
        int lowestAge = ages[0];
        for(int i=1; i<ages.length; i++){
            if(lowestAge>ages[i]){
                lowestAge = ages[i];
            }
        }
        System.out.println(lowestAge);

        //find the squreroot of number
        Math.sqrt(25);
        //find the random number 
        int randomNumber = (int)(Math.random()*100);
        System.out.println(randomNumber);
    }
}