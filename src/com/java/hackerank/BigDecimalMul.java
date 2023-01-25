package com.java.hackerank;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalMul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigDecimal bd1 = sc.nextBigDecimal();
                
        BigDecimal bd2 = sc.nextBigDecimal();
        
        
        System.out.println(bd1.add(bd2));
        System.out.println(bd1.multiply(bd2));
        sc.close();
    }
}
