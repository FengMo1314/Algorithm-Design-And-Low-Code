/**
 *
 */
package ��ϰ;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author ����(����)
 *
 */
public class Loading001 {

	/**
	 * @param args
	 */
	/**
	 * ����װ�ڷ���
	 */
	public static int[] bestSolution;
	/**
	 * ����װ�ڷ����е�һ�Ҵ�����С��ʣ���װ������
	 */
	public static int best;

	public static void loading(int[] x, int[] w, int n, int c1, int c2) {// ��ǿ���뽡׳��
		int total = 0;
		for (int i = 0; i < n; i++) {
			total += w[i];
		}

		if (total > c1 + c2) {
			System.out.println("No solutions");
			return;
		}

		best = c1;
		loading(c1, 0, x, w, n);

		int c2Total = 0;
		for (int i = 0; i < n; i++) {
			if (bestSolution[i] == 0) {
				c2Total += w[i];
			}
		}

		if (c2Total > c2) {
			System.out.println("No solutions");
		} else {
			System.out.println(c1 - best);
			System.out.println(Arrays.toString(bestSolution));
		}
	}

	/**
	 * ������һ�Ҵ����ſ�װ�ļ�װ�䷽��
	 *
	 * @param c1Capacity ��һ�Ҵ��ĵ�ǰ��������
	 * @param idx        ��ǰװ�صļ�װ��
	 * @param w          ����װ������
	 * @param x          ��ǰ��װ�ط���
	 * @param n          ��װ������
	 */
	// todo: ������һ�Ҵ����ſ�װ�ļ�װ�䷽��
	public static void loading(int c1Capacity, int idx, int[] x, int[] w, int n) {

		// todo: װ�ط���

		// todo: ��¼���ŷ���

		// todo: ����

		// todo: ����ʣ�෽��
		for (int i = 1; i >= 0; i++) {
			if (i == 1) {

				if (is) {
					c1Capacity -= w[idx];
					x[idx] = 1;
				}
			} else {

			}
		}

	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int[] w = { 90, 80, 40, 30, 20, 12, 10 };
		w = Arrays.stream(w).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray();
		int n = w.length;
		int[] x = new int[n];
		int c1 = 152;
		int c2 = 130;

		loading(x, w, n, c1, c2);

		System.out.println(bestSolution[0] == 1);
		System.out.println(bestSolution[1] == 0);
		System.out.println(bestSolution[2] == 1);
		System.out.println(bestSolution[3] == 0);
		System.out.println(bestSolution[4] == 0);
		System.out.println(bestSolution[5] == 1);
		System.out.println(bestSolution[6] == 1);
	}

}
