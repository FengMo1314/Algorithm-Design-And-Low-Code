/**
 * 
 */
package 练习;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Closest007 {

	/**
	 * @param args
	 */
	 public static float stripClosest(Point[] strip, float delta) {
	        float min = delta;
	        int size = strip.length;

	        // todo: 求中间地带最近对
	        

	        return min;
	    }
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
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
	        float delta = 2.236068f;
	        Point[] strip = Closest006.getStrip(midPoint, points, delta);

	        float dist = stripClosest(strip, delta);
	        System.out.println(Float.compare(dist, 1.4142135f) == 0);
	}

}
