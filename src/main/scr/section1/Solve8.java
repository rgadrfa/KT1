package main.scr.section1;

import java.util.Scanner;

public class Solve8 {
    public static void main1(){

        var input = new Scanner(System.in); // - Новый объект сканнер

        System.out.print("Введите расстояние между отверстиями по горизонтали");
        var aLength = input.nextDouble(); // - Счёт длины a
        System.out.print("Введите расстояние между отверстиями по вертикали");
        var bLength = input.nextDouble(); // - Счёт длины b
        System.out.print("Введите длину оставшейся части шнурков");
        var lLength = input.nextDouble(); // - Счёт длины l
        System.out.print("Введите колличество отверстий");
        var nNumber = input.nextDouble(); // - Счёт колличества отверстий

        var resultLength = 2 * (lLength + (nNumber - 1) * (aLength + bLength)) + aLength; // - Формула для вычисления длины шнурка

        System.out.println(String.format("Итоговая длина шнурка равна %s единицы",resultLength));
        // - вывод информации о длине шнурка, с использованием форматированного выводакласса String
    }
}
