package com.it.academy;

public class UniqueTriplets {


    public static void main(String[] args) {
        int[] array = {3, -2, -1, 7, 2, 3, 1, 22, -6};
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = j; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 4) {
                        int[] order = {array[i], array[j], array[k]};

                        for (byte a = 0; a < 3; a++) {
                            for (int b = a+1; b < 3; b++) {
                                if (order[b] < order[a]) {
                                    temp = order[a];
                                    order[a] = order[b];
                                    order[b] = temp;
                                }
                            }
                        }

                        System.out.println(order[0] + " " + order[1] + " " + order[2]);


                    }

                }

            }
        }
    }
}







