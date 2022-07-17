/**
 * 
 */
package ��ϰ;

import java.util.Arrays;
import java.util.Comparator;


/**
 * @author ����(����)
 *
 */
class PointXComparator implements Comparator<Point> {

    @Override
    public int compare(Point pointA, Point pointB) {
        // todo: �Ƚ������ X ����
    	return pointA.x-pointB.x;
    }

}

class PointYComparator implements Comparator<Point> {

    @Override
    public int compare(Point pointA, Point pointB) {
        // todo: �Ƚ������ Y ����
    	return pointA.y-pointB.y;
    }

}

public class Closest003 {

    public static void main(String[] args) {
        Point[] points = new Point[]{
                new Point(2, 3),
                new Point(12, 30),
                new Point(40, 50),
                new Point(5, 1),
                new Point(12, 10),
                new Point(3, 4)

        };

        Arrays.sort(points, new PointXComparator());

        System.out.println(points[0].x == 2);
        System.out.println(points[2].x == 5);
        System.out.println(points[5].x == 40);

        Arrays.sort(points, new PointYComparator());

        System.out.println(points[0].x == 5);
        System.out.println(points[2].x == 3);
        System.out.println(points[3].x == 12);
        System.out.println(points[5].x == 40);

    }
}