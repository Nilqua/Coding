#include <stdio.h>
void main ()
{
    int x;
    int sum=0;
    scanf ("%d",&x);
    while (x!=0)
    {
        sum += x%10;
        x = x/10;
    }
    if (sum%10==9)
    {
        printf ("OHH! SERIOUS SATHU");
    }
    else
    {
        printf ("Hope to find SATHU next time!");
    }
}
