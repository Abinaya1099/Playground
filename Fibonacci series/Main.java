#include <stdio.h>
 int main()
{
  int n, x = 0, y = 1,z, c;
  scanf("%d", &n);
  for (c = 0; c < n; c++)
  {
    if (c<= 1)
    z = c;
    else
    {
      z= x+y;
      x = y;
      y= z;
    }
    printf("%d ",z);
  }
 
  return 0;
}