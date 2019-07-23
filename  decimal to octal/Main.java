#include <stdio.h>
int main()
     {
     int n, i, j, ocno=0,dn;
     scanf("%d",&n);
     dn=n;
     i=1;
     for(j=n;j>0;j=j/8)
       {
        ocno=ocno+(j % 8)*i;
        i=i*10;
        n=n/8;
       }
     
     printf("%d",ocno);
}
