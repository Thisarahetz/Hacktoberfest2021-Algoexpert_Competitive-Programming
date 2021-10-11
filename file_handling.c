#include<stdio.h>
int main(void)
{
	int num,num2;
	

	printf("Input number : ");
	scanf("%d", &num);
		
	while (num != -99)
		{
		    FILE *aPtr;
        	aPtr = fopen("number.dat", "a+");
	    
	    while (!feof(aPtr))
	    {
	        fscanf(aPtr," %d",&num2);
	        if (num==num2)
	        {
	            printf("This number is inside the file \n");
	            
	            break;
	        }
	    }
	    
      
	    fprintf(aPtr," %d", num);
	    fclose(aPtr);
	   
		    
		    
		    
		
		
		
		
		printf("Input number : ");
		scanf("%d", &num);	
		
		}
	
	return 0;
}
	
