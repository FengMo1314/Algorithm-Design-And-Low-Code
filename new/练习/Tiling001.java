/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Tiling001 {

	/**
	 * @param args
	 */
	// todo: ʹ�ö�̬�滮�����ש���̷�
	private static int ways(int n) {
		if (n == 1 || n == 2)
			return n;
		return ways(n - 1) + ways(n - 2);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(ways(4) == 5);
		System.out.println(ways(3) == 3);
	}

}
