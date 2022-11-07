/**
 *
 */
package sort_排序方法;

/**
 * @author 柳和(本地)
 *  插入类排序
 */
public class XiErSort {
	/*
	 * 希尔排序
	 */
	public static void shellSort(int[] a) {
		int h = 1;// 计算出最大的h值

		while (h <= a.length / 3) {
			// 使用Knuth增量序列
			h = h * 3 + 1;
		}
		while (h > 0) {
			for (int i = h; i < a.length; i++) {
				if (a[i] < a[i - h]) {
					int tmp = a[i];
					int j = i - h;
					while (j >= 0 && a[j] > tmp) {
						a[j + h] = a[j];
						j -= h;
					}
					a[j + h] = tmp;
				}
			}
			// 计算出下一个h值
			h = (h - 1) / 3;
		}
	}
}
