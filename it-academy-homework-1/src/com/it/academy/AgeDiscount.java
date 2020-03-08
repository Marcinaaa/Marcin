package com.it.academy;

import java.util.Scanner;

public class AgeDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short wiek;
        System.out.println("how old is he?");
        wiek = scanner.nextShort();
        System.out.println("Is he regular? (y/n)");
        String klient = scanner.next();
        if(wiek > 65){
            System.out.println("10% for age");
        }
        else if(wiek < 18){
            System.out.println("25% for age");
        }
        if(klient.equals("y")){
            System.out.println("5% for regular");
        }
    }
}
