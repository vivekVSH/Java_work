public class main2 {
    int x = 10;

    // class second{
    //     main2 myObj3 = new main2();
    //     System.out.println(myObj3.x);
    // }

    String Fname = "Vivek";
    String Lname = "Hande";
    int age = 20;

    static void number(){
        System.out.println("Hello Man");
    }

    public void Pointer(){
        System.out.println("Hello Boy");
    }

    static void printTwoNum(int num1 , int num2){
        System.out.println(num1 + " " + num2);
    }

    //funtion created for the recurtion

    public static int sumation(int k){
        if(k > 0){
            return k + sumation(k - 1);

        }else{
            return 0;
        }
    }

    


    public static void main(String[] args){
        main2 myObj = new main2();
        main2 myObj1 = new main2();
        System.out.println(myObj.x);
        System.out.println(myObj1.x);
        main2 Data = new main2();
        System.out.println(Data.Fname +" " + Data.Lname + " " + Data.age);

        //call the method using public keyword it wan create a object to excute this method 
        main2 num = new main2();
        num.Pointer();

        //call the method using the static keywords
        number();

        //array

        String[] car = {"BMW", "Maruti" , "Wagnor"};

        //print sum of roll number 
        
        int [] Rollnumber = {10,20,30,40};

        //two diamentional array
        int [][] Mark = {{11,12,13,14}, {21,22,23,24}};
        for(int i = 0; i < Mark.length; ++i){
            for(int j = 0; j < Mark[i].length;++j){
                System.out.println(Mark[i][j]);
            }
        }

        int sum  = 0;

        for(int i = 0; i<car.length; i++){
            System.out.println(car[i]);
        }

        for(int j = 0; j < Rollnumber.length; j++){
            System.out.println(Rollnumber[j]);
            sum = sum + Rollnumber[j]; 
        } 
        System.out.println(sum);

        printTwoNum(500 , 600);
        printTwoNum(200 , 300);
        printTwoNum(400 , 500);

        //recurtion function call here

        int result = sumation(10);
        System.out.println(result);
        
    }
}
