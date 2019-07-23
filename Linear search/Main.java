#include<stdio.h>
 int main() {
   int a[30], ele, num, i;
   scanf("%d", &num);
   for (i = 0; i < num; i++)
   {
      scanf("%d", &a[i]);
   }
   scanf("%d", &ele);
   i = 0;
   while (i < num && ele != a[i])
   {
      i++;
   }
   if (i < num) 
   {
      printf("%d", i + 1);
   } else
   {
      printf("%d isn't present in the array. ",ele);
   }
 
   return 0;
}

 