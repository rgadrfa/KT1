package main.scr.section4;

import java.util.Scanner;

public class Solve5 {
    public static void main1(){
        var input = new Scanner(System.in);

        // Запрос у пользователя количества чисел для суммирования
        System.out.print("Введите длину ряда суммы: ");

        // Считывание количества чисел, которые нужно просуммировать
        var currentLength = input.nextInt();
        // Инициализация переменной для хранения суммы
        var sum = 0.0;
        // Цикл для последовательного считывания и суммирования чисел
        for (var i = 0; i < currentLength; i++){
            // Считывание очередного числа и добавление его к общей сумме
            sum += input.nextDouble();
        }
        // Вывод результата: длина ряда и вычисленная сумма
        System.out.println(String.format("Итоговая сумма при длине %d : %s",currentLength,sum));
    }
}
