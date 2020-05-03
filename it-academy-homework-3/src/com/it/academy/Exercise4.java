package com.it.academy;

public class Exercise4 {

    public static void main(String[] args) {
        int[] array1 = {64, 4, 3, 93, 11, 2, 0, 9,93,93};
        int[] array2 = {44, 5, 93, 99, 4, 6, 2, 1, 93,93};// scanner
        int length1 = 10;
        int length2 = 10;
        int k=1;
        for (int i = 0; ; i++) {
            for (int j = i + 1; j<length1; j++) {

                if (array1[i] == array1[j]) {
                    array1[j] = array1[length1-1];
                    length1--;
                    System.out.println(array1[i]+"="+array1[j]);

                    }
                    if (length1 <= j) {
                    break;
                    }

                }
            if (length1 <= i) {
                break;
            }
            System.out.println(length1);
            k=length1;
        }
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < length2; j++) {

                if (array2[j] == array1[i]) {
                    System.out.println(length2+" das "+j);
                    System.out.println(array1[i]);
                break;
                }

            }
        }
        System.out.println("n - quantity of numbers");
        System.out.println("Complexity: 3+(0,5*2)n*(0.5*3)n=O(n^2) ");
    }
}
