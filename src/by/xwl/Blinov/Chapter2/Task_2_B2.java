package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;
import by.xwl.Information;

import java.util.ArrayList;

/**
 * This class (@code Task_2_B2) implementation Task Chapter 2 - B2.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_B2 {
    public static void main(String[] args) {
        System.out.println("Please input interval value n,m:");
        ArrayList<Double> valN_M = IO.parseDoubleArray(2);
        int k = 1;
        int maxLen = Convert.toString(valN_M.get(0)*valN_M.get(1)).length();
        for (int i = 0; i < valN_M.get(0); i++) {
            for (int j = 0; j < valN_M.get(1); j++) {
                System.out.printf(" %1$"+maxLen+"d ", k);
                k++;
            }
            System.out.println();
        }
        Information info = new Information("27.11.2018, 15:09");
        info.printInformation();
        IO.waitingPress();
    }
}
