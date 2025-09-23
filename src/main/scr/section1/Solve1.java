package main.scr.section1;

import java.util.Scanner;

public class Solve1 {
    public static void main1(){

        var input = new Scanner(System.in); // - Новый объект сканнер

        System.out.print("Введите первое число ");
        var num1 = input.nextDouble(); // - Счёт первого числа
        System.out.print("Введите второе число ");
        var num2 = input.nextDouble(); // - Счёт второго числа
        System.out.print("Введите третье число ");
        var num3 = input.nextDouble(); // - Счёт третьего числа

        var sum = num1 + num2 + num3; // - Вычисление суммы трёх чисел
        System.out.println(sum); // - Вывод сумм
    }
}
