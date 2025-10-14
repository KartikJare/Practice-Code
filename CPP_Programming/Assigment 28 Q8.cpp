#include<iostream>
using namespace std;

class Demo
{
    public:
    void fun(int)
    {
        cout<<"Frist definstion\n";
    }

    void fun(int i, int j)
    {
        cout<<"Second defination\n";
    }
};

int main()
{
    Demo obj1;

    obj1.fun(10);
    obj1.fun(10, 20);  

    return 0;
}
