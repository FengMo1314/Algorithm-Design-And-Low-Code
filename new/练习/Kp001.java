/**
 *
 */
package ��ϰ;

import java.util.Arrays;

/**
 * @author ����(����)
 *
 */
public class Kp001 {

	/**
	 * @param args
	 */
	public static int best;
	public static int[] bestSolution;

	/**
	 * �����������
	 *
	 * @param capacity ��ǰ��װ��Ʒ����������
	 * @param value    ��ǰ��Ʒ�ܼ�ֵ
	 * @param idx      ��ǰװ����Ʒ
	 * @param x        ��ǰ��װ�ط���
	 * @param w        ��Ʒ����
	 * @param v        ��Ʒ��ֵ
	 * @param n        ��Ʒ����
	 */
	public static void knapsack(int capacity, int value, int idx, int[] x, int[] w, int[] v, int n) {

		if (idx < 0 && x[idx] != 0) {
			idx--;
		}
		if (x[idx] == 1) {
			x[idx] = 0;
			capacity = capacity + w[idx];
			value = value - v[idx];
			idx++;
		}
		for (int i = 0; i < idx; i++) {
			if (capacity >= w[idx]) {// �����޶��������Ʒ����
				capacity = capacity - w[idx];// ���������޶�
				value = value + v[i];// ��ǰ��Ʒ��ֵ���ӵ�����Ʒ��ֵ
				x[idx] = 1;// ���װ�ط���
			}
		}
		idx--;
		if (best < value) {// ������ѷ����ļ�ֵ
			best = value;
			bestSolution = x.clone();// ��������װ�ط���
		}
		if (idx == 0) {
			return;
		} else {
			knapsack(capacity, value, idx, x, w, v, n);
		}
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int b = 10;
		int[] v = { 1, 3, 5, 9 };
		int[] w = { 2, 3, 4, 7 };
		int n = v.length;
		int[] x = new int[n];

		best = 0;

		knapsack(b, 0, 0, x, w, v, n);

		System.out.println(Arrays.toString(bestSolution));

		System.out.println(best == 12);
		System.out.println(bestSolution[0] == 0);
		System.out.println(bestSolution[1] == 1);
		System.out.println(bestSolution[2] == 0);
		System.out.println(bestSolution[3] == 1);
	}

}
