/**
 * 
 */
package ������ϰ.other;

/**
 * @author ����(����)
 *
 */
public class ZheBanChaRuSort {
	/*
	 * �۰��������ʵ����������Ԫ��
	 */
	public static void binaryInsertSort(int[] a) {
		for(int i=1;i<a.length;i++) {
			if(a[i]<a[i-1]) {
				int temp=a[i];//����i������Ԫ��ֵ
				int low=0;//��¼������Χ����߽�
				int high=i-1;//��¼������Χ���б߽�
				while(low<=high) {
					int mid=(low+high)/2;//��¼�м�λ��
					//�Ƚ��м�λ�����ݺ�i�����ݴ�С,����С������Χ
					if(a[mid]<temp) {
						low=mid-1;
					}else {
						high=mid-1;
					}
				}
				//��low~i��������������ƶ�һλ
				for(int j=i ;j>low;j--) {
					a[j]=a[j-1];
				}
				a[low]=temp;
			}
		}
	}
}
