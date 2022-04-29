#include <stdio.h>
int main()
{
    // declaring limit of an array
    int n = 20;
    // declaring an array of limit n
    int a[n];
    int i, j, k, f = 0;
    // Asking user to eneter 20 elements within a given range
    printf("Enter %d elements in array between 10 and 100\n", n);
    for (i = 0; i < n; i++)
    {
        scanf("%d", &a[i]);
    }

    // Printing the original array
    printf("\nOriginal Array\n");
    for (i = 0; i < n; i++)
    {
        printf("%d", a[i]);
    }
    // Logic to remove duplicate elements
    printf("\nArray After Removing duplicate\n");
    for (i = 0; i < n - 1; i++)
    {
        for (j = 0; j < n; j++)
        { // Checking if two consecutive elements are equal or not
            if (a[j] == a[j + 1])
            { // Performong left shit if the values are equal
                for (k = j; k < n; k++)
                {
                    a[k] = a[k + 1];
                }
                // reducing limit of array as the values are deleted
                n--;
            }
        }
    }
    // Printing the array after removing all the duplicate values
    for (i = 0; i < n; i++)
    {
        printf("%d\t", a[i]);
    }
}