package by.xwl.Blinov.Chapter2;

/**
 * This class (@code Task_2_A1) implementation Task Chapter 2 - A2
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */

import by.xwl.IO;
import by.xwl.Information;

import java.util.ArrayList;
import java.util.Collections;

public class Task_2_A2 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        Collections.sort(incomingData);
        System.out.println("Result:");
        IO.printArrayNumber(incomingData);
        Information info = new Information();
        info.printInformation();
        IO.waitingPress();
    }
}
