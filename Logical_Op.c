#include<stdio.h>
int main()
{
	int a=3,b=2,c=5;
	printf("%d && %d is %d\n",(a>b),(a<c),(a>b)&&(a<c));
	printf("%d || %d is %d\n",(a<b),(b>c),(a<b)||(b>c));
	printf("%d && %d is %d\n",(a>b),(a>c),(a>b)&&(a>c));
	printf("%d || %d is %d\n",(a<b),(b<c),(a<b)||(b<c));
	printf("%d != %d is %d\n",a,a,a!=a);
	return 0;
	
}