package by.xwl.Blinov.Chapter2;

import by.xwl.IO;
import by.xwl.Information;

/**
 * This class (@code Task_2_B4) implementation Task Chapter 2 - B4.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_B4 {
    public enum Mount {
        January, February, March, April, May, June,
        July, August, September, October, November, December
    };

    public static void main(String[] args) {
        System.out.println("Please input value of 1-12:");
        int k = IO.parseInteger();
        if ((k>=1) && (k<=12)){
            System.out.println(k+" = " + Mount.values()[k-1]);

        } else {
            System.out.println("Not valid value!");
        }
        Information info = new Information("29.11.2018, 21:36");
        info.printInformation();
        IO.waitingPress();
    }
}
