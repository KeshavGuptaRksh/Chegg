/**
 * A program that dynamically allocates big enough array to hold a user defined number of test scores
 * After creating array, it shpylbe be passed to a function which will sort the array in ascending order
 * Another function should be called that will claculate the average score, and finally the program should display avergae score and sorted list with appropriate heading.
 */

#include <iostream>
using namespace std;
// function to sort array in ascendoing order using selection sort technique.
void sort_test_score(int a[], int l)
{
    double avg = 0;
    cout << "The test score in ascending order, and their average, are:"
         << "\n";
    cout << "Score " << endl;
    cout << "----" << endl;
    int i, j, k, temp;
    for (i = 0; i < l - 1; i++)
    {

        k = i;
        for (j = i + 1; j < l; j++)
        { // finding the sallest value in an array and storing its index in K
            if (a[j] < a[k])
                k = j;
        }
        if (i != k)
        { // Swapping the smallest value and placing it on its desreved position.
            temp = a[i];
            a[i] = a[k];
            a[k] = temp;
        }
    }
    for (i = 0; i < l; i++)
        cout << a[i] << "\n";
}
// Function defined to calculate and store average of the test
double average_test_score(int a[], int l)
{
    int sum = 0;
    for (int i = 0; i < l; i++)
    {
        sum += a[i];
    }
    return (sum / l);
}

int main()
{
    cout << "How many test scores will you enter? ";
input:
    int n;
    cin >> n;
    if (n < 0)
    {
        cout << "The number cannot be nagative" << endl;
        cout << "Enter another number :";
        goto input;
    }
    else
    {
        int *arr = new int(n);
        int i = 0;
        while (i < n)
        {
            cout << "Enter test score " << i + 1 << ":";
            cin >> arr[i];
            if (arr[i] < 0)
                cout << "Negative scores are not allowed"
                     << "\n";
            else
                i++;
        }
        sort_test_score(arr, n);
        cout << "Average Score : " << average_test_score(arr, n);
    }
}
