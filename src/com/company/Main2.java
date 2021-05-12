package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //вводиться символ
        //1 определить буква ли это (английские)
        //1.1 если это буква определить маленькая или большая
        //2 если это не буква то поределить цифра ли это
        //2.1 если цифра то чётная или не чётная
        //3 иначе вывести неопознанный символ

        char symbol;

        Scanner input = new Scanner(System.in);

        System.out.print("input symbol: ");
        symbol = input.next().charAt(0);

        if(symbol>='a' && symbol<='z' || symbol>='A' && symbol<='Z'){
            System.out.println("this is letter");

            if(symbol>='a' && symbol<='z'){
                System.out.println("small");
            }
            else {
                System.out.println("big");
            }

        }
        else if (symbol>='0' && symbol<='9'){
            System.out.println("this is digit");

            if(symbol%2==0){
                System.out.println("even");
            }
            else {
                System.out.println("odd");
            }
        }
        else{
            System.out.println("this is unknown");
        }
    }
}
