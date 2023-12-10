#include <stdio.h>
#include <limits.h>
void main ()
{
    int max = INT_MIN;
    int maxper;
    int n,k;
    scanf ("%d%d",&n,&k);
    int vote[k];
    int score[n+1];

    for (int i=0; i<n+1; i++)
    {
        score[i] =0;
    }
    
    for (int i=0; i<k; i++)
    {
        scanf ("%d",&vote[i]);
        score[vote[i]]++;
    }

    for (int i=0; i<=n; i++)
    {
        if (score[i]>0)
        {
            if (score[i] > max)
            {
                max = score[i];
                maxper = i;
            }
        }
    }

    printf ("%d\n%d",maxper,max);
}