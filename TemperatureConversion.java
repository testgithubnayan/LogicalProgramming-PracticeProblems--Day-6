package com.bridgelabz.junit_programs;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        System.out.println(temperatureConversion(37));
    }

    static double temperatureConversion(int temp){
        System.out.println("select option: 1 Celsius to Fahrenheit \n2.Fahrenheit to Celsius");
        Scanner sc = new Scanner(System.in);
        int option=sc.nextInt();
        switch (option){
            case 1:
                return (temp*9/5) + 32; //Celsius to Fahrenheit
            case 2:
                return (temp-32) * 5/9; //Fahrenheit to Celsius
            default:
                return 0;
        }
    }

}
