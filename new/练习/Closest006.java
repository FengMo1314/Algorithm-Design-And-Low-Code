/**
 * 
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Closest006 {

	/**
	 * @param args
	 */
	 public static Point[] getStrip(Point midPoint, Point[] pointsByY, float delta) {

	        // todo: ���м�ش��ĵ㼯
	        Point[] strip = new Point[pointsByY.length];
	        int j = 0;
	        for (int i = 0; i < pointsByY.length; i++) {
	        	strip[i]=
	        }

	        Point[] copyied = new Point[j];
	        System.arraycopy(strip, 0, copyied, 0, j);
	        return copyied;
	    }

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  Point[] points = new Point[]{
	                new Point(2, 3),
	                new Point(12, 30),
	                new Point(40, 50),
	                new Point(5, 1),
	                new Point(6, 2),
	                new Point(3, 5)
	        };

	        Point midPoint = new Point(5, 1);
	        Arrays.sort(points, new PointYComparator());
	        Point[] strip = getStrip(midPoint, points, 2.236068f);
	        System.out.println(strip[0].x == 5);
	        System.out.println(strip[1].x == 6);
	}

}
