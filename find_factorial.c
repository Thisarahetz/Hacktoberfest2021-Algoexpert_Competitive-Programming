#include <stdio.h>

int main()
{
  int x, n, fa = 1;

  printf("Enter a number to calculate its factorial\n");
  scanf("%d", &n);
  for (x = 1; x <= n; x++)
    {
    fa = fa * x;
    }
  printf("Factorial of %d = %d\n", n, fa);
  return 0;

}
