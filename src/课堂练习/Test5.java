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
public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StopWatch s = new StopWatch();
		s.start();
		int a[] = RandomGenerator.uniformInts(100000000);
//

//
		s.stop();
		int sum = 0;
		for (int element : a) {
			if (sum % 10 == 0) {
				System.out.println();
			}
			System.out.print(element + ",");
			sum++;
		}
		System.out.println(s.getTime());
	}
	/*
	 * ������
	 */
	public static void heapSort(int[] a){
		//��������
		 heapinsert(a);
		int size = a.length;
		while(size > 1){//�̶����ֵ
		swap(a,0, size-1);
		size--;//��������
		heapify(a,0,size);
	}
}

	// ��������(ͨ���²����������)
	public static void heapinsert(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// ��ǰ���������
			int currentIndex = i;
			// ���������
			int fatherlndex = (currentIndex - 1) / 2;
			/* �統ǰ����ֵ�����丸����ֵ���򽻻�ֵ�����ҽ�����ָ�򸸽�㣬Ȼ��� ��������ĸ����ֵ�Ƚϣ�ֱ�������ڸ���㣬���˳�ѭ�� */
			while (a[currentIndex] > a[fatherlndex]) {
				// ������ǰ����븸����ֵ
				swap(a, currentIndex, fatherlndex);
				// ����ǰ����ָ������
				currentIndex = fatherlndex;
				// ���¼��㵱ǰ�����ĸ�����
				fatherlndex = (currentIndex - 1) / 2;
			}
		}
	}

	// ��ʣ���������ɴ����(ͨ�����˵����½�)
	public static void heapify(int[] a, int index, int size) {
		int left = 2 * index + 1;
		int right = 2 * index + 2;
		while (left < size) {
			int largestIndex;
			// �жϺ����нϴ��ֵ������(Ҫȷ���Һ�����size֮��)
			if (a[left] < a[right] && right < size) {
				largestIndex = right;
			} else {
				largestIndex = left;
			}
			// �Ƚϸ�����ֵ�뺢���нϴ��ֵ����ȷ�����ֵ������
			if (a[index] > a[largestIndex]) {
				largestIndex = index;
			}
			int largestlndex = 0;
			// �����������������ֵ�����������Ⱦ��Ǵ�����ˣ����˳�ѭ��
			if (index ==largestlndex) {
				break;
			}
			// ����㲻�����ֵ���뺢���нϴ��ֵ����
			swap(a, largestlndex, index);
			// ������ָ�����нϴ��ֵ������
			index = largestlndex;
			// ���¼��㽻��֮��ĺ��ӵ�����
			left = 2 * index + 1;
			right = 2 * index + 2;
		}
	}

	// ��������������Ԫ�ص�ֵ
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
