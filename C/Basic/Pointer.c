#include<stdio.h>

/*
POINTER : Its a variable that stores adress of another variable.

Declaration of pointer:
=======================
datatype *pointer_name;
int *ptr;

Initialization
===============
pointer_name = &variable_name;
ptr = &a;

& --> Address operator
* --> Dereference operator / Value operator
*/

int main(){

    //Variable
    int a = 20;

    //Pointer
    int *ptr;
    ptr = &a;

    printf("The value of a : %d \n",a);
    printf("The address of a : %p \n",&a); //%p is the format specifier to print the address of a i.e pointer.and &a to print the address

    printf("The value of p : %p \n",ptr); //value of a is the address of a - &a
    printf("The address of p : %p \n",&ptr); //This is address of ptr which is different from address of a , since ptr is also a variable

    printf("The value of var a using pointer: %d \n", *ptr); //20 // This is we print the value of a using the pointer by *ptr(which means print the value of the adress of a)
    printf("The value of var a using pointer: %d \n", *(&a)); //20 This is another way to print value of a using its address
    printf("The value of var a using pointer: %d \n", *(*(&ptr))); //20 This is another way to print value of a using its address

    *ptr = 50;
    printf("The value of var a using pointer: %d \n", *ptr); //50 // This is we print the value of a using the pointer by *ptr(which means print the value of the adress of a)

    /* Swapping of values of variables.
    int a =10;
    int b = 20;
    int temp;

    temp = a;
    a=b;
    b=temp;
    */

    // Swapping using pointer - without a separate function
    int x = 10;
    int y = 20;

    printf("Before swapping: x = %d, y = %d\n", x, y);

    int *px = &x;
    int *py = &y;

    int temp;
    temp = *px;
    *px = *py;
    *py = temp;

    printf("After swapping: x = %d, y = %d\n", x, y);
}

