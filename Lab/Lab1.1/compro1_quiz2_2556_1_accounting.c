#include <stdio.h>
void main ()
{
    int total,income,outcome;
    int i,money;
    for (total=0,income=0,outcome=0,i=1,money=0; i!=0;)
    {
        scanf ("%d",&i);
        if (i==0)
        {
            break;
        }
        else if (i==1)
        {
            scanf ("%d",&money);
            income += money;
        }
        else if (i==2)
        {
            scanf ("%d",&money);
            outcome += money;
        }
    }
    total = income-outcome;
    printf ("%d %d %d",income,outcome,total);
}