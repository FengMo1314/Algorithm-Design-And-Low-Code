/**
 *
 */
package ��ϰ;

/**
 * @author ����(����)
 *
 */
public class Sack002 {

	/**
	 * @param args
	 */
	/**
	 * ���㱳���ڿ�������Ʒ������ֵ
	 *
	 * @param b ���������������
	 * @param w ��Ʒ����
	 * @param v ��Ʒ��ֵ
	 * @param n ��Ʒ������
	 * @return ��������Ʒ������ֵ
	 */
	// todo: �ö�̬�滮���㱳���ڿ�������Ʒ������ֵ
	public static int knapsack(int b, int[] w, int[] v, int n) {
		int[][] a = new int[n + 1][b + 1];// ������̬�滮��.����v[i][j]��Ӧ�ڣ���ǰ��i����Ʒ��ѡ�����ҵ�ǰ����������Ϊjʱ�������ܵõ�������ֵ
		// �̬�滮����ǰ��i����Ʒ��ѡ�����ҵ�ǰ����������Ϊj��
		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < b + 1; j++) {
				if (i == 0 || j == 0) {
					a[i][j] = 0;// ��ʼ���߽�
				} else {
					if (j < w[i - 1]) {
						a[i][j] = a[i - 1][j];
					} else {
						a[i][j] = Math.max(a[i - 1][j], a[i - 1][j - w[i - 1]] + v[i - 1]);
					}
				}
			}
		}
		return a[n][b];
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		System.out.println(knapsack(b, w, v, n) == 12);
	}

}
