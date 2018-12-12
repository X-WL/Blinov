package by.xwl.Blinov.Chapter3;

import by.xwl.IO;
import by.xwl.Information;
import by.xwl.Point2D;

import java.util.ArrayList;

/**
 * This class (@code Task_3_B7 implementation Task Chapter 3 - B7.
 * @author X-WL
 * @see by.xwl.Blinov.Chapter3
 */
public class Task_3_B7 {
    public static void main(String[] args) {
        final int COL_TRIANGLE = 5;
        boolean IS_ROUND = true;
        ArrayList<Triangle> arr = new ArrayList<>();
        double x = 0;
        double y = 0;
        Point2D[] points = new Point2D[3];
        for (int i = 0; i < COL_TRIANGLE; i++) {
            for (int j = 0; j < 3; j++) {
                if (IS_ROUND) {
                    x = Math.round(Math.random() * 10);
                    y = Math.round(Math.random() * 10);
                } else {
                    x = Math.random() * 10;
                    y = Math.random() * 10;
                }
                points[j] = new Point2D(x, y);
            }
            arr.add(new Triangle(points));
        }
        ArrayList<Triangle> triEquilateral = Triangle.getEquilateral(arr);
        ArrayList<Triangle> triIsosceles = Triangle.getIsosceles(arr);
        ArrayList<Triangle> triRectangular = Triangle.getRectangular(arr);
        ArrayList<Triangle> triDerivative = Triangle.getDerivative(arr);
        System.out.print("Equilateral Triangle ");
        Triangle.printInfoMaxMinP(triEquilateral);
        System.out.print("Isosceles Triangle ");
        Triangle.printInfoMaxMinP(triIsosceles);
        System.out.print("Rectangular Triangle ");
        Triangle.printInfoMaxMinP(triRectangular);
        System.out.print("Derivative Triangle ");
        Triangle.printInfoMaxMinP(triDerivative);

        Information info = new Information("10.12.2018, 18:55");
        info.printInformation();
        IO.waitingPress();
    }
}
