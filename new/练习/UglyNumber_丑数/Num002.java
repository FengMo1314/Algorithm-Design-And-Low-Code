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
public class Num002 {

	/**
	 * @param args
	 */
	// todo: ʹ�������㷨���õ��� n ������
	public static int getUglyNum(int nth) {
		int i = 0, j = 0;
		List<Integer> list = new ArrayList<>();
		while (i < nth) {
			j++;// ��Ȼ���ۼӲ���
			if (Num001.isUglyNum(j)) {
				list.add(j);
				++i;// i��nthΪ���ԣ�
			}
		}
		return list.get(nth - 1);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		System.out.println(getUglyNum(1) == 1);
		System.out.println(getUglyNum(2) == 2);
		System.out.println(getUglyNum(8) == 9);
		System.out.println(getUglyNum(11) == 15);
		System.out.println(getUglyNum(150) == 5832);
	}

}
