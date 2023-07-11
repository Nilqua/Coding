#include <stdio.h>
void main(){
    int price,hour,total;
    price = 15;
    printf ("Enter your hours : ");
    scanf ("%d",&hour);
    total = price*hour;
    printf ("Total : %d",total);
}