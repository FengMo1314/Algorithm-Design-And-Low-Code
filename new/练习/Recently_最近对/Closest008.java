/**
 *
 */
package 练习.Recently_最近对;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Closest008 {

	/**
	 * @param args
	 */
	public static float smallestDistance(Point[] points) {
		Point[] copyPoints = new Point[points.length];
		System.arraycopy(points, 0, copyPoints, 0, points.length);
		Arrays.sort(points, new PointXComparator());
		Arrays.sort(copyPoints, new PointYComparator());
		return smallestDistance(points, copyPoints, 0, points.length - 1);
	}

	public static float smallestDistance(Point[] pointsByX, Point[] pointsByY, int start, int end) {

		if (end - start <= 3) {
			return Closest002.bruteForceSmallestDistance(pointsByX, start, end);
		}

		int mid = start + (end - start) / 2;
//	        Point midPoint = new Point(pointsByX[mid].x, pointsByX[mid].y);//按X为准的中间点坐标

		// todo: 分治策略求左右两平面及中间地带的最近对距离
		float distLeft = smallestDistance(pointsByY, pointsByX, 0, mid);
		float distRight = smallestDistance(pointsByY, pointsByX, mid, end);
		float delta = Math.min(distLeft, distRight);
		return delta;

	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Point[] points = new Point[] { new Point(2, 3), new Point(12, 30), new Point(40, 50), new Point(5, 1),
				new Point(6, 2), new Point(3, 5) };

		float dist = smallestDistance(points);
		System.out.println(Float.compare(dist, 1.4142135f) == 0);

	}

}
