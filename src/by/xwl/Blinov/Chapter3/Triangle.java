package by.xwl.Blinov.Chapter3;

import by.xwl.Point2D;

import java.util.ArrayList;

enum TriangleType {
    Equilateral,
    Isosceles,
    Rectangular,
    Derivative;

    public void printTypeArray(ArrayList<TriangleType> triangles) {
        for (int i = 0; i < triangles.size(); i++) {
            System.out.println(1 + ". " + triangles.get(i).toString());
        }
    }
}

public class Triangle {
    private Point2D[] points;
    private double s;
    private double p;

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    public double getP() {
        return p;
    }

    public void setP(double p) {
        this.p = p;
    }

    /**
     * This constructor is use (@code Array) 3 point
     * (@code Point2D) else set default value.
     *
     * @param points is array (@code Point2D)
     * @author X-WL
     * @see #Triangle(Point2D[])
     * @see by.xwl.Blinov
     */
    public Triangle(Point2D[] points) {
        this.points = new Point2D[3];
        if (points.length == 3) {
            for (int i = 0; i < 3; i++) {
                this.points[i] = points[i];
            }
        } else {
            this.points[0] = new Point2D(0, 0);
            this.points[1] = new Point2D(1, 0);
            this.points[2] = new Point2D(0, 1);
        }
        this.s = calcSTriangle(this.points);
        this.p = calcPTriangle(this.points);
    }

    /**
     * This constructor set default value.
     *
     * @author X-WL
     * @see #Triangle()
     * @see by.xwl.Blinov
     */
    public Triangle() {
        this.points = new Point2D[3];
        this.points[0] = new Point2D(0, 0);
        this.points[1] = new Point2D(1, 0);
        this.points[2] = new Point2D(0, 1);
        this.s = calcSTriangle(this.points);
        this.p = calcPTriangle(this.points);
    }

    /**
     * This method return length line of two point.
     *
     * @param p1 is (@code Point2D)
     * @param p2 is (@code Point2D)
     * @return is (@code double)
     * @author X-WL
     * @see #getLenLine(Point2D, Point2D)
     * @see by.xwl.Blinov
     */
    public static double getLenLine(Point2D p1, Point2D p2) {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return (double) Math.sqrt(dx * dx + dy * dy);
    }

    /**
     * This method calculation perimeter of (@code Array) (@code Point2D).
     *
     * @param points is (@code Point2D)
     * @author X-Wl
     * @see #calcPTriangle(Point2D[])
     * @see by.xwl.Blinov
     */
    public static double calcPTriangle(Point2D[] points) {
        double output = 0;
        for (int i = 0; i < points.length - 1; i++) {
            output += getLenLine(points[i], points[i + 1]);
        }
        output += getLenLine(points[points.length - 1], points[0]);
        return output;
    }

    /**
     * This method calculation S for triangle.
     *
     * @param points is (@code Point2D)
     * @return is (@code double)
     * @author X-WL
     * @see #calcSTriangle(Point2D[])
     * @see by.xwl.Blinov
     */
    public static double calcSTriangle(Point2D[] points) {
        double output = 0;
        double p = calcPTriangle(points);
        double a = getLenLine(points[0], points[1]);
        double b = getLenLine(points[1], points[2]);
        double c = getLenLine(points[2], points[0]);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    /**
     * This method return type triangle.
     *
     * @param triangle is (@code Triangle)
     * @return is (@code TriangleType)
     * @author X-WL
     * @see #getTypeTriangle(Triangle)
     * @see by.xwl.Blinov
     */
    public static ArrayList<TriangleType> getTypeTriangle(Triangle triangle) {
        ArrayList<TriangleType> type = new ArrayList<>();
        double l1 = getLenLine(triangle.points[0], triangle.points[1]);
        double l2 = getLenLine(triangle.points[1], triangle.points[2]);
        double l3 = getLenLine(triangle.points[2], triangle.points[0]);
        if (checkTypeEquilateral(triangle)) {
            type.add(TriangleType.Equilateral);
        } else if (checkTypeIsosceles(triangle)) {
            type.add(TriangleType.Isosceles);
        }
        if (checkTypeRectangular(triangle)) {
            type.add(TriangleType.Rectangular);
        }
        if (type.size() == 0) {
            type.add(TriangleType.Derivative);
        }
        return type;
    }

    /**
     * This method return (@code true) if
     * compatible "Equilateral" type
     *
     * @param triangle is (@code Triangle)
     * @return is (@code boolean)
     * @author X-WL
     * @see #checkTypeEquilateral(Triangle)
     * @see by.xwl.Blinov
     */
    public static boolean checkTypeEquilateral(Triangle triangle) {
        boolean result = false;
        double l1 = getLenLine(triangle.points[0], triangle.points[1]);
        double l2 = getLenLine(triangle.points[1], triangle.points[2]);
        double l3 = getLenLine(triangle.points[2], triangle.points[0]);
        if ((l1 == l2) && (l2 == l3)) {
            result = true;
        }
        return result;
    }

    /**
     * This method return (@code true) if
     * compatible "Isosceles" type
     *
     * @param triangle is (@code Triangle)
     * @return is (@code boolean)
     * @author X-WL
     * @see #checkTypeIsosceles(Triangle)
     * @see by.xwl.Blinov
     */
    public static boolean checkTypeIsosceles(Triangle triangle) {
        boolean result = false;
        double l1 = getLenLine(triangle.points[0], triangle.points[1]);
        double l2 = getLenLine(triangle.points[1], triangle.points[2]);
        double l3 = getLenLine(triangle.points[2], triangle.points[0]);
        if ((l1 == l2) || (l1 == l3) || (l2 == l3)) {
            result = true;
        }
        return result;
    }

    /**
     * This method return (@code true) if
     * compatible "Rectangular" type
     *
     * @param triangle is (@code Triangle)
     * @return is (@code boolean)
     * @author X-WL
     * @see #checkTypeRectangular(Triangle)
     * @see by.xwl.Blinov
     */
    public static boolean checkTypeRectangular(Triangle triangle) {
        boolean result = false;
        double l1 = getLenLine(triangle.points[0], triangle.points[1]);
        double l2 = getLenLine(triangle.points[1], triangle.points[2]);
        double l3 = getLenLine(triangle.points[2], triangle.points[0]);
        if (l1 == Math.sqrt(l2 * l2 + l3 * l3)) {
            result = true;
        }
        if (l2 == Math.sqrt(l3 * l3 + l1 * l1)) {
            result = true;
        }
        if (l3 == Math.sqrt(l1 * l1 + l2 * l2)) {
            result = true;
        }
        return result;
    }

    /**
     * This method return (@code ArrayList) of (@code Triangle)
     * compatible "Equilateral" type
     *
     * @param arr is (@code ArrayList) of (@code Triangle)
     * @return is (@code ArrayList) of (@code Triangle)
     * @author X-WL
     * @see #getEquilateral(ArrayList)
     * @see by.xwl.Blinov
     */
    public static ArrayList<Triangle> getEquilateral(ArrayList<Triangle> arr) {
        ArrayList<Triangle> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<TriangleType> type = getTypeTriangle(arr.get(i));
            for (int j = 0; j < type.size(); j++) {
                if (type.get(j) == TriangleType.Equilateral) {
                    result.add(arr.get(i));
                }
            }
        }
        return result;
    }

    /**
     * This method return (@code ArrayList) of (@code Triangle)
     * compatible "Isosceles" type
     *
     * @param arr is (@code ArrayList) of (@code Triangle)
     * @return is (@code ArrayList) of (@code Triangle)
     * @author X-WL
     * @see #getIsosceles(ArrayList)
     * @see by.xwl.Blinov
     */
    public static ArrayList<Triangle> getIsosceles(ArrayList<Triangle> arr) {
        ArrayList<Triangle> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<TriangleType> type = getTypeTriangle(arr.get(i));
            for (int j = 0; j < type.size(); j++) {
                if (type.get(j) == TriangleType.Isosceles) {
                    result.add(arr.get(i));
                }
            }
        }
        return result;
    }

    /**
     * This method return (@code ArrayList) of (@code Triangle)
     * compatible "Rectangular" type
     *
     * @param arr is (@code ArrayList) of (@code Triangle)
     * @return is (@code ArrayList) of (@code Triangle)
     * @author X-WL
     * @see #getRectangular(ArrayList)
     * @see by.xwl.Blinov
     */
    public static ArrayList<Triangle> getRectangular(ArrayList<Triangle> arr) {
        ArrayList<Triangle> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<TriangleType> type = getTypeTriangle(arr.get(i));
            for (int j = 0; j < type.size(); j++) {
                if (type.get(j) == TriangleType.Rectangular) {
                    result.add(arr.get(i));
                }
            }
        }
        return result;
    }

    /**
     * This method return (@code ArrayList) of (@code Triangle)
     * compatible "Derivative" type
     *
     * @param arr is (@code ArrayList) of (@code Triangle)
     * @return is (@code ArrayList) of (@code Triangle)
     * @author X-WL
     * @see #getDerivative(ArrayList)
     * @see by.xwl.Blinov
     */
    public static ArrayList<Triangle> getDerivative(ArrayList<Triangle> arr) {
        ArrayList<Triangle> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ArrayList<TriangleType> type = getTypeTriangle(arr.get(i));
            for (int j = 0; j < type.size(); j++) {
                if (type.get(j) == TriangleType.Derivative) {
                    result.add(arr.get(i));
                }
            }
        }
        return result;
    }

    /**
     * This method print information, maximum and minimum P.
     *
     * @param arr is (@code ArrayList) (@code Triangle)
     * @author X-WL
     * @see #printInfoMaxMinP(ArrayList)
     * @see by.xwl.Blinov
     */
    public static void printInfoMaxMinP(ArrayList<Triangle> arr) {
        if (arr.size() > 0) {
            System.out.println("Quantity = " + arr.size());
            double maxP = arr.get(0).getP();
            double minP = arr.get(0).getP();
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i).p > maxP) {
                    maxP = arr.get(i).p;
                }
                if (arr.get(i).p < minP) {
                    minP = arr.get(i).p;
                }
                ArrayList<TriangleType> type = getTypeTriangle(arr.get(i));
                System.out.print("\t" + (i + 1) + ". ");
                for (int j = 0; j < type.size(); j++) {
                    System.out.print(type.get(j).toString() + " ");
                }
                System.out.print("Triangle, \n\t");
                for (int j = 0; j < arr.get(i).points.length; j++) {
                    System.out.print(" [" + arr.get(i).points[j].getX() +
                            "," + arr.get(i).points[j].getY() + "], ");
                }
                System.out.print("\n\t P = " + calcPTriangle(arr.get(i).points));
                System.out.println(" S = " + calcSTriangle(arr.get(i).points));
            }
            System.out.println("\tMaximum P = " + maxP);
            System.out.println("\tMinimum P = " + minP);
        } else {
            System.out.println("not found!");
        }
    }
}
