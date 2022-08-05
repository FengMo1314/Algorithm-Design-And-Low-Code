/**
 *
 */
package ��ϰ.UglyNumber_����;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����(����)
 *
 */
public class Num003 {

	/**
	 * @param args
	 */
	/*
	 * �������� ��1,2,3,4,5,6,8,9,10,12,15��..... �ֶ��У� 2�������У�2,4,6,8,10,12,16,18,20,24,30
	 * 3�������У�3,6,9,12,15,18,24,27,30,36,45 5�������У�5,10,15,20,25,30,40,45,50,60,75
	 * ÿ��������ȡ�ֶ����е���λ���֣�����3������С����ӵ������ֻ�б���ȡ���ö����������������в��� �磺��һ����ȡ��(2,3,5),����(2)
	 * �ڶ�����ȡ��(4,3,5),����(3) ��������ȡ��(4,6,5),����(4) ���Ĵ���ȡ��(6,6,5),����(5)
	 * �������ȡ��(6,6,10),����(6) ��������ȡ��(8,9,10),����(8) ���ߴ���ȡ��(10,9,10),����(9)
	 * �ڰ˴���ȡ��(10,12,10),����(10) �ھŴ���ȡ��(12,12,15),����(12)
	 */
	// todo: ʹ�ö�̬�滮���õ��� n ������
	public static int getUglyNum(int nth) {
		if (nth <= 0) {
			return 0;
		}
		List<Integer> list = new ArrayList<>();
		list.add(1);
		int m2 = 0, m3 = 0, m5 = 0, i2 = 0, i3 = 0, i5 = 0, min = 0;
		while (list.size() < nth) {
			m2 = list.get(i2) * 2;// ��2��ʼ����
			m3 = list.get(i3) * 3;// ��3��ʼ����
			m5 = list.get(i5) * 5;// ��5 ��ʼ����
			min = Math.min(m2, Math.min(m3, m5));// �������������п�ͷ��С����Ϊ��������е���
			list.add(min);// ������ӽ�����
			if (min == m2) {
				i2++;// �����Ը�����2��ʼ�Ķ��п�ͷ
			}
			if (min == m3) {
				i3++;// �����Ը�����3��ʼ�Ķ��п�ͷ
			}
			if (min == m5) {
				i5++;// �����Ը�����5��ʼ�Ķ��п�ͷ
			}
		}
		return list.get(nth - 1);// �±��0��ʼ�����Ե�nth���������±�Ϊnth-1��
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(getUglyNum(1) == 1);
		System.out.println(getUglyNum(2) == 2);
		System.out.println(getUglyNum(8) == 9);
		System.out.println(getUglyNum(11) == 15);
		System.out.println(getUglyNum(150) == 5832);
//		System.out.println(getUglyNum(20));
	}

}
