#include <stdio.h>
void main () {
    int x,y;
    int sumx=0,sumy=0,sumxy=0;
    printf ("Enter fisrt and second number (fist second) : ");
    scanf ("%d %d",&x,&y);
    while (1){
        int num;
        printf ("Enter number : ");
        scanf ("%d",&num);
        if (num <=0) {
            break;
        }
        if (num%x==0 && num%y!=0){
            sumx += num;
        }
        if (num%x!=0 && num%y==0){
            sumy += num;
        }
        if (num%x==0 || num%y==0){
            sumxy += num;
        }
    }
    printf ("%d\n%d\n%d",sumx,sumy,sumxy);
}