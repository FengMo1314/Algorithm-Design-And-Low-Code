/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
public class XiErSort {
	/*
	 * ϣ������
	 */
	public static void shellSort(int[] a) {
		int h = 1;// ���������hֵ

		while (h <= a.length / 3) {
			// ʹ��Knuth��������
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < a.length; i++) {
				if (a[i] < a[i - h]) {
					int tmp = a[i];
					int j = i - h;
					while (j >= 0 && a[j] > tmp) {
						a[j + h] = a[j];
						j -= h;
					}
					a[j + h] = tmp;
				}
			}
			// �������һ��hֵ
			h = (h - 1) / 3;
		}
	}
}
