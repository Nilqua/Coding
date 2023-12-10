#include <stdio.h>
#include <limits.h>

void main ()
{
    int currentline=1;
    int min = INT_MAX;
    int max = INT_MIN;
    int linemax,linemin;
    int sum=0;
    int total=0;
    for (;;)
    {
        int x;
        scanf ("%d",&x);
        if (x < 1)
        {
            break;
        }

        int u_input;
        for (int i=0; i<x; i++)
        {
            scanf ("%d",&u_input);
            sum += u_input;
        }
        printf ("%d\n",sum);

        if (sum >= max)
        {
            max = sum;
            linemax = currentline;
        }
        if (sum <= min)
        {
            min = sum;
            linemin = currentline;
        }

        total += sum;

        sum=0;
        currentline +=1 ;

    }
    printf ("%d %d\n",linemax,max);
    printf ("%d %d\n",linemin,min);
    printf ("%.2f",(float)total/(currentline-1));
}