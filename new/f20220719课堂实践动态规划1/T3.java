/**
 *
 */
package f20220719����ʵ����̬�滮1;

/**
 * @author ����(����)
 *
 */
public class T3 {

	/**
	 * @param args
	 */
	private static int ways(int n) {
		if (n == 1 || n == 2)
			return n;
		return ways(n - 1) + ways(n - 2);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ways(3);
	}

}
