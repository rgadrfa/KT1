package main.scr.section1;

import java.util.Scanner;

public class Solve8 {
    public static void main1(){

        var input = new Scanner(System.in); // - Новый объект сканер

        System.out.print("Введите расстояние между отверстиями по горизонтали");
        var aLength = input.nextDouble(); // - Счёт длины a
        System.out.print("Введите расстояние между отверстиями по вертикали");
        var bLength = input.nextDouble(); // - Счёт длины b
        System.out.print("Введите длину оставшейся части шнурков");
        var lLength = input.nextDouble(); // - Счёт длины l
        System.out.print("Введите количество отверстий");
        var nNumber = input.nextDouble(); // - Счёт количества отверстий

        var resultLength = 2 * (lLength + (nNumber - 1) * (aLength + bLength)) + aLength; // - Формула для вычисления длины шнурка

        // Вывод информации с помощью форматированного вывода
        // - вывод информации о длине шнурка, с использованием форматированного вывода класса String
        System.out.printf("Итоговая длина шнурка равна %s единицы%n",resultLength);
    }
}
