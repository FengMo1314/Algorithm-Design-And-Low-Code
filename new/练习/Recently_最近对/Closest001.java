/**
 * 
 */
package 练习.Recently_最近对;

import 练习.Point;

/**
 * @author 柳和(本地)
 *
 */
public class Closest001 {

	/**
	 * @param args
	 */
	public static float dist(Point p1, Point p2) {
		// todo: 计算两点间距离
		double a = p1.x - p2.x;
		double b = p1.y - p2.y;
		return (float) Math.sqrt(a * a + b * b);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Point p1 = new Point(1, 1);
		Point p2 = new Point(4, 5);
		float expected = 5;
		float result = dist(p1, p2);
		System.out.println(result == expected);
	}

}
