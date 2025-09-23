package main.scr.section5;

import java.util.Scanner;

public class Solve6 {

    public static void main1(){
        var input = new Scanner(System.in);

        // Получение от пользователя номера числа Фибоначчи, которое нужно вычислить
        // Вычитаем 1, так как последовательность начинается с 0-го элемента
        var currentFibNumber = input.nextInt() - 1;

        // Инициализация первых двух чисел последовательности Фибоначчи
        var firstNumber = 0;  // F(0) - нулевое число Фибоначчи
        var secondNumber = 1;  // F(1) - первое число Фибоначчи
        var nextNumber = 0; // Переменная для вычисления следующего числа в последовательности

        // Цикл для вычисления чисел Фибоначчи
        // Выполняется currentFibNumber раз (для получения числа с нужным индексом)
        while (currentFibNumber > 0){
            // Вычисление следующего числа Фибоначчи как суммы двух предыдущих
            nextNumber = firstNumber + secondNumber;

            // Сдвиг чисел в последовательности:
            firstNumber = secondNumber; // - Назначить на позицию первого числа второе
            secondNumber = nextNumber; // - На позицию второго числа поставить получившееся nextNumber (Следующее число)

            currentFibNumber--; // - Уменьшение количества оставшихся чисел, по мере вычисления последовательности фибоначи
        }
        // Вывод результата - числа Фибоначчи с заданным индексом
        System.out.println(secondNumber);
    }
}
