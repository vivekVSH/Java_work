class Encasulation{
    private String Name;
    private int age;

    public String getName(){
        return Name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setAge(int age){
        this.age = age;
    }

    //abstraction class and method
    
    abstract class animalia{
        public abstract void soundAni();
        public void sleep(){
            System.out.print("Zzzzz Zzzzz");
        }
    }

    class dog extends animalia{
        public void soundAni(){
            System.out.print("Bhuuu Bhuuu");
        }
    }

    public static void main(String args[]){

        //create aboject for the encapsulation class
        Encasulation personDTE = new Encasulation();

        //create object for the animal class

        animal ani = new animal();

        horse hor = new horse();

        pig pg = new pig();

        //call the object

        ani.soundAnimal();
        hor.soundAnimal();
        pg.pigSound();

        personDTE.setName("Vivek Patil");
        personDTE.setAge(22);

        personDTE.getAge();
        personDTE.getName();

        System.out.println(personDTE.getAge());
        System.out.println( personDTE.getName());

        //to call outer and inner class by using two object

        outer.inner ny = new outer.inner();
        System.out.println(ny.x);
        //System.out.println(ny.y);
    }
}

//this example of ploymorphism which mean the many form know as the many class are inter releted to each other

class animal{
    public void soundAnimal(){
        System.out.println("Sound of particular animal");
    }
}

class horse extends animal{
    public void soundAnimal(){
        System.out.println("Hmmm Hmmm");
    }
}

class pig extends animal{
    public void pigSound(){
        System.out.println("Owee owee");
    }
}

//outer and inner class

class outer{
    int y = 20;

    static class inner{
        int x = 10;
    }
}
