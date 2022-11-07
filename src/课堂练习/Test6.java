/**
 *
 */
package 课堂练习;

import stopWatch_计时器.StopWatch;

/**
 * @author 柳和(本地)
 *
 */
public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		StopWatch s = new StopWatch();
		s.start();
//		int a[] = RandomGenerator.uniformInts(100000000);
	}

	// 自顶向下归并排序核心算法
	public static void mergeSort(int low, int high, int a[]) {
		if (low < high) {
			// 分解
			int mid = (low + high) / 2;
			// 递归地对左边排序
			mergeSort(low, mid, a);
			// 递归地对右边排序
			mergeSort(mid + 1, high, a);
			merge(low, mid, high, a);// 将两个有序序列合并为一个有序序列一
		}
	}

	// 合并两个序列
	public static void merge(int low, int mid, int high, int a[]) {
		// 建立转存数组
		int b[] = new int[a.length];
		int f = low, s = mid + 1, p = low;
		// f为第一个数组索引，s为第二个数组索引，p为b数组索引
		while (f <= mid && s <= high) {
			// 在两个数组元素中值小的一方放入b数组
			if (a[f] <= a[s]) {
				b[p] = a[f];
				f++;
			} else {
				b[p] = a[s];
				s++;
			}
			p++;
		}

		if (f == mid + 1) {
			/* 若第一个数组中的元素全部存储进去了，那么将第二个数组中的剩余元素全部放入b数组 */
			for (; s <= high && p <= high; p++, s++) {
				b[p] = a[s];
			}
		} else {
			// 否则将第一个数组中的元素全部放入b数组
			for (; f <= mid && p <= high; p++, f++) {
				b[p] = a[f];
			}
		}
		for (int i = low; i <= high; i++)
			a[i] = b[i];
	}

}
