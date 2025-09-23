package main.scr.section4;

import java.util.Scanner;

public class Solve11 {

    public static void main1(){
        var input = new Scanner(System.in);

        System.out.println("Введите общее число карточек: ");
        var numberValues = input.nextInt();

        for (var i = 1; i < numberValues; i++){
            var currentNumber = input.nextInt();
            if (currentNumber != i) {
                System.out.println(String.format("Номер отсуствующей крточки: %d",i));
                break;
            }
        }
    }
}
