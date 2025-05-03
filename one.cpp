#include <iostream>
using namespace std;

class Student {
    public:
    string Name;
    int Number;
    string email;

};

class example{
    public:
    int a,b;
    // create the user define costrctor
    example(int x, int y){
        a = this->a;
        b = this->b;

        a= x;
        b= y;

        cout<<"This is value of A and B";

    }

    void display(){

        cout<<a<<endl<<b;

    }
};

class Gender : public Student{
    public:
    bool Gen;
};

int main()
{
    Student s1;
    s1.Name = "Vivek";
    s1.Number = 7717044;
    s1.email = "handevivek@gmail.com";

    cout<<s1.Name<<endl<<s1.email<<endl<<s1.Number<<endl;

    Gender s2;
    s2.Name = "PAtil";
    s2.Gen ;

    cout<<s2.Name<<endl<<s2.Gen<<endl;

    example is_object(10 , 20);

    is_object.display();
    

    return 0;
}