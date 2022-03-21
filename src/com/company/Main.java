package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        double total ;
        System.out.println("lãi suất hàng năm = ");
        double yaerProfits = scanner.nextDouble();
        System.out.println("số tiền vay = ");
        int money = scanner.nextInt();
        System.out.println("số tháng muốn vay");
        byte mouth = scanner.nextByte();
        total = money * yaerProfits / 12 * mouth;
        System.out.println("Total = " + total);
    }
}
