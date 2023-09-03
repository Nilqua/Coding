#include <stdio.h>
void main ()
{
    int water,sugar;
    int water_bottle,sugar_bottle;
    int used_water;

    for (int i=0; i<7; i++)
    {
        scanf ("%d%d",&water,&sugar);
        water_bottle = water/250;
        sugar_bottle = sugar/15;

        if (water_bottle>=sugar_bottle)
        {
            printf ("%d",sugar_bottle);
            used_water = sugar_bottle*250;
            if (used_water<water)
            {
                printf (" water");
            }
        }
        else
        {
            printf ("%d",water_bottle);
            used_water = water_bottle*250;
            if (used_water<water)
            {
                printf (" water");
            }            
        }
        printf ("\n");
    }
}
