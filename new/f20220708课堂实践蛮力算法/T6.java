/**
 *
 */
package f20220708����ʵ�������㷨;

/**
 * @author ����(����)
 *
 */
public class T6 {

	/**
	 * @param args
	 */
	public int jiaohuan(int a[]) {
		int sum = 0;
		int black = a[0];
		int white = a[1];
		for (int i = 0; i <= a.length / 2; i++) {
			for (int j = a.length - 1; j >= a.length / 2; j--) {
				if (a[i] == white && a[j] == black) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					sum++;
				}
			}
		}
		System.out.print("[");
		for (int element : a) {
			System.out.print(element + ",");
		}
		System.out.println("]");
		return sum;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int a[] = { 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0 };
		System.out.println(new T6().jiaohuan(a));
	}

}
