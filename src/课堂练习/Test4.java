/**
 *
 */
package ������ϰ;

import random_�����������.RandomGenerator;
import stopWatch_��ʱ��.StopWatch;

/**
 * @author ����(����)
 *
 */
public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StopWatch s = new StopWatch();
		s.start();
		int a[] = RandomGenerator.uniformInts(100000000);
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
			// �������һ��hֵ(h - 1)/ 3;h =100%
			h = (h - 1) / 3;
		}
		s.stop();
//		int sum = 0;
//		for (int j = 0; j < a.length; j++) {
//			if (sum % 10 == 0) {
//				System.out.println();
//			}
//			System.out.print(a[j] + ",");
//			sum++;
//		}

		System.out.println(s.getTime());
	}
}
