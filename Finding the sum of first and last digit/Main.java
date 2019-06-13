#include <stdio.h>
#include <stdlib.h>
#include <math.h>
 
int main(void) {
 
    int num, sum=0, firstDigit, lastDigit;

    scanf("%d", &num);
 
    lastDigit = num % 10;
 
    firstDigit = num;
 
    while(num >= 10)
    {
        num = num / 10;
    }
    firstDigit = num;
 
     //Finding sum of first and last digit
    sum = firstDigit + lastDigit;
 
    printf("%d\n", sum);
    return 0;
}
 