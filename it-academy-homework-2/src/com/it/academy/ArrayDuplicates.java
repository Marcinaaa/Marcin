package com.it.academy;

public class ArrayDuplicates {

    public static void main(String[] args) {

        int[] array = {4,11,3,11,24,22,11,33,33};
        boolean[] rep = new boolean[array.length];
        for (int i=0; i< array.length ;i++){
            if (rep[i]!=true) {
                for (int j = i + 1; j < array.length; j++) {

                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        rep[j] = true;
                        break;
                    }

                }
            }
        }
    }
}
