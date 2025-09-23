package main.scr.section5;

import java.util.Scanner;

public class Solve6 {

    public static void main1(){
        var input = new Scanner(System.in);

        var currentFibNumber = input.nextInt() - 1;

        var firstNumber = 0; // - Первое базовое число последовательности
        var secondNumber = 1; // - Второе базовое число последовательности
        var nextNumber = 0; // - Следующее число последовательности, что будет меняться в теле цикла

        while (currentFibNumber > 0){    // - Пока количество оставшихся чисел (currentFibNumber) больше 0, то цикл будет работать
            nextNumber = firstNumber + secondNumber; // - Вычисление следующего числа

            firstNumber = secondNumber; // - Назначить на позицию первого числа второе
            secondNumber = nextNumber; // - На позицию второго числа поставить получившееся nextNumber (Следующее число)

            currentFibNumber--; // - Уменьшение количества оставшихся чисел, по мере вычисления последовательности фибоначи
        }
        System.out.println(secondNumber);
    }
}
