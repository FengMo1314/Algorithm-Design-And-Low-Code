/**
 *
 */
package sort_���򷽷�;

/**
 * @author ����(����)
 *  ѡ��������
 */
public class ZhiJieXuanZeSort {
	/*
	 * ֱ��ѡ������
	 */

	public static void swap(int[] a,int i,int j) {
		if(i==j) {
			return;
		}
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
	}
	public static void selectSort(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			int minIndex=i;//��¼��Сֵ������
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
					/*
					 * �������Ԫ��ֵС����Сֵ,��j��ֵ��minIndex
					 */
				}
			}
			if(minIndex!=i) {
				swap(a,i,minIndex);
			}
		}
	}
}
