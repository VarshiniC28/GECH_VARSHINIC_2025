#include<stdio.h>

/*
Array:
=====
-> Array is a collection of elements of same data type.
Syntax:
    data_type array_name[size];
Example:
    int arr[10];

Accessing:
==========
    arr[index];
    Example: arr[0];
*/

int main() {
//     int size;

//     printf("Enter the size of the array: ");
//     scanf("%d", &size);

//     int arr[size];

//     printf("Enter %d array elements:\n", size);
//     for(int i = 0; i < size; i++) {
//         printf("Index %d: ", i);
//         scanf("%d", &arr[i]);
//     }

//     printf("\nThe array elements are:\n");
//     for(int i = 0; i < size; i++) {
//         printf("arr[%d] = %d\n", i, arr[i]);
//     }


//     // Find max number in the array.
//     int max = arr[0];  
//     for(int i = 1; i < size; i++) {
//         if(arr[i] > max) {
//             max = arr[i];
//         }
//     }
//     printf("\n Max element in the array is: %d\n", max);

// int evensum = 0;  
// int oddsum = 0;   

// for(int i = 0; i < size; i++) {
//     if(arr[i] % 2 == 0) {
//         evensum += arr[i];
//     } else {
//         oddsum += arr[i];
//     }
// }

// printf("\n Sum of even numbers in the array is: %d", evensum);
// printf("\n Sum of odd numbers in the array is: %d \n", oddsum);


// 2D Array
    int rows, cols;

    printf("Enter the number of rows:");
    scanf("%d", &rows);
    printf("Enter the number of columns: ");
    scanf("%d", &cols);

    int arr[rows][cols];

    printf("Enter %d elements of the array:\n", rows * cols);
    for(int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
            printf("arr[%d][%d]: ", i, j);
            scanf("%d", &arr[i][j]);
        }
    }

    printf("\n 2D array is:\n");
    for(int i = 0; i < rows; i++) {
        for(int j = 0; j < cols; j++) {
            printf("%d ", arr[i][j]);
        }
        printf("\n");
    }

    return 0;
}
