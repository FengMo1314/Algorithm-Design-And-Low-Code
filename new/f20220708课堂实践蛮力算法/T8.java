/**
 *
 */
package f20220708����ʵ�������㷨;

/**
 * @author ����(����)
 *
 */
public class T8 {

	/**
	 * @param args
	 */
	// ���������͹�����⣬���ص㼯����͹����εĵ㼯��
	public static Point[] getConvexPoint(Point[] A) {
		Point[] result = new Point[A.length];
		int len = 0; // ���ڼ������շ��ؽ������͹���е�ĸ���
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				if (j == i) // ��ȥѡ����Ϊȷ��ֱ�ߵĵ�һ����
					continue;

				int[] judge = new int[A.length]; // ��ŵ㵽ֱ�߾�����ʹ���жϹ�ʽ�Ľ��

				for (int k = 0; k < A.length; k++) {
					int a = A[j].getY() - A[i].getY();
					int b = A[i].getX() - A[j].getX();
					int c = (A[i].getX()) * (A[j].getY()) - (A[i].getY()) * (A[j].getX());

					judge[k] = a * (A[k].getX()) + b * (A[k].getY()) - c; // ���ݹ�ʽ��������жϽ��
				}

				if (JudgeArray(judge)) { // ��������ֱ�ߵ�һ��,����Ӧ��A[i]��͹���еĵ�
					result[len++] = A[i];
					break;
				}
			}
		}
		Point[] result1 = new Point[len];
		for (int m = 0; m < len; m++)
			result1[m] = result[m];
		return result1;
	}

	// �ж�������Ԫ���Ƿ�ȫ�����ڵ���0����С�ڵ���0��������򷵻�true�����򷵻�false
	public static boolean JudgeArray(int[] Array) {
		boolean judge = false;
		int len1 = 0, len2 = 0;

		for (int element : Array) {
			if (element >= 0)
				len1++;
		}
		for (int element : Array) {
			if (element <= 0)
				len2++;
		}

		if (len1 == Array.length || len2 == Array.length)
			judge = true;
		return judge;
	}

	public static void main(String[] args) {

		Point[] A = new Point[9];
//		for(int i=0;i<A.length;i++) {
//			A[i].setLeft(sc.nextLine());
//			A[i].setX(sc.nextInt());
//			A[i].setDou(sc.nextLine());
//			A[i].setY(sc.nextInt());
//			A[i].setRight(sc.nextLine());
//			A[i].setDou(sc.nextLine());
//			String a=A[i].getLeft();
//			int b=A[i].getX();
//			String c=A[i].getDou();
//			int d=A[i].getY();
//			String e=A[i].getRight();
//			String f=A[i].getDou();
//			A[i]=new Point (b,d);
//		}
		A[0] = new Point(1, 1);
		A[1] = new Point(1, 2);
		A[2] = new Point(2, 3);
		A[3] = new Point(3, 2);
		A[4] = new Point(3, 6);
		A[5] = new Point(4, 1);
		A[6] = new Point(5, 4);
		A[7] = new Point(5, 5);
		A[8] = new Point(6, 2);
		Point[] result = getConvexPoint(A);
		System.out.println("����A������͹���ĵ㼯Ϊ��");
		for (Point element : result)
			System.out.println(element.toString());
	}

}
