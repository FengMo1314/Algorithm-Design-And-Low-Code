/**
 *
 */
package ������ϰ;

import stopWatch_��ʱ��.StopWatch;

/**
 * @author ����(����)
 *
 */
public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StopWatch s = new StopWatch();
		s.start();
//		int a[] = RandomGenerator.uniformInts(100000000);
	}

	// �Զ����¹鲢��������㷨
	public static void mergeSort(int low, int high, int a[]) {
		if (low < high) {
			// �ֽ�
			int mid = (low + high) / 2;
			// �ݹ�ض��������
			mergeSort(low, mid, a);
			// �ݹ�ض��ұ�����
			mergeSort(mid + 1, high, a);
			merge(low, mid, high, a);// �������������кϲ�Ϊһ����������һ
		}
	}

	// �ϲ���������
	public static void merge(int low, int mid, int high, int a[]) {
		// ����ת������
		int b[] = new int[a.length];
		int f = low, s = mid + 1, p = low;
		// fΪ��һ������������sΪ�ڶ�������������pΪb��������
		while (f <= mid && s <= high) {
			// ����������Ԫ����ֵС��һ������b����
			if (a[f] <= a[s]) {
				b[p] = a[f];
				f++;
			} else {
				b[p] = a[s];
				s++;
			}
			p++;
		}

		if (f == mid + 1) {
			/* ����һ�������е�Ԫ��ȫ���洢��ȥ�ˣ���ô���ڶ��������е�ʣ��Ԫ��ȫ������b���� */
			for (; s <= high && p <= high; p++, s++) {
				b[p] = a[s];
			}
		} else {
			// ���򽫵�һ�������е�Ԫ��ȫ������b����
			for (; f <= mid && p <= high; p++, f++) {
				b[p] = a[f];
			}
		}
		for (int i = low; i <= high; i++)
			a[i] = b[i];
	}

}
