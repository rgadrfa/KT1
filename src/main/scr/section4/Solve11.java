package main.scr.section4;

import java.util.Scanner;

public class Solve11 {

    public static void main1(){
        var input = new Scanner(System.in);

        // Запрос общего количества карточек (должно быть пронумеровано от 1 до numberValues)
        System.out.print("Введите общее число карточек: ");
        var numberValues = input.nextInt();

        var isExist = true;
        var missingCard = 0;

        // Цикл для проверки последовательности номеров карточек
        // Проходим по ожидаемым номерам от 1 до numberValues
        for (var i = 1; i < numberValues; i++){
            // Считываем очередной номер карточки из ввода
            var currentNumber = input.nextInt();

            // Проверяем, соответствует ли считанный номер ожидаемому
            if (currentNumber != i) {
                // Если номер не соответствует, значит найдена пропавшая карточка
                missingCard = i;
                isExist = false;
                break;
                // Прерываем цикл, так как пропавшая карточка найдена
            }
        }

        if (isExist) System.out.println("Пропавших карточек нет");
        else System.out.println(String.format("Номер пропавшей карточки: %d",missingCard));
    }
}
