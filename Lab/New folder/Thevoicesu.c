#include <stdio.h>
void main ()
{
    int k,k1,k2,s1,s2,g;
    scanf ("%d%d%d%d%d%d",&k,&k1,&k2,&s1,&s2,&g);
    if (s1>=9 && s2>=9)
    {
        if (g==1 && k1<k)
        {
            printf ("1");
        }
        else if (g==1 && k2<k)
        {
            printf ("2");
        }
        else if (g==2 && k2<k)
        {
            printf ("2");
        }
        else if (g==2 && k1<k)
        {
            printf ("1");
        }
        else if ((g==1 || g==2)&&(k1>=k && k2>k))
        {
            printf ("0");
        }
    }
    else if (s1>=9 && s2<9)
    {
        if (k1<k)
        {
            printf ("1");
        }
        else
        {
            printf ("0");
        }
    }
    else if (s1<9 && s2>=9)
    {
        if (k2<k)
        {
            printf ("2");
        }
        else
        {
            printf ("0");
        }
    }
    else
    {
        printf ("0");
    }
}
