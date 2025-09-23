package main.scr.section2;

import java.util.Scanner;

public class Solve13 {
    public static void main1(){
        var input = new Scanner(System.in);

        var nLength = input.nextDouble();
        var mLength = input.nextDouble();

        var xDistance = input.nextDouble();
        var yDistance = input.nextDouble();

        var xReversDistance = Math.abs(nLength - xDistance);
        var yReversDistance =  Math.abs(mLength - yDistance);
    }
}
