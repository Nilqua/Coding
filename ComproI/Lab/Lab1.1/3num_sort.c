#include <stdio.h>
void main (){
    int x,y,z;
    int min,mid,max;
    scanf ("%d%d%d",&x,&y,&z);
    if (x<y && x<z)
    {
        min = x;
        if (y<z)
        {
            mid = y;
            max = z;
        }
        else
        {
            mid = z;
            max = y;
        }
    }
    else if (y<x && y<z)
    {
        min = y;
        if (x<z)
        {
            mid = x;
            max = z;
        }
        else
        {
            mid = z;
            max = x;
        }
    }
    else
    {
        min = z;
        if (x<y)
        {
            mid = x;
            max = y;
        }
        else 
        {
            mid = y;
            max = x;
        }
    }
    printf ("%d %d %d",min,mid,max);
}
