#include <stdio.h>
void main ()
{
    int x;
    int sum=0;
    scanf ("%d",&x);
    while (x!=0)
    {
       if (x%100==12)
       {
        sum++;
       }
        x = x/10;
    }
    
    for (int i=0; i<sum; i++)
    {
        printf ("AMEN ");
    }

    if (sum==0)
    {
        printf ("Hope to find AMEN next time");
    }
}
