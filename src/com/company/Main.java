package com.company;

import java.util.Scanner;
//Честно было лень заводить 3 класса, поэтому я сделал три метода

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Введите зарплаты сотрудников");

        System.out.print("Первый сотрудник: ");
        int zp1 = input.nextInt();
        System.out.print("Второй сотрудник: ");
        int zp2 = input.nextInt();
        System.out.print("Тредтий сотрудник: ");
        int zp3 = input.nextInt();

        int max = 0;
        int min = 0;

        if (zp1 < zp2) {
            min = zp1;
        } else {
            min = zp2;
        }
        if(zp3<min){
            min=zp3;
        }

        if (zp1 > zp2) {
            max = zp1;
        } else {
            max = zp2;
        }
        if(zp3>max){
            max=zp3;
        }

        int result = max - min;
        System.out.println("Разница на "+result);
    }

}
