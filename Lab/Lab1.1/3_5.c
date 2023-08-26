#include <stdio.h>
void main (){
    int user_input;
    scanf ("%d",&user_input);
    if (user_input%15==0)
    {
        printf ("3 5");
    }
    else if (user_input%3==0)
    {
        printf ("3");
    }
    else if (user_input%5==0)
    {
        printf ("5");
    }
}
