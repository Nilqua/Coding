#include <stdio.h>
void main (){
    float x,y,z,result;
    scanf ("%f %f %f",&x,&y,&z);
    if (z==0)
    {
        printf ("cannot divide by zero");
    }
    else
    {
        result = (x+y)/z;
        printf ("%f",result);
    }
}
