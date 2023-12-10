#include <stdio.h>
void main ()
{
    int n,k;
    scanf ("%d%d",&n,&k);
    char park[n][k];

    for (int i=0; i<n; i++)
    {
        for (int j=0; j<k; j++)
        {
            park[i][j] = '_';
        }
    }

    int tmp;
    scanf ("%d",&tmp);
    for (int i=0; i<tmp; i++)
    {
        int x,y;
        scanf ("%d%d",&x,&y);
        park[x-1][y-1] = 'X';
    }

    for (int i=0; i<n; i++)
    {
        for (int j=0; j<k; j++)
        {
            printf ("%c",park[i][j]);
        }
        printf ("\n");
    }
}