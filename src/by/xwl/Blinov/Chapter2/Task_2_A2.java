package by.xwl.Blinov.Chapter2;

/**
 * This class (@code Task_2_A2) implementation Task Chapter 2 - A2.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */

import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;
import java.util.Collections;

public class Task_2_A2 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        incomingData = NumbersProcessing.sortedArrayForLenMinMax(incomingData);
        System.out.println("Result sorted min to max:");
        IO.printArrayNumberWithLen(incomingData);
        Collections.reverse(incomingData);
        System.out.println("Result sorted max to min:");
        IO.printArrayNumberWithLen(incomingData);
        Information info = new Information();
        info.printInformation();
        IO.waitingPress();
    }
}
