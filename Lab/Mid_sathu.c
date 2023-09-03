#include <stdio.h>
void main ()
{
    int x;
    int sum=0;
    scanf ("%d",&x);
    while (x!=0)
    {
        sum += x%100;
        x = x/100;
    }
    if (sum%100==12)
    {
        printf ("OHH! SERIOUS SATHU");
    }
    else
    {
        printf ("Hope to find SATHU next time!");
    }
}
