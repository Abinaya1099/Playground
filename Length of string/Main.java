#include <stdio.h> 
int main() 
{ 
 char Str[1000]; 
 int i;
  scanf("%[^\n]", Str); 
  for (i = 0; Str[i] != '\0'; ++i); 
  printf("%d", i); 
  return 0; 
} 

