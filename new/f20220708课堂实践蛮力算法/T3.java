/**
 *
 */
package f20220708����ʵ�������㷨;

/**
 * @author ����(����)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	public long mi(int a, int n) {
		long rest = 1;
		for (int i = 0; i < n; i++) {
			rest = rest * a;
		}
		return rest;
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(new T3().mi(2, 3));
//		new T3().mi(2,3);
//
	}

}
