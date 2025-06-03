public class twelve {
    public static void main(String[] args){
        int[] number = {3,4,5,2,6,8,9,4};
        int large = number[0];
        for(int i=1; i<number.length; i++){
            if(number[i] > large){
                large = number[i];
            }
        }
        System.out.println("This is Largest number in array : " + large);
    }
}
