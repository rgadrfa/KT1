package main.scr.section4;

import java.util.Scanner;

public class Solve11 {

    public static void main1(){
        var input = new Scanner(System.in);

        // Запрос общего количества карточек (должно быть пронумеровано от 1 до numberValues)
        System.out.println("Введите общее число карточек: ");
        var numberValues = input.nextInt();

        // Цикл для проверки последовательности номеров карточек
        // Проходим по ожидаемым номерам от 1 до numberValues-1
        for (var i = 1; i < numberValues; i++){
            // Считываем очередной номер карточки из ввода
            var currentNumber = input.nextInt();

            // Проверяем, соответствует ли считанный номер ожидаемому
            if (currentNumber != i) {
                // Если номер не соответствует, значит найдена пропавшая карточка
                System.out.println(String.format("Номер пропавшей карточки: %d",i));
                break;
                // Прерываем цикл, так как пропавшая карточка найдена
            }
        }
    }
}
