#include <stdio.h>

void main() {
    int n;
    double mean = 0;
    scanf("%d",&n);
    int sum=0;
    for(int i=0; i<n; i++){
        int input;
        scanf("%d",&input);
        sum+=input;
    }
    mean = sum/(double)n;
    printf("%lf",mean);
}