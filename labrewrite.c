#include <stdio.h>
void main (){
    int fish,tomato;
    int fish_can,tomato_can;
    int fish_left,tomato_left;
    int fish_used,tomato_used;
    int F_C,T_C;

    printf ("Fish : ");
    scanf ("%d",&fish);
    printf ("Tomato : ");
    scanf ("%d",&tomato);
    printf ("Fish / can : ");
    scanf ("%d",&F_C);
    printf ("tomato / can : ");
    scanf ("%d",&T_C);    

    fish_can = fish/F_C;
    tomato_can = tomato/T_C;

    printf("FishCan %d\n",fish_can);
    printf("TomatoCan %d\n",tomato_can);

    if (tomato_can != fish_can){
        if (tomato_can > fish_can){
            printf ("Can make Total : %d\n",fish_can);
            fish_used = fish_can*F_C;
            tomato_used = fish_can*T_C;
            fish_left = fish-fish_used;
            tomato_left = tomato-tomato_used;
            printf ("Left Fish : %d\n",fish_left);
            printf ("Left Tomato : %d\n",tomato_left);
        }
        else{
            printf ("Can make Total : %d\n",tomato_can);
            tomato_used = tomato_can*T_C;
            fish_used = tomato_can*F_C;
            tomato_left = tomato-tomato_used;
            fish_left = fish-fish_used;
            printf ("Left Fish : %d\n",fish_left);
            printf ("Left Tomato : %d\n",tomato_left);
        }
    }
    else {
        fish_left = fish-(fish_can*F_C  );
        tomato_left = tomato-(tomato_can*T_C);
        printf ("Can make Total : %d\n",fish_can);
        printf ("Left Fish : %d\n",fish_left);
        printf ("Left Tomato : %d\n",tomato_left);
    }
}