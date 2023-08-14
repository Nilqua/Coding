#include <stdio.h>
void main (){
    int x,y,z;
    scanf ("%d%d%d",&x,&y,&z);
    if (z==1)
    {
        printf ("%d",x+y);
    }
    else if (z==2)
    {
        printf ("%d",x-y);
    }
    else if (z==3)
    {
        printf ("%d",x*y);
    }
    else if (z==4 && y!=0)
    {
        printf ("%d",x/y);
    }
    else if (z==5 && y!=0)
    {
       printf ("%d",x%y);
    }
    else if ((z==4 && y==0)||(z==5 && y==0))
    {
        printf ("cannot divide by zero");
    }
}
