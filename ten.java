class animal{
    String color;
}

class cat extends animal{
    public void sound(){
        System.out.print("meo meo");
    }
}

//write multiple inhritance
interface one{
    void euu();
}

class two implements one{
    public void euu(){

    }
}

class three implements one{
    public void euu(){

    }
} 

class four extends two {
    public void euu(){
        super.euu();
    }
}
public class ten {
    // write basic code for inheritance
    public static void main(String[] args) {
        
    }
}
