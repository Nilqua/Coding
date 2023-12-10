#include<stdio.h>
void main(){
    int n;
    scanf("%d",&n);
    char x[n];
    printf("A ");
    for(int i=1;i<=n;i++){
        x[i] = '0';
        printf ("%c ",x[i]);
    }
    printf("\n");

    for (;;)
    {
        printf ("X ");
    }
}