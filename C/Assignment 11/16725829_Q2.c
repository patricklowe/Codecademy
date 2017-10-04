#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int quadroots(double a, double b, double c, double *r1, double *r2, int *correct);
 
int main(void)
{
double a, b, c, r1, r2;
int i, correct = 0; 
printf("\nEnter a quadratic in the form: ax^2 + bx + c  = 0\n\ta: ");
scanf("%lf", &a);
printf("\tb: ");
scanf("%lf", &b);
printf("\tc: ");
scanf("%lf", &c);
i = quadroots(a, b, c, &r1, &r2, &correct);
if (i == 0)
    {
    if (correct == 0)
        {
        printf("\tThe first root is: %lf\n\tThe second root is: %lf\n", r1, r2);
        }
    }
else
    {
    printf("This quadratic has 2 complex roots\n");
    }
return 0;
}
 
int quadroots(double a, double b, double c, double *r1, double *r2, int *correct)
{
if (a == 0)
    {
    printf("This is not a second degree polynomial in the correct format\n");
    *correct = 1;
    }
else
    {
    if (b*b -4*a*c < 0)
        {
        return 1;
        }
    else
        {
            *r1 = (-2*c)/(b + sqrt(b*b - 4*a*c));
            *r2 = (-b-sqrt(b*b - 4*a*c))/(2*a);
            return 0;
        }
    }
}
