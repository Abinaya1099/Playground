#include <stdio.h>

int main()
{
   int num1, num2, maxValue;

   
   scanf("%d %d", &num1, &num2);
   
   maxValue = (num1 > num2) ? num1 : num2;

   while(1)  
   {
      if ((maxValue % num1 == 0) && (maxValue % num2 == 0))
      {
         printf("%d", maxValue);
         break;
      }
      ++maxValue;
   }
   return 0;
}