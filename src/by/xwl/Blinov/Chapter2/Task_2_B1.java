package by.xwl.Blinov.Chapter2;

import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;

/**
 * This class (@code Task_2_B1) implementation Task Chapter 2 - B1.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
//TODO remove russian language and debug out.
public class Task_2_B1 {
    public static void main(String[] args) {
        System.out.println("Please press random value:");
        double k = IO.parseDouble();
        System.out.println("Please input interval value n,m:");
        ArrayList<Double> valN_M = IO.parseDoubleArray(2);
        String str = "(" + valN_M.get(0) + "," + valN_M.get(1) + "]";
        if (NumbersProcessing.checkRange(k, str)) {
            System.out.println("Value " + k + " принадлежит " + str);
        } else {
            System.out.println("Value " + k + " not принадлежит " + str);
        }
        str = "[" + valN_M.get(0) + "," + valN_M.get(1) + ")";
        if (NumbersProcessing.checkRange(k, str)) {
            System.out.println("Value " + k + " принадлежит " + str);
        } else {
            System.out.println("Value " + k + " not принадлежит " + str);
        }
        str = "(" + valN_M.get(0) + "," + valN_M.get(1) + ")";
        if (NumbersProcessing.checkRange(k, str)) {
            System.out.println("Value " + k + " принадлежит " + str);
        } else {
            System.out.println("Value " + k + " not принадлежит " + str);
        }
        str = "[" + valN_M.get(0) + "," + valN_M.get(1) + "]";
        if (NumbersProcessing.checkRange(k, str)) {
            System.out.println("Value " + k + " принадлежит " + str);
        } else {
            System.out.println("Value " + k + " not принадлежит " + str);
        }
        Information info = new Information("26.11.2018, 23:27");
        info.printInformation();
        IO.waitingPress();
    }
}

