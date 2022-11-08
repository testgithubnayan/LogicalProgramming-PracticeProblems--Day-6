package com.bridgelabz.junit_programs;

import java.util.Scanner;

public class MonthlyPayment {

    static double p,y,r;

       static void calculateMonthlyPayment(){
        double n = 12 * y;
        double r1 = r / (12 * 100);
        double payment = p * r / (1 - (Math.pow((1 + r1),(-n))));
        System.out.println("monthly Payment = "+payment);
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter loan amount : ");
        p = sc.nextInt();
        System.out.print("years to pay : " );
        y = sc.nextInt();
        System.out.print("percent interest : ");
        r = sc.nextInt();
        calculateMonthlyPayment();
    }
}
