#include <stdio.h>
#include <limits.h>

void main ()
{
    int n,k;
    scanf ("%d%d",&n,&k);
    int saddle[n][k];
    int minrow[n];
    int maxrow[n];
    int mincol[n];
    int maxcol[n];
    
    for (int i=0; i<n; i++)
    {
        for (int j=0; j<k; j++)
        {
            scanf ("%d",&saddle[i][j]);
        }
        minrow[i] = INT_MAX;
        maxrow[i] = INT_MIN;
        mincol[i] = INT_MAX;
        maxcol[i] = INT_MIN;
    }

    for (int i=0; i<n; i++)
    {
        for (int j=0; j<k; j++)
        {
            if (saddle[i][j] < minrow[j])
            {
                minrow[j] = saddle[i][j];
            }
            if (saddle[i][j] > maxrow[j])
            {
                maxrow[j] = saddle[i][j];
            }
            if (saddle[i][j] < mincol[j])
            {
                mincol[j] = saddle[i][j];
            }
            if (saddle[i][j] > maxcol[j])
            {
                maxcol[j] = saddle[i][j];
            }
        }
    }

    for (int i=0; i<n; i++)
    {
        printf ("minr %d\n",minrow[i]);
        printf ("maxr %d\n",maxrow[i]);
        printf ("minc %d\n",mincol[i]);
        printf ("maxc %d\n",maxcol[i]);
    }
}