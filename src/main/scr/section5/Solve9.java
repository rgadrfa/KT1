package main.scr.section5;

import java.util.Scanner;

public class Solve9 {

    public static void main1(){
        var input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int currentNumber = input.nextInt();  // - Получение самого первого числа
        var secondNumber = 0;
        var currentMaxCount = 0;
        var count = 0;

        System.out.println("Введите следующие числа последовательности: ");
        while (currentNumber != 0){
            secondNumber = input.nextInt(); // - Получение следующего числа, идущего после самого первого числа

            if (currentNumber == secondNumber) count++;
            else {
                if (currentMaxCount <= count) currentMaxCount = count + 1;
                count = 0;
            }
            currentNumber = secondNumber; // - Смещение - Назначение currentNumber значение secondNumber (смещение влево по всей последовательности)
        }
        System.out.println(String.format("Итоговая максимальная длина всех подстрок %s ", currentMaxCount));
    }
}
