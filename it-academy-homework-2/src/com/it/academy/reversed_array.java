package com.it.academy;

import java.util.Scanner;

public class reversed_array {
    public static void main(String[] arg)
    {
        System.out.println("halo");
//        Scanner scanner = new Scanner(System.in);
//        int lenght = scanner.nextInt();

        int[] array = {4,2,11,5,1};
        int[] revArray = new int[array.length];
        for(int i=0; i<array.length; i++){
        revArray[i]=array[array.length-i-1];
            System.out.println(revArray[i]);
        }

    }
}
