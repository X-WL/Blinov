package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;
import by.xwl.Information;
import by.xwl.NumbersProcessing;

import java.util.ArrayList;

/**
 * This class (@code Task_2_A8) implementation Task Chapter 2 - A8.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_A8 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        ArrayList<Double> polyndrom =
                NumbersProcessing.getPolyndromFromArray(incomingData);
        System.out.print("Result polyndrom: ");
        if (polyndrom.size()>1){
            System.out.println(Convert.toString(polyndrom.get(1)));
        } else {
            System.out.println(Convert.toString(polyndrom.get(0)));
        }
        Information info = new Information("26.11.2018, 20:13");
        info.printInformation();
        IO.waitingPress();
    }
}
