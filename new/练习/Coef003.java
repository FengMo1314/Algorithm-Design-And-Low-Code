/**
 * 
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Coef003 {

	/**
	 * @param args
	 */
	// todo: �ö�̬�滮�� k ���ϵ�����Ż��ռ临�Ӷ�
	private static int binomialCoefficient(int n, int k) {
		int[] memo = new int[k + 1];
	
		return memo[k];
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(binomialCoefficient(2, 3) == 0);
		System.out.println(binomialCoefficient(2, 0) == 1);
		System.out.println(binomialCoefficient(2, 2) == 1);
		System.out.println(binomialCoefficient(5, 2) == 10);
		System.out.println(binomialCoefficient(10, 5) == 252);
	}

}
