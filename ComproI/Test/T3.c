#include <stdio.h>

void main() {
    int num[501];
    
    int index=0;
    do
    {
        int input;
        scanf("%d",&input);
        num[index] = input;
        index++;
    } while (num[index-1] > -1 && num[index-1] < 10);
    
    for (int i=0; i<index-1; i++){
        
        for (int k=(index-2); k>i; k--){
            printf(" ");
        }

        for (int j=0; j<=i; j++){
            printf("%d",num[i]);
        }
        printf("\n");
    }
}