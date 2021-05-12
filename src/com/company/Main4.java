package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        //на вход вводиться кол-во ворон (целое)
        //ваша программа должна выбрать правильное склонение
        //1-ворона, 10000001 - ворона
        //4-вороны, 584 - вороны
        //switch
        //1 - ворона
        //2,3,4 - вороны
        //0,5,6,7,8,9 - ворон

        Scanner input = new Scanner(System.in);
        int countOfRaven;

        System.out.print("сколько на поле прилетело ворон?: ");
        countOfRaven = input.nextInt();

        int lastDigit = countOfRaven % 10;

        switch (lastDigit){
            case 1:
                System.out.print("ворона");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("вороны");
                break;
            default:
                System.out.print("ворон");
                break;
        }

    }
}
