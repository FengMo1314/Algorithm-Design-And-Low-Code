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
public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		StopWatch s = new StopWatch();
		s.start();
		int zu[] =RandomGenerator.uniformInts(100);
		int i, j;
		for (i = 0; i < zu.length - 1; i++) {// �����ѭ����ʾ������
			int first = i;// Ĭ����������һ��Ϊi��
			for (j = first + 1; j < zu.length; j++) {// j��ֵΪ�������ĵڶ���Ԫ�أ�ע���±꣩��
				if (zu[first] > zu[j]) {// �ҳ���С��
					first = j;
				}
			} // firstΪ��Сֵ���±�
			int temp = 0;
			if (first != i) {// ��zu[first]��������������һ�����Ӷ�ʹ��������������1�����������ȼ���һ
				temp = zu[i];
				zu[i] = zu[first];
				zu[first] = temp;
			}
		}
		int sum = 0;
		for (j = 0; j < zu.length; j++) {
			if (sum % 10 == 0) {
				System.out.println();
			}
			System.out.print(zu[j] + ",");
			sum++;
		}
		s.stop();
		System.out.println(s.getTime());
	}

}
