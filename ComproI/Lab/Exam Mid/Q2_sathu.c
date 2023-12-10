#include <stdio.h>
void main ()
{
    int x;
    int sumsathu=0;
    scanf ("%d",&x);
    while (x!=0)
    {
        if (x%10==9)
        {
            sumsathu++;
        }
        x = x/10;
    }

    for (int i=0; i<sumsathu; i++)
    {
        printf ("SATHU ");
    }
    if (sumsathu==12)
    {
        printf ("\nOHH! Serious SATHU");
    }
    else if (sumsathu==0)
    {
        printf ("Hope to find SATHU next time");
    }
}