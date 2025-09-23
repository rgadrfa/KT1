package main.scr.section5;

import java.util.Scanner;

public class Solve9 {

    public static void main1(){
        var input = new Scanner(System.in);

        // Запрос и получение первого числа последовательности
        System.out.print("Введите первое число: ");
        int currentNumber = input.nextInt();  // - Получение самого первого числа
        var secondNumber = 0; // Переменная для хранения последнего числа последовательности, для дальнейшего сравнения
        var currentMaxCount = 0; // Переменная для хранения максимальной длины подпоследовательности
        var count = 0; // Счетчик для текущей подпоследовательности одинаковых чисел

        System.out.println("Введите следующие числа последовательности: ");
        // Цикл выполняется до тех пор, пока не будет введен 0
        while (currentNumber != 0){
            secondNumber = input.nextInt(); // - Получение следующего числа, идущего после самого первого числа

            // Проверка равенства текущего и следующего числа
            if (currentNumber == secondNumber) count++; // - Если текущее и следующие числа равны, то счётчик увеличивается
            // Иначе
            else {
                if (currentMaxCount <= count) currentMaxCount = count + 1; // - Если счётчик count оказывается больше
                // чем текущая максимальная длина в currentMaxCount,
                // то значение счётчика currentMaxCount меняется на текущее значение count
                count = 0; // Сброс счетчика текущей подпоследовательности
            }
            currentNumber = secondNumber; // - Смещение - Назначение currentNumber значение secondNumber (смещение влево по всей последовательности)
        }
        // Вывод результата - максимальной длины подпоследовательности одинаковых чисел
        System.out.println(String.format("Итоговая максимальная длина всех подстрок %s ", currentMaxCount));
    }
}
