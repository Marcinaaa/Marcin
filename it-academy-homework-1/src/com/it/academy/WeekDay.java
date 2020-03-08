package com.it.academy;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        byte day = scanner.nextByte();
        if (day==1){
            System.out.println("Monday");
        }
        if (day==2){
            System.out.println("Tuesday");
        }
        if (day==3){
            System.out.println("Wednesday");
        }
        if (day==4){
            System.out.println("Thurstday");
        }
        if (day==5){
            System.out.println("Friday");
        }
        if (day==6){
            System.out.println("Saturday");
        }
        if (day==7){
            System.out.println("Sunday");
        }
    }
}
