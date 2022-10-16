/**
 * 
 */
package 课堂练习.other;

/**
 * @author 柳和(本地)
 *
 */
public class ZhiJieChaRuSort {
	/*
	 * 直接插入排序方法实现整型数据元素排序
	 */
	public static void insertSort(int a[]) {
		//n个元素进行n-1次插入操作,i表示前面i个已经有序
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j;
			if (a[i] < a[i - 1]) {
				/*
				 * 当前a[i]元素应该在已经排好序的序列中间
				 */
				for (j = i - 1; j >= 0 && a[j] > temp; j--) {
					//找a[i]应该合适的位置,找到比其小的第一个元素位置
					a[j + 1] = a[j];//元素依次向后移动
					}
				//j当前就是比a[i]小的第一个元素的下标
					a[j + 1] = temp;
				}
			}
	}

}
