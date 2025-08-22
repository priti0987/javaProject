package com.company;

import java.util.Scanner;

public class revNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();

        int rev = 0;
        while (number!=0){
            rev=rev*10+number%10;   //0+1234%10 =4
            number = number/10;

        }
        System.out.println(rev);
    }}
