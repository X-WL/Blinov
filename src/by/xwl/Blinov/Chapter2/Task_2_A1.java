package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.Information;
import by.xwl.IO;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;

/**
 * This class (@code Task_2_A1) implementation Task Chapter 2 - A1
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */

public class Task_2_A1 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        double maxLenValue = NumbersProcessing.getMaxLenValue(incomingData);
        double minLenValue = NumbersProcessing.getMinLenValue(incomingData);
        System.out.print("Maximum length: " + Convert.toString(maxLenValue).length());
        System.out.println(" value: " + Convert.toString(maxLenValue));
        System.out.print("Minimum length: " + Convert.toString(minLenValue).length());
        System.out.println(" value: " + Convert.toString(minLenValue));
        Information info = new Information();
        info.printInformation();
        IO.waitingPress();
    }
}
