#include <stdio.h>

int main(){
    printf("Hello World \n");
    printf("My first program \n");


    int a, b;
    printf("Enter two numbers: \n");

    //scanf(format_specifier, addressoperator followed by var_name)
    scanf("%d %d", &a, &b);
    printf("The sum is: %d", (a+b));

    return 0;
}