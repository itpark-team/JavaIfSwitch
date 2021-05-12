package com.company;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dayOfWeek;

        System.out.print("input dayOfWeek: ");
        dayOfWeek = input.nextInt();

        switch (dayOfWeek)
        {
            case 1:
            case 2:
            case 3:
                System.out.println("sr");
                break;
            case 4:
                System.out.println("cht");
                break;
            case 5:
                System.out.println("pt");
                break;
            case 6:
                System.out.println("sb");
                break;
            case 7:
                System.out.println("vsk");
                break;
            default:
                System.out.println("takogo dnya net");
                break;
        }
    }
}
