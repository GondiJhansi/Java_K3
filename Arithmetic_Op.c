#include<stdio.h>
int main()
{
	int a = 8,b = 7,c;
	c = a + b;
	printf("Addition = %d\n",c);
	c = a - b;
	printf("Subtraction = %d\n",c);
	c = a * b;
	printf("Multiplication = %d\n",c);
	c = a / b;
	printf("Division = %d\n",c);
	c = a % b;
	printf("Modulo division = %d\n",c);
	c = a < b;
	printf("%d\n",c);
	return 0;	
}