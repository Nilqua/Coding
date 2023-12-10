#include <stdio.h>
void main ()
{
    int odd,even;
    int i=0;
    int u_input;

    for (i=0; i<8; i++)
    {
        scanf ("%d",&u_input);
        if ((u_input%2)==0)
        {
            even += u_input;
        }
        else if (u_input==0) {}
        else
        {
            odd += u_input;
        }
    }
    if (odd==even)
    {
        printf ("equal");
    }
    else if (odd>even)
    {
        printf ("odd");
    }
    else
    {
        printf ("even");
    }
    printf ("\n%d\n%d",even,odd);
}