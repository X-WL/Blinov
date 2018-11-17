package by.xwl;

/**
 * This class (@code Convert) implementation extended converting Method
 */

public class Convert {
    /**
     * This method (@code toString) implementation converting Number to String
     * @param input is value type (@code <T>)
     * @param <T> is (@code Number) value
     * @return (@code String)
     *
     * @see #toString(Number)
     * @see by.xwl.Convert
     */
    public static <T extends Number> String toString(T input) {
        String out="";
        if (input.doubleValue() % 1 != 0) {
            out = String.valueOf(input);
        } else {
            out = String.valueOf(input.intValue());
        }
        return out;

    }
}
