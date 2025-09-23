package main.scr.section2;

import java.util.Scanner;

public class Solve13 {
    public static void main1(){
        var input = new Scanner(System.in);

        var nLength = input.nextDouble(); // - Длина бассейна
        var mLength = input.nextDouble(); // - Ширина бассейна

        var xDistance = input.nextDouble(); // - Дистанция x до длинного бортика
        var yDistance = input.nextDouble(); // - Дистанция y до длинного бортика

        var xReversDistance = Math.abs(nLength - xDistance);
        var yReversDistance =  Math.abs(mLength - yDistance);

        var minWidthDistance = xDistance > xReversDistance ? xReversDistance : xDistance;
        var minLengthDistance = yDistance > yReversDistance ? yReversDistance : yDistance;

        if (minWidthDistance > minLengthDistance) System.out.print(minLengthDistance);
        else System.out.print(minWidthDistance);
    }
}
