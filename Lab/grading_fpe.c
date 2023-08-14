#include <stdio.h>
void main (){
    int grade_score;
    scanf ("%d",&grade_score);
    if (grade_score<40)
    {
        printf ("Fail");
    }
    else if (grade_score<80)
    {
        printf ("Pass");
    }
    else
    {
        printf ("Excellent");
    }
}
