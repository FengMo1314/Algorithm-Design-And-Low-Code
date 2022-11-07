/**
 *
 */
package 练习.Recently_最近对;

import java.util.Arrays;

/**
 * @author 柳和(本地)
 *
 */
public class Closest005 {

	/**
	 * @param args
	 */
	public static float smallestDistance(Point[] points, int start, int end) {

		if ((end - start) <= 3) {
			return Closest002.bruteForceSmallestDistance(points, start, end);
		}

		// todo: 求左右两半平面内的最近对距离
		int mild = (end - start) / 2;
		float left = smallestDistance(points, start, mild);
		float right = smallestDistance(points, mild + 1, end);
		return Math.min(left, right);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Point[] points = new Point[] { new Point(2, 3), new Point(12, 30), new Point(40, 50), new Point(5, 1),
				new Point(6, 2), new Point(3, 5) };

		Arrays.sort(points, new PointXComparator());
		float delta = smallestDistance(points, 0, 5);
		System.out.println(Float.compare(delta, 2.236068f) == 0);

		delta = smallestDistance(points, 2, 5);
		System.out.println(Float.compare(delta, 1.4142135f) == 0);

	}

}
