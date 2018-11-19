package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;

import java.util.ArrayList;

/**
 * This class (@code Task_2_A6) implementation Task Chapter 2 - A6
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_A6 {
    public static void main(String[] args) {
        System.out.println("Please press n random value:");
        ArrayList<Double> incomingData = IO.parseDoubleArray();
        int idVal = -1;
        for (int i = incomingData.size() - 1; i >= 0; i--) {
            double temp = incomingData.get(i);
            boolean is_error = false;
            String str = Convert.toString(temp);
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) < str.charAt(j - 1)) {
                    is_error = true;
                }
            }
            if (is_error == false) {
                idVal = i;
            }
        }
        if (idVal >= 0) {
            System.out.print("Result: ");
            System.out.println(Convert.toString(incomingData.get(idVal)));
        } else {
            System.out.println("Not result!");
        }
    }
}
