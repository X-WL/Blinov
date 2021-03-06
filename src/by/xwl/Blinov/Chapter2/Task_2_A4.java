package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;

/**
 * This class (@code Task_2_A6) implementation Task Chapter 2 - A6.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */

public class Task_2_A4 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        int idMaxVarious = 0;
        int valMaxVarious = 0;
        for (int i = incomingData.size() - 1; i >= 0; i--) {
            int tempVarios =
                    NumbersProcessing.getVariousDigit(incomingData.get(i));
            System.out.println("L:"+tempVarios);
            if (tempVarios < valMaxVarious) {
                idMaxVarious = i;
                valMaxVarious = tempVarios;
            }
        }
        System.out.print("Result min various digit number: ");
        System.out.println(Convert.toString(incomingData.get(idMaxVarious)));
        System.out.println("Various digit: " + valMaxVarious);
        Information info = new Information("23.11.2018, 20:13");
        info.printInformation();
        IO.waitingPress();
    }
}
