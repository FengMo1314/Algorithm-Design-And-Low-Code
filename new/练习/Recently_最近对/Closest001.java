/**
 * 
 */
package ��ϰ.Recently_�����;

import ��ϰ.Point;

/**
 * @author ����(����)
 *
 */
public class Closest001 {

	/**
	 * @param args
	 */
	public static float dist(Point p1, Point p2) {
		// todo: ������������
		double a = p1.x - p2.x;
		double b = p1.y - p2.y;
		return (float) Math.sqrt(a * a + b * b);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Point p1 = new Point(1, 1);
		Point p2 = new Point(4, 5);
		float expected = 5;
		float result = dist(p1, p2);
		System.out.println(result == expected);
	}

}
