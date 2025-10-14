#include<iostream>
using namespace std;

class Demo
{
    public:
    void fun(int*p)
    {
        cout<<"Frist definstion\n";
    }

    void fun(float*p)
    {
        cout<<"Second defination\n";
    }

    void fun(int no)
    {
        cout<<"Third denfination\n";
    }
};

int main()
{
    int no =11;
    float f = 3.14;

    Demo obj1;

    obj1.fun(no);
    obj1.fun(&no);
    obj1.fun(&f);  

    return 0;
}
