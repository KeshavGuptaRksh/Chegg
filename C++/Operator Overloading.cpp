// C++ program to overload different operators

#include <iostream>
using namespace std;
class operatorOverloading
{
public:
    int num1, num2;

    operatorOverloading(int x, int y)
    {
        num1 = x;
        num2 = y;
    }

    bool operator>=(operatorOverloading x, operatorOverloading y);
    bool operator<=(operatorOverloading x, operatorOverloading y);
    bool operator==(operatorOverloading x, operatorOverloading y);
    bool operator!=(operatorOverloading x, operatorOverloading y);
};

bool operatoOverloading ::operator<=(operatorOverloading x, operatorOverloading y)
{
    return x <= y;
}
bool
