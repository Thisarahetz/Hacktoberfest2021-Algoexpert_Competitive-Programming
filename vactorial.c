#include<stdio.h>
int main(void)
{
	int n;
	int count=1;
	printf("Enter number");
	scanf("d",&n);
	if (n<0)
	{
		printf("error");
	}
	else
	{
		while (1<=n)
		{
			n=n*count;
			count--;
		}
	}	
	printf("%d",n);
	return 0;

}
