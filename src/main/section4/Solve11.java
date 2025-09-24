package main.section4;

import java.util.Scanner;

public class Solve11 {

    public static void main1(){
        var input = new Scanner(System.in);

        // Запрос общего количества карточек (должно быть пронумеровано от 1 до numberValues)
        System.out.print("Введите общее число карточек: ");
        var numberValues = input.nextInt();

        var isExist = true; // Логический флаг для обозначения существования всех карточек
        var missingCard = 0; // Переменная для хранения номера пропавшей карточки

        // Цикл для проверки последовательности номеров карточек
        // Проходим по ожидаемым номерам от 1 до numberValues - 1
        for (var i = 1; i < numberValues; i++){
            // Считываем очередной номер карточки из ввода
            var currentNumber = input.nextInt();

            // Проверяем, соответствует ли считанный номер ожидаемому
            if (currentNumber != i) {
                // Если номер не соответствует, значит найдена пропавшая карточка
                missingCard = i;
                // Флаг становится ложным
                isExist = false;
                break;
                // Прерываем цикл, так как пропавшая карточка найдена
            }
        }
        // Если все карточки на месте вывод
        if (isExist) System.out.println("Пропавших карточек нет");
        // Иначе
        // Вывод информации с помощью форматированного вывода
        else System.out.printf("Номер пропавшей карточки: %d%n",missingCard);
    }
}
