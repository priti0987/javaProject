package com.company;

public class test3sept {
    public static void main(String[] args) {
        String s = "Welcome234To567Java89Programming0@#!!";
        StringBuffer aString = new StringBuffer(),num = new StringBuffer(),spec =new StringBuffer();
        for (int i =0;i<s.length();i++){
            if (Character.isAlphabetic(s.charAt(i))){
                aString.append(s.charAt(i));

            }
            else if (Character.isDigit(s.charAt(i))){
                num.append(s.charAt(i));
            }
            else{
                spec.append(s.charAt(i));
            }
        }
        System.out.println(aString);
        System.out.println(num);
        System.out.println(spec);
    }
}
