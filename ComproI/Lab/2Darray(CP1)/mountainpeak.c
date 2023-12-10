#include <stdio.h>

void main ()
{
    int n;
    scanf ("%d",&n);
    int matrix[n][n];

    for (int i=0; i<n; i++)
    {
        for (int j=0; j<n; j++)
        {
            scanf ("%d",&matrix[i][j]);
        }
    }

    int count=0;
    for (int i=1; i<n-1; i++)
    {
        for (int j=1; j<n-1; j++)
        {   
            if (matrix[i][j] > matrix[i-1][j-1] && matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i-1][j+1])
            {
                if (matrix[i][j] > matrix[i][j-1] && matrix[i][j] > matrix[i][j+1])
                {
                    if (matrix[i][j] > matrix[i+1][j-1] && matrix[i][j] > matrix[i+1][j] && matrix[i][j] > matrix[i+1][j+1])
                    {
                        count++;
                    }
                }
            }
        }
    }

    printf ("%d\n",count);
    
    for (int i=1; i<n-1; i++)
    {
        for (int j=1; j<n-1; j++)
        {   
            if (matrix[i][j] > matrix[i-1][j-1] && matrix[i][j] > matrix[i-1][j] && matrix[i][j] > matrix[i-1][j+1])
            {
                if (matrix[i][j] > matrix[i][j-1] && matrix[i][j] > matrix[i][j+1])
                {
                    if (matrix[i][j] > matrix[i+1][j-1] && matrix[i][j] > matrix[i+1][j] && matrix[i][j] > matrix[i+1][j+1])
                    {
                        printf ("%d %d %d\n", matrix[i][j],i,j);
                    }
                }
            }
        }
    }
}

