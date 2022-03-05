#include <stdio.h>
#include <math.h>
int count_digits(int n)
{
    int d = 0;
    while (n > 0)
    {
        d++;
        n /= 10;
    }
    return d;
}

void print_digits(int n, int d)
{
    int dig, rem = n;
    double p;
    for (int i = d - 1; i >= 0; i--)
    {
        p = pow(10, (double)i);
        dig = rem / (int)p;
        rem = rem % (int)p;
        printf("%d     ", dig);
    }
}
int main()
{
    int num, temp, digits;
    printf("Enter the number");
    scanf("%d", &num);
    digits = count_digits(num);
    print_digits(num, digits);
    return 0;
}