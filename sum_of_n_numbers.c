#include <stdio.h>
int main() {
    int x, i, y = 0;

    printf("Enter a positive integer: ");
    scanf("%d", &x);

    for (i = 1; i <= x; ++i) {
        y += i;
    }

    printf(" The sum of  n positive integers  = %d", y);
    return 0;
}
