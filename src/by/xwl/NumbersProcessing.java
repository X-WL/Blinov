package by.xwl;

import java.util.ArrayList;

/**
 * This class (@code NumbersProcessing) implementation
 * extended method Numbers Processing
 *
 * @author X-WL
 * @see by.xwl
 */
public class NumbersProcessing {
    /**
     * This method return value length.
     *
     * @param input is (@code Number) input Data
     * @param <T>   is (@code Number)
     * @return length value
     * @author X-WL
     * @see #getLenValue(T)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> int getLenValue(T input) {
        int len = 0;
        String str = Convert.toString(input);
        len = str.length();
        return len;
    }

    /**
     * This method return value is maximum length.
     *
     * @param input (@code ArrayList<>)is Array input Data
     * @param <T>   is (@code Number)
     * @return maximum value
     * @author X-WL
     * @see #getMaxLenValue(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> T getMaxLenValue(ArrayList<T> input) {
        int idMaxLen = 0;
        String str_Max = Convert.toString(input.get(idMaxLen));
        for (int i = 0; i < input.size(); i++) {
            String str_i = Convert.toString(input.get(i));
            if (str_i.length() > str_Max.length()) {
                idMaxLen = i;
                str_Max = Convert.toString(input.get(idMaxLen));
            }
        }
        return input.get(idMaxLen);
    }

    /**
     * This method return value is minimum length.
     *
     * @param input (@code ArrayList<>)is Array input Data
     * @param <T>   is (@code Number)
     * @return is maximum value
     * @author X-WL
     * @see #getMinLenValue(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> T getMinLenValue(ArrayList<T> input) {
        int idMinLen = 0;
        String str_Min = Convert.toString(input.get(idMinLen));
        for (int i = 0; i < input.size(); i++) {
            String str_i = Convert.toString(input.get(i));
            if (str_i.length() < str_Min.length()) {
                idMinLen = i;
                str_Min = Convert.toString(input.get(idMinLen));
            }
        }
        return input.get(idMinLen);
    }

    /**
     * This method sorted incoming Array for length "Minimum-Maximum"
     *
     * @param input is (@code ArrayList)
     * @param <T>   is (@code Number)
     * @return is (@code ArrayFirst) type (@code Number)
     * @author X-WL
     * @see #sortedArrayForLenMinMax(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> ArrayList<T>
    sortedArrayForLenMinMax(ArrayList<T> input) {
        for (int i = input.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                double abs1 = Math.abs(input.get(j).doubleValue());
                double abs2 = Math.abs(input.get(j + 1).doubleValue());
                String val1 = Convert.toString(abs1);
                String val2 = Convert.toString(abs2);
                if (val2.length() < val1.length()) {
                    T temp = input.get(j);
                    input.set(j, input.get(j + 1));
                    input.set(j + 1, temp);
                }
            }
        }
        return input;
    }

    /**
     * This method calculation average length value.
     *
     * @param input incoming Array
     * @param <T>   is (@code Number)
     * @return is (@code int)
     * @author X-WL
     * @see #getAvrLen(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> int getAvrLen(ArrayList<T> input) {
        int sumLen = 0;
        for (int i = 0; i < input.size(); i++) {
            String temp = Convert.toString(input.get(i));
            sumLen += temp.length();
        }
        return Math.round(sumLen / input.size());
    }

    /**
     * This method return less (@code num) Array.
     *
     * @param input is (@code Number)
     * @param num   is (@code int)
     * @param <T>   is (@code Number)
     * @return Array is (@code Number)
     * @author X-WL
     * @see #getLessNumValue(ArrayList, int)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> ArrayList<T> getLessNumValue(ArrayList<T> input, int num) {
        ArrayList<T> out = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            double abs = Math.abs(input.get(i).doubleValue());
            String temp = Convert.toString(abs);
            if (temp.length() < num) {
                out.add(input.get(i));
            }
        }
        return out;
    }

    /**
     * This method return more (@code num) Array.
     *
     * @param input is (@code Number)
     * @param num   is (@code int)
     * @param <T>   is (@code Number)
     * @return Array is (@code Number)
     * @author X-Wl
     * @see #getMoreNumValue(ArrayList, int)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> ArrayList<T> getMoreNumValue(ArrayList<T> input, int num) {
        ArrayList<T> out = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            double abs = Math.abs(input.get(i).doubleValue());
            String temp = Convert.toString(abs);
            if (temp.length() > num) {
                out.add(input.get(i));
            }
        }
        return out;
    }

    /**
     * This method return various digit value.
     *
     * @param input is (@code Number)
     * @param <T>   is (@code Number)
     * @return is (@code int)
     * @author X-WL
     * @see #getVariousDigit(Number)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> int getVariousDigit(T input) {
        int[] number = new int[10];
        String str = Convert.toString(Math.abs(input.doubleValue()));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.') {
                number[Character.getNumericValue(str.charAt(i))]++;
            }
        }
        int variousNumber = 0;
        for (int i = 0; i < 10; i++) {
            if (number[i] > 0) {
                variousNumber++;
            }
        }
        return variousNumber;
    }

    /**
     * This method checked various digit number.
     *
     * @param input is (@code Number)
     * @param <T>   is (@code Number)
     * @return is (@code boolean)
     * @author X-WL
     * @see #checkVariousDigit(Number)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> boolean checkVariousDigit(T input) {
        boolean is_Virious = true;
        String str = Convert.toString(input);
        if (str.length() <= 11) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str.length(); j++) {
                    if (i != j) {
                        if (str.charAt(i) == str.charAt(j)) {
                            is_Virious = false;
                        }
                    }
                }
            }
        } else {
            is_Virious = false;
        }
        return is_Virious;
    }

    /**
     * This method return all polyndrom value from Array.
     *
     * @param input is (@code ArrayList)
     * @param <T>   is (@code Number)
     * @return is (@code ArrayList)
     * @author X-WL
     * @see #getPolyndromFromArray(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> ArrayList<T>
    getPolyndromFromArray(ArrayList<T> input) {
        ArrayList<T> out = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            boolean is_Polyndrom = true;
            String str = Convert.toString(input.get(i));
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(str.length() - j - 1)) {
                    is_Polyndrom = false;
                }
            }
            if (is_Polyndrom) {
                out.add(input.get(i));
            }
        }
        return out;
    }

    /**
     * This method check value od range.
     *
     * @param value is checked value
     * @param range is checked range, format: "(3,5)"
     * @param <T> is (@code Number)
     * @return is (@code boolean)
     */
    public static <T extends Number> boolean checkRange(T value, String range) {
        boolean out = true;
        String strVal = range.substring(1, range.length() - 2);
        System.out.println("strVal = " + strVal);
        String[] str2Val = strVal.split(",");
        double a = Double.valueOf(str2Val[0]);
        double b = Double.valueOf(str2Val[1]);
        if (range.charAt(0) == '(') {
            if (!(a < value.doubleValue())) {
                out = false;
            }
        } else {
            if (!(a <= value.doubleValue())) {
                out = false;
            }
        }
        if (range.charAt(range.length() - 1) == ')') {
            if (!(value.doubleValue() < b)) {
                out = false;
            }
        } else {
            if (!(value.doubleValue() <= b)) {
                out = false;
            }
        }
        return out;
    }
}
