#include <stdio.h>

void findmax (int x,int y)
{
    if (x > y)
    {
        printf ("%d",x);
    }
    else
    {
        printf ("%d",y);
    }
}

void main ()
{
    int n;
    scanf ("%d",&n);
    int arr[n];
    int a=0,b=0;

    for (int i=0; i<n; i++)
    {
        scanf ("%d",&arr[i]);
    }

    int m;
    scanf ("%d",&m);

    for (int i=0; i<n; i++)
    {
        if (arr[i] > m)
        {
            a += arr[i];
        }
        else if (arr[i] < m)
        {
            b += arr[i];
        }
    }

    findmax(a,b);
}