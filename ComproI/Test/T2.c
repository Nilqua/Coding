#include <stdio.h>

void main() {
    int n;
    scanf("%d",&n);

    char name[n][6];
    int point[n];
    int sum = 0;
    for (int i=0; i<n; i++){
        scanf("%s",name[i]);
        scanf ("%d",&point[i]);
        sum += point[i];
    }

    double mean = sum/(double)n;

    int total=0;
    for (int i=0; i<n; i++){
        if (point[i] >= mean){
            total++;
        }
    }
    printf("%d\n",total);
    for (int i=0; i<n; i++){
        if (point[i] >= mean){
            printf("%s\n",name[i]);
        }
    }
}