#include<iostream>
using namespace std;

class Base
{
    public:
        int i, j;
        static int k;
    
    Base()
    {
        i = 10;
        j = 20;
    }

    void fun()
    {
        cout<<"Base Fun\n";
    }
};

int Base::k = 11;

class Dervied:public Base
{
    public:
        int x,y;
    
    Dervied()
    {
        x = 50;
        y = 60;
    }
    
    void gun()
    {
        cout<<"Derived Gun\n";
    }
};

int main()
{
    Base bobj;
    Dervied dobj;
    
    cout<<sizeof(bobj)<<"\n"; //8
    cout<<sizeof(dobj)<<"\n"; //16

    cout<<bobj.i<<"\n"; //10
    cout<<bobj.j<<"\n"; //20
    cout<<bobj.k<<"\n"; //11
    cout<<dobj.x<<"\n"; //50
    cout<<dobj.y<<"\n"; //60
    //cout<<bobj.x<<"\n"; //error

    bobj.fun();
    //dobj.fun(); //error
    dobj.gun();
    
    return 0;
}
