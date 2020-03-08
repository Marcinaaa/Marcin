package com.it.academy;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class RowsSum {
    public static void main(String[] args) {


            int[][] matrix= {{6,9,4,1},{6,90,10,1},{4,54,19,1},{1,2,3,1}};
            for(int i=0;i<matrix[0].length ;i++){
                for(int j=1;j<matrix.length;j++){

                    matrix[0][i]+=matrix[j][i];
                }
                System.out.println(matrix[0][i]);

            }
    }

}

