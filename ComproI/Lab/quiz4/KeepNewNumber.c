#include <stdio.h>

void main ()
{
    int total=0;
    int u_input[100];
    
    for (;;)
    {
        int i=0;
        scanf ("%d",&u_input[i]);
        if (u_input <= 0){break;}
        total++;
    }

    int j;
    for (int i = 0; i < total; i++)
    {
        for (j = 0; j < i; j++)
        {
            if (u_input[i] == u_input[j]){break;}
        }
        if (i == j)
        {
            printf ("%d ",u_input[i]);
        }
        
    }
    
    printf ("%d\n",total);
}