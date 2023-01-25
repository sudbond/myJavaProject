package com.java.arrays;

import java.util.Scanner;

public class MultiplicationOfMatrix {
    static int max = 100;

    // METHOD TO PRINT MATRIX ENTERED BY USER
    public static void printMatrix(int mat[][], int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // METHOD TO MULTIPLY TWO MATRIX
    public static void mulMatrix(int m1[][], int m2[][],
                                    int col1, int col2, int row1, int row2) {
     //checking if multiplication is possible or not;
        if (row1 != col2) {
            System.out.println("Multiplication not possible");
            return;
        }
        //to store the multiplication, create a result matrix
        int result[][] = new int[max][max];
        //multiplication logic
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col1; j++) {
                result[i][j] = 0;
                for (int k = 0; k < row2; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        // Printing Resultant matrix
        printMatrix(result, row1, col2);
    }
    //Driver Code
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for first matrix");
        int m = sc.nextInt();
        System.out.println("Enter the no of columns for second matrix");
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        System.out.println("Enter the number of rows for Second matrix");
        int p = sc.nextInt();
        System.out.println("Enter the no of columns for second matrix");
        int q = sc.nextInt();
        int arr2[][] = new int[p][q];

        // enter element of first array
        System.out.println("Enter element of first array");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        // enter element of second array
        System.out.println("Enter element of Second array");
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("First Array :");
        printMatrix(arr1, m, n);
        System.out.println("Second Array is :");
        printMatrix(arr2, p, q);
        System.out.println("Resultant Matix is");
        mulMatrix(arr1, arr2, p, q, m, n);

        sc.close();

    }
}
