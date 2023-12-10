#include <stdio.h>
void main ()
{
    int L=1,L_N;
    int current;
    int L_E=0;
    scanf ("%d",&L_N);

    while (1)
    {  
        scanf ("%d",&current);
        if (current == -1)
        {break;}
        
        L_E += current;


        if (L_E>=L_N)
        {
            printf ("Congratulation LVL Up!!\n");
            L_E = L_E-L_N;
            L++;
            // L_N = L_N+((L_N*20)/100);
            L_N = L_N*1.2;
        }

        printf ("Level:%d Exp:%d nextExp:%d\n",L,L_E,L_N);
    }
}