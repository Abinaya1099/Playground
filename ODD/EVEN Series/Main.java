#include <stdio.h>
int main(void) {
 int n;
 scanf("%d", &n);
 if (n % 2 == 0) 
 { 
    n = n / 2; 
    n = 2 * (n - 1); 
    printf("%d",n/2); 
 } 
 else 
 { 
     n = (n / 2) + 1; 
     n = 2 * (n - 1); 
     printf("%d",n); 
 } 
    return 0; 
}
