package main.scr.section2;

import java.util.Scanner;

public class Solve2 {
    // - основное решение
    public static void main1(){

        var input = new Scanner(System.in); // - Новый объект сканер

        var number = input.nextDouble(); // - получение числа для проверки знака

        if (number < 0) System.out.println(-1); // - Отрицательный знак, если полученное значение меньше чем 0
        else  System.out.println(1); // - Иначе Положительный знак
    }

    // - Решение через метод
    public static int getDigitalValue(double value){
        if (value >= 0) return 1; // - если значение больше или равно 0, то знак положительный
        return -1; // - иначе знак отрицательный
    }
}
