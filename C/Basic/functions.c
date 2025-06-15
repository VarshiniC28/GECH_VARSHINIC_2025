#include <stdio.h>

/* 
    Functions in C:
    ==============

    1. Function prototype/declaration:
    ======================
    --> It is used by the compiler to know that there is a function somewhere else in the code.
    Syntax:
    return_type function_name(parameters);
    Example:
    int add(int a, int b);

    2. Function definition:
    ========================
    --> Syntax:
    return_type function_name(parameters){
        //code
    }

    Example:
    void add(int a, int b){
        printf("The sum is %d", a + b);
    }

    3. Function call:
    =================
    Syntax:
    function_name(arguments);
    Example:
    add(2, 3);
*/

// 4. With arguments and with return value
int add(int num1, int num2);  

// 1.No arguments and no return
void Hi();

// 2. With arguments and no return
void sub(int num1, int num2);

// 3. No arguments but with return value
float divide();   


int main() {
    int a, b;

    // 1. No arguments and no return
    Hi();

    printf("\nEnter 2 numbers: ");
    scanf("%d %d", &a, &b);

    // 2. With arguments and no return
    sub(a, b);

    // 3. No arguments but with return value
    float div = divide();
    printf("Division: 100 / 5 = %.2f \n", div);

    // 4. With arguments and with return value
    int sum = add(a, b);
    printf("Addition %d + %d = %d\n", a, b, sum);

    return 0;
}

// 4. With arguments and with return value
int add(int num1, int num2) {
    return num1 + num2;
}

// 1. No arguments and no return
void Hi(){
    printf("Hello.\n");
}

// 2. With arguments and no return
void sub(int num1, int num2){
    printf("Subtraction: %d - %d = %d\n", num1, num2, num1 - num2);
}

// 3. No arguments but with return value
float divide(){
    int num1 = 100;
    int num2 = 5;
    return num1 / num2;
}
