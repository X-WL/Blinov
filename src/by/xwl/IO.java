package by.xwl;
/**
 * This class (@code IO) implement extended In/Out operation.
 *
 * @author X-WL
 * @see by.xwl
 */

import java.util.ArrayList;
import java.util.Scanner;

public class IO {
    /**
     * This method working wish Keyboard and return (@code int)
     *
     * @return is (@code int)
     * @author X-WL
     * @see #parseInteger()
     * @see by.xwl.NumbersProcessing
     */
    public static int parseInteger() {
        Scanner scanner = new Scanner(System.in);
        int output = 0;
        try {
            String incomingArray = scanner.nextLine();
            String[] stripArray = incomingArray.split(" ");
            output = Integer.valueOf(stripArray[0]);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish Keyboard and return (@code double)
     *
     * @return is (@code double)
     * @author X-WL
     * @see #parseDouble()
     * @see by.xwl.NumbersProcessing
     */
    public static double parseDouble() {
        Scanner scanner = new Scanner(System.in);
        double output = 0;
        try {
            String incomingArray = scanner.nextLine();
            String[] stripArray = incomingArray.split(" ");
            output = Double.valueOf(stripArray[0]);
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish Keyboard and return (@code Double) Array.
     *
     * @return is (@code ArrayList) incoming values.
     * @see #parseDoubleArray()
     * @see by.xwl.IO
     */
    public static ArrayList<Double> parseDoubleArray() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> output = new ArrayList<>();
        try {
            String incomingArray = scanner.nextLine();
            String[] stripArray = incomingArray.split(" ");
            for (int i = 0; i < stripArray.length; i++) {
                output.add(Double.valueOf(stripArray[i]));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish Keyboard and return (@code Double) Array <= maximum values.
     *
     * @param maxValue is (@code int) set maximum element of array return
     * @return is (@code ArrayList) incoming values.
     * @see #parseDoubleArray()
     * @see by.xwl.IO
     */
    public static ArrayList<Double> parseDoubleArray(int maxValue) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> output = new ArrayList<>();
        try {
            String incomingArray = scanner.nextLine();
            String[] stripArray = incomingArray.split(" ");
            int forValue = maxValue;
            if (stripArray.length < forValue) {
                forValue = stripArray.length;
            }
            for (int i = 0; i < forValue; i++) {
                output.add(Double.valueOf(stripArray[i]));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish ARGS and return (@code Double) Array.
     *
     * @param args is (@code String[])
     * @return is (@code ArrayList) incoming values.
     * @see #parseDoubleArrayWishArgs(String[])
     * @see by.xwl.IO
     */
    public static ArrayList<Double> parseDoubleArrayWishArgs(String[] args) {
        ArrayList<Double> output = new ArrayList<>();
        try {
            for (int i = 0; i < args.length; i++) {
                output.add(Double.valueOf(args[i]));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish ARGS and return (@code Double) Array <= maximum values.
     *
     * @param args     is (@code String[])
     * @param maxValue is (code int) set maximum element of array return
     * @return is (@code ArrayList) incoming values.
     * @see #parseDoubleArrayWishArgs(String[], int)
     * @see by.xwl.IO
     */
    public static ArrayList<Double> parseDoubleArrayWishArgs(String[] args, int maxValue) {
        ArrayList<Double> output = new ArrayList<>();
        try {
            int forValue = maxValue;
            if (args.length < forValue) {
                forValue = args.length;
            }
            for (int i = 0; i < forValue; i++) {
                output.add(Double.valueOf(args[i]));
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return output;
    }

    /**
     * This method working wish Keyboard and return (@code Integer) Array.
     *
     * @return is (@code ArrayList) incoming values.
     * @see #parseIntegerArray()
     * @see by.xwl.IO
     */
    public static ArrayList<Integer> parseIntegerArray() {
        Scanner scanner = new Scanner(System.in);
        String incomingArray = scanner.nextLine();
        String[] stripArray = incomingArray.split(" ");
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0; i < stripArray.length; i++) {
            output.add(Integer.valueOf(stripArray[i]));
        }
        return output;
    }

    /**
     * This method (@code printArray) print Array.
     *
     * @param input is (@code ArrayList)
     * @param <T>
     * @author X-WL
     * @see #printArray(ArrayList)
     * @see by.xwl.IO
     */
    public static <T> void printArray(ArrayList<T> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.print(" " + input.get(i));
        }
        System.out.println();
    }

    /**
     * This method (@code printArray) print Number Array. Integers are happen without a dot.
     *
     * @param input is (@code ArrayList)
     * @param <T>   is type (@code Number)
     * @author X-WL
     * @see #printArrayNumber(ArrayList)
     * @see by.xwl.IO
     */
    public static <T extends Number> void printArrayNumber(ArrayList<T> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.print(" " + Convert.toString(input.get(i)));
        }
        System.out.println();
    }

    /**
     * This method (@code printArray) print Number Array. Integers are happen without a dot.
     *
     * @param input is (@code ArrayList)
     * @param <T>   is type (@code Number)
     * @author X-WL
     * @see #printArrayNumber(ArrayList)
     * @see by.xwl.IO
     */
    public static <T extends Number> void printArrayNumberWithLen(ArrayList<T> input) {
        for (int i = 0; i < input.size(); i++) {
            String str1 = Convert.toString(input.get(i));
            String abs = Convert.toString(Math.abs(input.get(i).doubleValue()));
            String str2 = Convert.toString(abs.length());
            System.out.println(" Value: " + str1 +
                    " Length: " + str2);
        }
        System.out.println();
    }

    /**
     * This method waiting press key to keyboard.
     *
     * @author X-WL
     * @see #waitingPress()
     * @see by.xwl.IO
     */
    public static void waitingPress() {
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
