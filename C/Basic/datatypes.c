#include <stdio.h>

int main() {
    // single line comment
    /*
    multiline comment
    */

    /* Datatypes in C
    ==================
    1. int --> %d or %i
    2. char --> %c
    3. float --> %f
    4. double --> %lf

    Derived datatypes:
    =================
    1. Array
    2. string (char array)
    
    User defined datatypes:
    ======================
    1. structure
    2. union
    */

    int a;
    int age;
    char gender;
    float marks;
    double percentage;
    printf("Enter the integer: \n");
    scanf("%d", &a);
    printf("Integer (d): %d \n\n", a);

    printf("Enter the age: \n");
    scanf("%i", &age);
    printf("Integer (i): %d \n\n", age);

    getchar();
    
    printf("Enter the gender: \n");
    scanf(" %c", &gender);  
    printf("Character: %c\n\n", gender);

    printf("Enter the marks: \n");
    scanf("%f", &marks\n);
    printf("Float: %f \n\n", marks);

    printf("Enter the percentage: \n");
    scanf("%lf", &percentage);
    printf("Double: %lf \n\n", percentage);

    return 0;
}
