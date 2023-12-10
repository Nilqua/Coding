#include <stdio.h>
void main ()
{
    int score,mid,final;
    scanf ("%d%d%d",&score,&mid,&final);
    int total = score+mid+final;
    if (total >=80 )
    {
        printf ("A");
    }
    else if (total >= 75)
    {
        printf ("B+");
    }
    else if (total >= 70)
    {
        printf ("B");
    }
    else if (total >= 65)
    {
        printf ("C+");
    }
    else if (total >= 60)
    {
        printf ("C");
    }
    else if (total >= 55)
    {
        printf ("D+");
    }
    else if (total >= 50)
    {
        printf ("D");
    }
    else
    {
        printf ("F");
    }
}