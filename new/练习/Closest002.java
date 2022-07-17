/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Closest002 {

	/**
	 * @param args
	 */
	public static float bruteForceSmallestDistance(Point[] points, int start, int end) {
		float smallest = Float.MAX_VALUE;
		// todo: ����ָ����Χ�ڵ�ÿһ�Ե�ľ��벢������Сֵ
		for (int i = start; i <= end; i++) {
			for (int j = i + 1; j <= end; j++) {
				float temp = Closest001.dist(points[i], points[j]);
				if (temp < smallest) {
					smallest = temp;
				}
			}
		}
		return smallest;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Point[] points = new Point[] { new Point(2, 3), new Point(12, 30), new Point(40, 50), new Point(5, 1),
				new Point(6, 2), new Point(3, 5) };
		float dist = bruteForceSmallestDistance(points, 0, 5);
		System.out.println(Float.compare(dist, 1.4142135f) == 0);
		dist = bruteForceSmallestDistance(points, 1, 2);
		System.out.println(Float.compare(dist, 34.4093f) == 0);
	}

}
