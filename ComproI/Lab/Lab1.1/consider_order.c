#include <stdio.h>
#include <stdlib.h>
void main ()
{
    int x,y;
    int t_x,t_y;
    int m,n;
    scanf ("%d%d",&x,&y);
    scanf ("%d%d",&m,&n);
    t_x = (m*2)+(n*1);
    t_y = (m*6)+(n*4);
    
    if (x>=t_x && y>=t_y)
    {
        printf ("Yes ");
        printf ("%d %d",abs(x-t_x),abs(y-t_y));
    }
    else if (x>=t_x && y<t_y)
    {
        printf ("No ");
        printf ("0 %d",abs(t_y-y));
    }
    else if (x<t_x && y>=t_y)
    {
        printf ("No ");
        printf ("%d 0",abs(t_x-x));
    }
}