/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */
package base;

import java.util.Scanner;

public class PaintCalculator {
    final int galToSquareFt = 350;
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        PaintCalculator myApp = new PaintCalculator();
        myApp.output();
    }

    private int lengthPrompt() {
        System.out.print("Ceiling length in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private int widthPrompt() {
        System.out.print("Ceiling width in feet? ");
        return Integer.parseInt(in.nextLine());
    }

    private int[] calculations(int length, int width) {
        int area = length * width;
        int galRequired = area / galToSquareFt;
        if(area % galToSquareFt != 0) {
            galRequired += 1;
        }
        return new int[]{area, galRequired};
    }

    private void output() {
        int length = lengthPrompt();
        int width = widthPrompt();
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", calculations(length, width)[1], calculations(length, width)[0]);
    }
}
