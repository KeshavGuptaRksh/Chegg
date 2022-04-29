// This program is created by Anwar ID = 56432 Section F3 CS159

#include <stdio.h>
int main()
{
    // Part A
    char A_Anwar[21] = "A_Anwar";
    int AUMID = 56432;
    char section[] = "F3";
    printf("Lab 2 is created by student %s - 56342 - section %s", A_Anwar, AUMID, section);

    // Part B
    int A_56432 = 5, B_56432 = 6;

    // Part C
    int C_Anwar;
    switch (A_56432 > B_56432 ? 1 : 0)
    {
    case 1:
        C_Anwar = A_56432;
        break;
    case 0:
        C_Anwar = B_56432;
    }

    // Part D
    printf("Item\tDiscount");
    int price;
    double dprice, sum = 0, tprice;
    ;
    for (int i = 1; i <= C_Anwar; i++)
    {
        printf("\nEnter the price of item #%d ", i);
        scanf("%d", &price);
        dprice = price < 1000 ? price * 0.10 : price <= 2000 ? price * 0.20
                                                             : price * 0.15;
        printf("Price of item #%d after discount is %f \n", i, (price - dprice));
        sum = sum + (price - dprice);
    }
    tprice = sum - (sum * 0.20);
    printf("\nTotal price after dicount of all itmes which get a discount of 20 percent  is %f \n", tprice);

    // Part E
    int E_Anwar = 6;
    for (int i = 1; i <= E_Anwar - 1; i++)
    {
        printf("56432 - Anwar - F3\n");
    }
    return 0;
}
