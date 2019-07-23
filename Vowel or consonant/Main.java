#include <stdio.h>
int main()
{
    char c;
    int x,y;
    scanf("%c",&c);
    x= (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    y= (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U');
    if (x || y)
        printf("Vowel");
    else
        printf("Consonant");
    return 0;
}


