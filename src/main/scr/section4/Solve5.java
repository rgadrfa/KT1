package main.scr.section4;

import java.util.Scanner;

public class Solve5 {
    public static void main1(){
        var input = new Scanner(System.in);

        System.out.print("Введите длину ряда суммы: ");

        var currentLength = input.nextInt();
        var sum = 0.0;
        for (var i = 0; i < currentLength; i++){
            sum += input.nextDouble();
        }
        System.out.println(String.format("Итоговая сумма при длине %d : %s",currentLength,sum));
    }
}
