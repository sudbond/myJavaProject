package com.java.arrays;

import java.util.Scanner;

public class ArrayTranspose{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of Rows");
        int n = sc.nextInt();
        System.out.println("Enter no. of Columns");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        System.out.println("Enter the matrix");
            for(int i=0; i<n; i++){
                for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
                 }
            }
                System.out.println("The Entered Array is : ");
                for(int i=0; i<n; i++){
                    for(int j=0; j<n;j++){
                    System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }

                System.out.println("Transpose of Array is : ");
                for(int j=0; j<m; j++){
                    for(int i=0; i<n;i++){
                    System.out.print(matrix[i][j]+" ");
                    }
                    System.out.println();
                }
                sc.close();

        }

    }