#include<stdio.h>

/*
Pointers to Array:
int *ptr;
int arr[10];
ptr = arr;       // or ptr = &arr[0];
*/

int main(){
    int arr[5] = {1,2,3,4,5};
    int *ptr;
    ptr = arr;

    printf("The arr value: %p\n", arr);            // Base address of the array
    printf("The address of 0th element: %p\n", &arr[0]);
    printf("The value of ptr : %p\n", ptr);        // Same as arr

    // Printing first element in 3 different ways using arr
    printf("The value of 1st element using arr[0] : %d\n", arr[0]);
    printf("The value of 1st element using 0[arr] : %d\n", 0[arr]);
    printf("The value of 1st element using *arr   : %d\n", *arr);

    printf("The value of 3rd element using *arr   : %d\n", *(arr+2));

    // Printing first element in 3 different ways using ptr
    printf("The value of 1st element using ptr[0] : %d\n", ptr[0]);
    printf("The value of 1st element using 0[ptr] : %d\n", 0[ptr]);
    printf("The value of 1st element using *ptr   : %d\n", *ptr);

    // Pointer arithmetic
    ptr++;  // Now points to second element (arr[1])
    printf("The value using ptr++ (2nd element): %d\n", *ptr);

    ptr = ptr + 2;  // Now points to 4th element (arr[3])
    printf("The value using ptr+2 (4th element): %d\n", *ptr);

    // Modify that element
    *ptr = 100;

    // Print updated array
    printf("Updated array:\n");
    for(int i = 0; i < 5; i++){
        printf("%d ", arr[i]);
    }
    printf("\n");

ptr=arr;
int max = ptr[0];
for(int i = 1; i < 5; i++){
    if(ptr[i] > max){
        max = ptr[i];
    }
}
printf("%d is max\n", max);

return 0;
}


/* Using arr:
1st element of an array ---> arr[0]/0[arr]/*arr
3rd element of an array ---> arr[2]/2[arr]/ *(arr+2) 
*/

/* Using ptr:
1st element of an array ---> *ptr/ptr[0]/0[ptr]
4th element of an array ---> *(ptr+3)/ptr[3]/3[ptr]
*/

// COnsider address be 1000, 1004, 1008, 1012, 1016

/* Pointer Operations:
ptr++; --> ptr=ptr+1 --> 1004
ptr--; --> ptr=ptr-1; --> 1000

arr++ or arr-- is not allowed in C:
Because arr is not a variable—it is a constant pointer to the first element of the array.
You can do ptr++, but not arr++.
*/