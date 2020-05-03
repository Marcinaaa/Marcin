package com.it.academy;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        int temp;


        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int array[] = new int[length];
        for (int i=0; i<length; i++){
            array[i]=scanner.nextInt();
        }


        for(int i=0; i<array.length-1;i++){

            for(int j=i+1; j<array.length;j++){
                if(array[j]<array[i]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;


                }


            }
        }
        System.out.println(Arrays.toString(array));

    }


}

