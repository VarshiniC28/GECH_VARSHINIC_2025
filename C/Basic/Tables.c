#include <stdio.h>

int main(){

    int num;
    printf("Enter a number to get its Multiplication table: ");
    scanf("%d",&num);

    int i;
    for( i=1; i<=10; i++){
        printf("%d x %d = %d\n",num,i,num*i);
    }
}