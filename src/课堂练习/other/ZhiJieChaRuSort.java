/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
public class ZhiJieChaRuSort {
	/*
	 * ֱ�Ӳ������򷽷�ʵ����������Ԫ������
	 */
	public static void insertSort(int a[]) {
		//n��Ԫ�ؽ���n-1�β������,i��ʾǰ��i���Ѿ�����
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			if (a[i] < a[i - 1]) {
				/*
				 * ��ǰa[i]Ԫ��Ӧ�����Ѿ��ź���������м�
				 */
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					//��a[i]Ӧ�ú��ʵ�λ��,�ҵ�����С�ĵ�һ��Ԫ��λ��
					a[j + 1] = a[j];//Ԫ����������ƶ�
					}
				//j��ǰ���Ǳ�a[i]С�ĵ�һ��Ԫ�ص��±�
					a[j + 1] = temp;
				}
			}
	}

}
