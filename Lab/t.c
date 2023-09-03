#include <stdio.h>
void main ()
{
    int u_input;
    int tar;
    int c00=0,c01=0,c10=0,c11=0;
    scanf ("%d",&u_input);
    tar = u_input;

    while (1)
    {
        scanf ("%d",&u_input);
        if (u_input!=0 && u_input!=1)
        {
            break;
        }

        if (u_input==tar && tar==0)
        {
            c00++;
        }
        if (u_input==tar && tar==1)
        {
            c01++;
        }
        if (u_input==tar && tar==0)
        {
            c10++;
        }
        if (u_input==tar && tar==1)
        {
            c11++;
        }
        
    }
    printf ("00: %d\n01: %d\n10: %d\n11: %d",c00,c01,c10,c11);
}