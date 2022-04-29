#include <stdio.h>

void Function1_42357_Ahmed(int x, int y)
{
    int price;
    int n = x + y;
    printf("Function1_42357_Ahmed student ID = 42357 - section M2");
    for (int i = 1; i <= n; i++)
    {
        printf("Enter the price of car");
        scanf("%d", &price);
        if (price < 4000)
            printf("%f", price * 0.10);
        if (price >= 4000 && price <= 8000)
        {
        }
    }
}