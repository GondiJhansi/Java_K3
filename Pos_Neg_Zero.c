#include<stdio.h>
int main()
{
	int num;
	printf("Enter Number:");
	scanf("%d",&num);
	if(num>0)
		printf("%d is Positive",num);
	else if(num<0)
		printf("%d is Negative",num);
	else if(num==0)
		printf("%d is Zero",num);
	else
		printf("Not a Number");
	return 0;
	
	
	
}