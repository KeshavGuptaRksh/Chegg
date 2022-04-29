#include <stdio.h>

typedef struct complex
{
    double real;
    double imag;
} complex;

complex addComplex(complex z1, complex z2)
{
    complex z3;
    z3.real = z1.real + z2.real;
    z3.imag = z1.imag + z2.imag;
    return z3;
}

void printComplex(complex z)
{
    printf("%f + %f i ", z.real, z.imag);
}

int main()
{
    complex num1, num2, r;
    printf("Enter the real and imaginary parts of First number");
    scanf("%f %f", &num1.real, &num1.imag);
    printf("Enter the real and imaginary parts of Second number");
    scanf("%f %f", num2.real, num2.imag);
    r = addComplex(num1, num2);
    printComplex(r);
    return 0;
}