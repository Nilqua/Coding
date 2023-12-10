#include <stdio.h>
int getsathu(int x)
{
    int result=0;
    for (;;)
    {
        if (x == 0)
        {
            break;
        }
        result += x%10;
        x = x/10;
    }
    return result;
}
void main ()
{
    int x;
    int sathu;
    scanf ("%d",&x);

    sathu = getsathu(x);
    printf ("%d\n",sathu);
    if (sathu > 9)
    {
        sathu = getsathu(sathu);
        printf ("%d\n",sathu);
    }
    
    if (sathu == 9)
    {
        printf ("SATHU");
    }
    else
    {
        printf ("No SATHU");
    }
}