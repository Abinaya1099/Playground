#include <stdio.h>

int main()
{ 
   int a=7,b=8,c=9;
  scanf("%d, %d, %d",&a, &b, &c);
  if((a>b)&&(a>c)) 
    printf("%d", a);
 else if(b>c)
   printf("%d", b);
  else
    printf("%d", c);
  return 0;
}