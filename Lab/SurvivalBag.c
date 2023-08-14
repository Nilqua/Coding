#include <stdio.h>
void main () {
    int water,bread,egg;
    int total_water,total_bread,total_egg;
    int min=0;
    scanf ("%d%d%d",&water,&bread,&egg);
    total_water = water/3;
    total_bread = bread/4;
    total_egg = egg/2;
    if (total_water<total_bread && total_water<total_egg)
    {
        min = total_water;
    }
    else if (total_bread < total_egg)
    {
        min = total_bread;
    }
    else
    {
        min = total_egg;
    }
    printf ("%d %d %d %d",min,water-(min*3),bread-(min*4),egg-(min*2));
}