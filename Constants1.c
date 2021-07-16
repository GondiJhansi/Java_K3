#include<stdio.h>
int main()
{
	const int a = 10;
	const float b = 3.14;
	const char ch1 = 'S';
	const char str[] = "Senior";
	printf("Constants\n");
	printf("%d\n",a);
	printf("%f\n",b);
	printf("%c\n",ch1);
	printf("%s",str);
	return 0;	
}