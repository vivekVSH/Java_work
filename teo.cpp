#include<iostream>
using namespace std;
#define SWAp(a,b){a=a+b; b=a-b;a=a-b;}

void swapNumber(int a, int b){
    int temp = a;
    a = b;
    b = temp;
}

int main(){
    int num1 , num2;
    cin>>num1 >> num2;
    SWAp(num1,num2);
    cout<<num1<<" "<< num2<<endl;
    swapNumber(num1 , num2);
    cout<<num1 << " "<< num2<<endl;
    return 0;
}