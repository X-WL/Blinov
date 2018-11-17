package by.xwl;

import java.util.ArrayList;

/**
 * This class (@code NumbersProcessing) implementation
 * extended method Numbers Processing
 * @author X-WL
 * @see by.xwl
 */

public class NumbersProcessing {
    /**
     * This method return value is maximum length.
     * @param input (@code ArrayList<T>)is Array input Data
     * @param <T> is (@code Number)
     * @return maximum value type <T>
     *
     * @author X-WL
     * @see #getMaxLenValue(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> T getMaxLenValue(ArrayList<T> input){
        int idMaxLen = 0;
        String str_Max = Convert.toString(input.get(idMaxLen));
        for (int i = 0; i < input.size(); i++) {
            String str_i = Convert.toString(input.get(i));
            if (str_i.length()>str_Max.length()){
                idMaxLen = i;
                str_Max = Convert.toString(input.get(idMaxLen));
            }
        }
        return input.get(idMaxLen);
    }

    /**
     * This method return value is minimum length.
     * @param input (@code ArrayList<T>)is Array input Data
     * @param <T> is (@code Number)
     * @return maximum value type <T>
     *
     * @author X-WL
     * @see #getMinLenValue(ArrayList)
     * @see by.xwl.NumbersProcessing
     */
    public static <T extends Number> T getMinLenValue(ArrayList<T> input){
        int idMinLen = 0;
        String str_Min = Convert.toString(input.get(idMinLen));
        for (int i = 0; i < input.size(); i++) {
            String str_i = Convert.toString(input.get(i));
            if (str_i.length()<str_Min.length()){
                idMinLen = i;
                str_Min = Convert.toString(input.get(idMinLen));
            }
        }
        return input.get(idMinLen);
    }

}
