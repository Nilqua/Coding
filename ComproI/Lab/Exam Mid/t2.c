#include <stdio.h>

void main ()
{
    int x,y,e;
    int xp_used;
    scanf ("%d%d%d",&e,&x,&y);

    xp_used = x-e;

    if (e+y<x)
        {   
            // (เศษ+ส่วน)-1/ส่วน
            int xp;

            xp = ((xp_used+y)-1)/y;
            printf ("No %d",xp);
        }
    else
        {
            printf ("Congratulation LVL Up!!");
        }
}