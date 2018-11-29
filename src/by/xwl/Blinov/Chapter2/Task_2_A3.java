package by.xwl.Blinov.Chapter2;

import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class (@code Task_2_A3) implementation Task Chapter 2 - A3.
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_A3 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        Collections.sort(incomingData);
        int avrLen = NumbersProcessing.getAvrLen(incomingData);
        System.out.println("Average length: " + avrLen);
        ArrayList<Double> lessAvr =
                NumbersProcessing.getLessNumValue(incomingData, avrLen);
        ArrayList<Double> moreAvr =
                NumbersProcessing.getMoreNumValue(incomingData, avrLen);
        System.out.println("Result less average length:");
        IO.printArrayNumberWithLen(lessAvr);
        System.out.println("Result more average length:");
        IO.printArrayNumberWithLen(moreAvr);
        Information info = new Information("22.11.2018, 20:13");
        info.printInformation();
        IO.waitingPress();
    }
}
