package by.xwl.Blinov.Chapter2;

import by.xwl.Convert;
import by.xwl.IO;
import by.xwl.Information;

import java.util.ArrayList;

/**
 * This class (@code Task_2_B3) implementation Task Chapter 2 - B3.
 *
 * @author X-WL
 * @see by.xwl.Blinov.Chapter2
 */
public class Task_2_B3 {
    public static void main(String[] args) {
        //System.out.println("Please input params quadratic a,b,c:");
        //ArrayList<Double> params = IO.parseDoubleArray(3);
        ArrayList<Double> params = IO.parseDoubleArrayWishArgs(args,3);
        System.out.println(Convert.toString(params.get(0)) + " * x^2 + " +
                Convert.toString(params.get(1)) + " * x + " +
                Convert.toString(params.get(2)) + " = 0");
        double D = params.get(1) * params.get(1) - 4 * params.get(0) * params.get(2);
        System.out.println("D = " + Convert.toString(params.get(1)) + "^2 - 4 * " +
                Convert.toString(params.get(0)) + " * " +
                Convert.toString(params.get(2)) + " = " + Convert.toString(D));
        double sqrtD = Math.sqrt(D);
        System.out.println("sqrt(D) = " + Convert.toString(sqrtD));
        double x1 = (-params.get(1) + sqrtD) / (2 * params.get(0));
        double x2 = (-params.get(1) - sqrtD) / (2 * params.get(0));
        System.out.println("x1 = (-" + Convert.toString(params.get(1)) + " + " +
                Convert.toString(sqrtD) + ") / (2 * " +
                Convert.toString(params.get(0)) + ") = " + Convert.toString(x1));
        System.out.println("x2 = (-" + Convert.toString(params.get(1)) + " - " +
                Convert.toString(sqrtD) + ") / (2 * " +
                Convert.toString(params.get(0)) + ") = " + Convert.toString(x2));
        Information info = new Information("27.11.2018, 16:11");
        info.printInformation();
        IO.waitingPress();
    }
}
