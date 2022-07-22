/**
 * 
 */
package f20220716课堂实践分治策略3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 柳和(本地)
 *
 */
class PointXComparator implements Comparator<Point> {

	@Override
	public int compare(Point pointA, Point pointB) {
		// todo: 比较两点的 X 坐标
		return pointA.x - pointB.x;
	}

}

class PointYComparator implements Comparator<Point> {

	@Override
	public int compare(Point pointA, Point pointB) {
		// todo: 比较两点的 Y 坐标
		return pointA.y - pointB.y;
	}

}

public class T4 {

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
			return bruteForceSmallestDistance(pointsByX, start, end);
		}

		int mid = start + (end - start) / 2;
//	        Point midPoint = new Point(pointsByX[mid].x, pointsByX[mid].y);//按X为准的中间点坐标

		// todo: 分治策略求左右两平面及中间地带的最近对距离
		float distLeft = smallestDistance(pointsByY, pointsByX, 0, mid);
		float distRight = smallestDistance(pointsByY, pointsByX, mid, end);
		float delta = Math.min(distLeft, distRight);
		return delta;

	}

	public static float bruteForceSmallestDistance(Point[] points, int start, int end) {
		float smallest = Float.MAX_VALUE;
		// todo: 计算指定范围内的每一对点的距离并返回最小值
		for (int i = start; i <= end; i++) {
			for (int j = i + 1; j <= end; j++) {
				float temp = dist(points[i], points[j]);
				if (temp < smallest) {
					smallest = temp;
				}
			}
		}
		return smallest;
	}

	public static float dist(Point p1, Point p2) {
		// todo: 计算两点间距离
		double a = p1.x - p2.x;
		double b = p1.y - p2.y;
		return (float) Math.sqrt(a * a + b * b);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Point[] points = new Point[] { new Point(2, 3), new Point(12, 30), new Point(40, 50), new Point(5, 1),
				new Point(6, 2), new Point(3, 5) };

		float dist = smallestDistance(points);
		System.out.println(Float.compare(dist, 1.4142135f) == 0);

	}

}
