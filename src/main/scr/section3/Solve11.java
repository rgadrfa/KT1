package main.scr.section3;

import java.util.Scanner;

public class Solve11 {

    public static void main1(){

        var input = new Scanner(System.in);

        var numberValues = input.nextInt();

        for (var i = 1; i < numberValues; i++){
            var currentNumber = input.nextInt();
            if (currentNumber != i) {
                System.out.println(i);
                break;
            }
        }
    }


}
