package com.company;

public class primetill20 {
    public static boolean isPrime(int number){
        int count =0;
        for (int i =1;i<=number;i++){
            if (number%i==0){
                count=count+1;
            }
        }
        if (count==2){
            return true;
        }
        else {
//            System.out.println(count);
            return false;
        }
    }

    public static void main(String[] args) {

        for(int i=1;i<=20;i++)
        {
            if (isPrime(i)){
                System.out.println("Given number is "+i+" prime");
            }
        }
    }
}
