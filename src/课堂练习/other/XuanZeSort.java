/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
public class XuanZeSort {
	public XuanZeSort(double zu[]) {
		int i, j;
		for (i = 0; i < zu.length - 1; i++) {// �����ѭ����ʾ������
			int first = i;// Ĭ����������һ��Ϊi��
			for (j = first + 1; j < zu.length; j++) {// j��ֵΪ�������ĵڶ���Ԫ�أ�ע���±꣩��
				if (zu[first] > zu[j]) {// �ҳ���С��
					first = j;
				}
			} // firstΪ��Сֵ���±�
			double temp = 0;
			if (first != i) {// ��zu[first]��������������һ�����Ӷ�ʹ��������������1�����������ȼ���һ
				temp = zu[i];
				zu[i] = zu[first];
				zu[first] = temp;
			}
		}
	}

}
