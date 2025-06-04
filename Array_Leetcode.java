public class Array_Leetcode {
    public static int maxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxPro = 0;

        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else if(price - minPrice > maxPro){
                maxPro = price - minPrice;
            }
        }
        return maxPro;
    }
    public static void main(String[] args){
        //when buy and sell stock
        int[] price = {7,1,5,3,6,4};
        System.out.println("The Max profit is : "+ maxProfit(price));
    }
}
