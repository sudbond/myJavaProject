package com.java.arrays;

import java.util.Scanner;

public class InversionOfMatrix{
	    public static void main(String args[]){

	        System.out.println("Enter no of rows");
	        Scanner sc = new Scanner(System.in);
	        int rows = sc.nextInt();
	        System.out.println("Enter no of columns");
	        int cols = sc.nextInt();
	        int mat[][] = new int[rows][cols];

	        //to input the matrix;
	        System.out.println("Enter element of matrix");
	        for(int i=0; i<rows;i++){
	            for(int j=0;j<rows;j++){
	                mat[i][j] = sc.nextInt();
	            }
	        }
	        //to print matrix
	        System.out.println("Original matrix is :");
	        for(int i=0; i<rows;i++){
	            for(int j=0;j<rows;j++){
	                System.out.print(mat[i][j]+" ");
	            }
	            System.out.println();
	        }

	        //to print transpose or inversion
	        System.out.println("Transposed Matrix is ");
	        for(int i=0; i<rows;i++){
	            for(int j=0;j<rows;j++){
	                System.out.print(mat[j][i]+" ");
	            }
	            System.out.println();
	        }
	        sc.close();
	    }
	}
