#include <stdio.h>
void main ()
{
    int L=1,L_N;
    int L_current;
    int L_E=0;
    int n;

    int J=1,J_N;
    int J_current;
    int J_E=0;

    scanf ("%d%d",&L_N,&J_N);
    scanf ("%d",&n);

    for (int i=0; i<n; i++)
    {  
        scanf ("%d",&L_current);
        if (L_current == -1)
        {
            printf ("Get some rest!");
            break;
        }
        else 
        {
            scanf ("%d",&J_current);
            J_E += J_current;
            L_E += L_current;
            if (L_E>=L_N)
            {
                printf ("Congratulation LVL Up!!\n");
                L_E = L_E-L_N;
                L++;
                // L_N = L_N+((L_N*20)/100);
                L_N = L_N*1.2;
            }
            if (J_E>=J_N)
            {
                printf ("Congratulation JOB Up!!\n");
                J_E = J_E-J_N;
                J++;
                // J_N = J_N+((J_N*10)/100);
                J_N = J_N*1.1;
            }


            printf ("Level:%d Exp:%d nextExp%d\n",L,L_E,L_N);
            printf ("Job:%d JobExp:%d nextJobExp:%d\n",J,J_E,J_N);
        }
    }
}