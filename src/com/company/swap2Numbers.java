package com.company;

import java.util.Scanner;

public class swap2Numbers {
    public static void main(String[] args) {
        System.out.println("****** swap 2 Numbers with temp var  ******");
        int a =10;
        int b =22;
        int temp;

        System.out.println("Before swapping a "+a);
        System.out.println("Before swapping b "+b);

        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping a "+a);
        System.out.println("After swapping b "+b);
        a =10;
        b =22;

        System.out.println("****** swap 2 Numbers with adding method  ******");
        System.out.println("Before swapping a "+a);
        System.out.println("Before swapping b "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a "+a);
        System.out.println("After swapping b "+b);
        a =10;
        b =22;

        System.out.println("****** swap 2 Numbers with multiplication  method  ******");
        System.out.println("Before swapping a "+a);
        System.out.println("Before swapping b "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("After swapping a "+a);
        System.out.println("After swapping b "+b);


        //single expression :
        a =10;
        b =22;
        System.out.println("Before swapping a "+a);
        System.out.println("Before swapping b "+b);

        b=a+b-(a=b);
        System.out.println("After swapping a "+a);
        System.out.println("After swapping b "+b);






    }

}
