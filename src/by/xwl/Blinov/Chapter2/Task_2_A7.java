package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;
import java.util.Collections;

/**
 * This class (@code Task_2_A7) implementation Task Chapter 2 - A7.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_A7 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        int idVarious = -1;
        for (int i = incomingData.size() - 1; i >= 0; i--) {
            if (NumbersProcessing.checkVariousDigit(incomingData.get(i))) {
                idVarious = i;
            }
        }
        if (idVarious >= 0) {
            System.out.println("Result various number: ");
            System.out.println(Convert.toString(incomingData.get(idVarious)));
        } else {
            System.out.println("Not value!");
        }
        Information info = new Information("25.11.2018, 20:13");
        info.printInformation();
        IO.waitingPress();
    }
}
