#include <stdio.h>
void main ()
{
    int u_input,u_input_old;
    int intrest;
    int same,count;
    scanf ("%d",&intrest);
    for (same=0,count=0,u_input_old=intrest,u_input=1; u_input!=0;)
    {
        scanf ("%d",&u_input);
        if (u_input == intrest)
        {
            same += 1;
        }
        if (u_input == u_input_old)
        {
            count += 1;
        }
        u_input_old=u_input;
    }
    printf ("%d\n%d",count,same);
} 