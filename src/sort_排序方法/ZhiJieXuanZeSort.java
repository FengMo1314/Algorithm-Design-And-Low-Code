/**
 *
 */
package sort_排序方法;

/**
 * @author 柳和(本地)
 *  选择类排序
 */
public class ZhiJieXuanZeSort {
	/*
	 * 直接选择排序
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
			int minIndex=i;//记录最小值的索引
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[minIndex]) {
					minIndex=j;
					/*
					 * 若后面的元素值小于最小值,将j赋值给minIndex
					 */
				}
			}
			if(minIndex!=i) {
				swap(a,i,minIndex);
			}
		}
	}
}
