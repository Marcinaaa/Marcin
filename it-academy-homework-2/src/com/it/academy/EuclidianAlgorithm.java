package com.it.academy;

public class EuclidianAlgorithm {
    public static void main(String[] args) {
        int a=12;
        int b=99;
        int temp;
        for(;a!=b;){
            if(a>b)
            {
                temp=a;
                a=b;
                b=temp;
            }
            b=b-a;
        }
        System.out.println(a);

    }


}
