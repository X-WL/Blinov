package by.xwl;

/**
 * This class (@code Point2D) implementation base function of name.
 *
 * @author X-WL
 * @see by.xwl
 */
public class Point2D {
    /* this field implementation base coordinate*/
    private double x;
    private double y;

    /**
     * This constructor use 2 (@code double0 params.
     *
     * @param x is (@code double)
     * @param y is (@code double)
     * @author X-Wl
     * @see #Point2D(double, double)
     * @see by.xwl
     */
    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This constructor set x, y = 0.
     *
     * @author X-Wl
     * @see #Point2D()
     * @see by.xwl
     */
    public Point2D() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    /**
     * This method set coordinates of params.
     *
     * @param x is (@code double)
     * @param y is (@code double)
     * @author X-WL
     * @see #setLocation(double, double)
     * @see by.xwl
     */
    public void setLocation(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This method move current coordinates of params.
     *
     * @param dx is (@code double)
     * @param dy is (@code double)
     * @author X-WL
     * @see #move(double, double)
     * @see by.xwl
     */
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }
}
