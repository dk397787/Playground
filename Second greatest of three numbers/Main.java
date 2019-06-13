#include<stdio.h>

int main()
{
    int a, b, c;
      scanf("%d%d%d", &a, &b, &c); 

    // a is the largest
    if(a >= b && a >= c)
    {
        if(b >= c)
        {
            printf("second greatest = %d", b);
        }
        else
        {
            printf("second greatest = %d", c);
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            printf("second greatest = %d",a);
        }
        else
        {
            printf("second greatest = %d",c);
        }
    }

    
    else if(a >= b)
    {
        printf("second greatest = %d", a);
    }
    else
    {
        printf("second greatest = %d", b);
    }

    return 0;
}
