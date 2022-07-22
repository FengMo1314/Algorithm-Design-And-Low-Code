/**
 * 
 */
package ��ϰ.Recently_�����;

import java.lang.reflect.Array;
import java.util.Arrays;

import sort_���򷽷�.MaoPaoSort;
import ��ϰ.Point;

/**
 * @author ����(����)
 *
 */
public class Closest004 {

	/**
	 * @param args
	 */
	 public static Point midPoint(Point[] points, int start, int end) {
	        int mid = start + (end - start) / 2;
	        return points[mid];
	    }

	    public static Point getMidXPoint(Point[] points, int start, int end) {
	        // todo: �� X �����������λ��
	    	  int mid = start + (end - start) / 2;
	    	  Arrays.sort(points,new PointXComparator());
		        return points[mid];
	    }

	    public static Point getMidYPoint(Point[] points, int start, int end) {
	        // todo: �� Y �����������λ��
	    	  int mid = start + (end - start) / 2;
	    	  Arrays.sort(points,new PointYComparator());
	    	  return points[mid];
	    }
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		  Point[] points = new Point[]{
	                new Point(2, 3),
	                new Point(12, 30),
	                new Point(40, 50),
	                new Point(5, 1),
	                new Point(12, 10),
	                new Point(3, 4)

	        };

	        Point midXPoint = getMidXPoint(points, 0, 5);
	        System.out.println(midXPoint.x == 5);

	        midXPoint = getMidXPoint(points, 3, 5);
	        System.out.println(midXPoint.x == 12);

	        midXPoint = getMidYPoint(points, 0, 5);
	        System.out.println(midXPoint.x == 3);

	        midXPoint = getMidYPoint(points, 3, 5);
	        System.out.println(midXPoint.y == 30);

	}

}
