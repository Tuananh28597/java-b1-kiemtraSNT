package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bất kì : ");
        int number = scanner.nextInt();


        if (number < 2) {
            System.out.printf("%d Không là Số Nguyên Tố! ", number);
        } else {
            int i = 2;
            boolean check = true;
            while (i < number) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if(check)
                System.out.println(number + " Là Số Nguyên Tố");
            else
                System.out.println(number + " Không là Số Nguyên Tố");

        }

    }
}
