#include <stdio.h>

void main ()
{
    int x,y;
    int xp;
    scanf ("%d%d",&x,&y);

    xp = (x/y);
    if (xp*y<x)
    {
        printf ("%d",xp+1);
    }
    else 
    {
        printf ("%d",xp);
    }
}